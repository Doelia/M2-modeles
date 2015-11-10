package test;

import java.util.ArrayList;

import uml.Class;
import uml.DataType;
import uml.Model;
import uml.Operation;
import uml.Package;
import uml.PackageableElement;
import uml.Parameter;
import uml.Property;
import uml.Type;
import uml.VisibilityKind;
import uml.impl.UmlFactoryImpl;

public class Refactor {

	private Model m;
	
	public Refactor(Model m) {
		this.m = m;
	}
	
	public void deplacerClasse(String classeNom, String pack1Nom, String pack2Nom) {
		Package from = this.getPackage(pack1Nom);
		Package to = this.getPackage(pack2Nom);
		
		if (from == null || to == null) {
			System.out.println("Package introuvble");
			return;
		}
		
		Class e = getClassInPackage(from, classeNom);
		if (e == null) {
			System.out.println("Element introuvble dans le package");
		}                                                                                                                                                                                                                                       
		
		from.getPackagedElement().remove(e);
		to.getPackagedElement().add(e);
		
	}
	
	public void remplacerAttrAccess(String attr, String classeNom, String packNom) {
		Class cl = getClassInPackage(getPackage(packNom), classeNom);
		
		for (Property p : cl.getOwnedAttribute()) {
			if (p.getName().equals(attr)) {
				p.setVisibility(VisibilityKind.PRIVATE);
				
				DataType type = UmlFactoryImpl.eINSTANCE.createDataType();
				type.setName(p.getType().getName());
				
				{
					Operation o = UmlFactoryImpl.eINSTANCE.createOperation();
					o.setName("get"+p.getName());
					o.setDatatype(type);
					cl.getOwnedOperation().add(o);
				}
				
				{
					Operation o = UmlFactoryImpl.eINSTANCE.createOperation();
					o.setName("set"+p.getName());
					
					Parameter param = UmlFactoryImpl.eINSTANCE.createParameter();
					param.setType(p.getType());
					param.setName("var");
					o.getOwnedParameter().add(param);
					
					cl.getOwnedOperation().add(o);
				}
				
			}
		}
	}
	
	public void remonterOperation(String opNom, String classNom, String superCNom, String packNom) {
		Package p = getPackage(packNom);
		Class enfant = getClassInPackage(p, classNom);
		Class parent = getClassInPackage(p, superCNom);
		Operation op = getOperation(enfant, opNom);
		enfant.getOwnedOperation().remove(op);
		parent.getOwnedOperation().add(op);
	}
	
	/**
	 * méthode de réusinage qui remplace un attribut de type simple par un attribut ´
	objet. Si une classe A posséde un attribut x de type T, on créera une nouvelle classe X qui
	possédera un attribut x de type T, et la classe A possédera désormais un attribut x de type
	X.
	 */
	public void attributObjet(String attrNom, String classeNom, String packNom) {
		
		Package p = getPackage(packNom);
		Class classe = getClassInPackage(p, classeNom);
		
		Property attr = null;
		for (Property pr : classe.getOwnedAttribute()) {
			if (pr.getName().equals(attrNom)) {
				attr = pr;
			}
		}
		
		// Création de la nouvelle classe
		Class o = UmlFactoryImpl.eINSTANCE.createClass();
		o.setName(attr.getName().toUpperCase());
		
		Property newPR = UmlFactoryImpl.eINSTANCE.createProperty();
		newPR.setName(attr.getName());
		newPR.setType(attr.getType());
		o.getOwnedAttribute().add(newPR);
		
		p.getPackagedElement().add(o);
		
		Property newPRClass = UmlFactoryImpl.eINSTANCE.createProperty();
		newPRClass.setName(attr.getName());
		newPRClass.setType(o);
		classe.getOwnedAttribute().add(newPRClass);
		classe.getOwnedAttribute().remove(attr);
		
	}
	
	private Operation getOperation(Class c, String name) {
		for (Operation e : c.getOwnedOperation()) {
			if (e.getName().equals(name)) {
				return e;
			}
		}
		return null;
	}
	
	private Class getClassInPackage(Package p, String name) {
		for (PackageableElement e : p.getPackagedElement()) {
			if (e instanceof Class && e.getName().equals(name)) {
				return (Class) e;
			}
		}
		return null;
	}
	
	private Package getPackage(String name) {
		for (PackageableElement e : this.m.getPackagedElement()) {
			if (e instanceof Package && e.getName().equals(name)) {
				return (Package) e;
			}
		}
		return null;
	}
	
	
}
