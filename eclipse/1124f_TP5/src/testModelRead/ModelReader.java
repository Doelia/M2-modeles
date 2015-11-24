package testModelRead;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class ModelReader {

	private Resource resource;
	private EPackage BasePackage;
	private String racine;

	public ModelReader(String str, String racine) {

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("ecore", new XMIResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();
		URI fileURI = URI.createFileURI(str);
		Resource resource = resourceSet.getResource(fileURI, true);

		this.resource = resource;

		EPackage c = (EPackage) resource.getContents().get(0);

		this.BasePackage = c;
		this.racine = racine;

	}

	public Resource getModelResource() {
		return this.resource;
	}

	public EPackage getModelPackage() {
		return this.BasePackage;
	}
	
	public EClass getClassByName(String classeName) {
		for (EClassifier c : this.getModelPackage().getEClassifiers()) {
			if (c instanceof EClass) {
				if (c.getName().equals(classeName)) {
					return (EClass) c;
				}
			}
		}
		System.out.println("Classe "+classeName+" introuvable");
		return null;
	}
	
	public List<EClass> getContreteClasses() {
		ArrayList<EClass> list = new ArrayList<EClass>();
		for (EClassifier c : this.getModelPackage().getEClassifiers()) {
			if (c instanceof EClass) {
				EClass cc = (EClass) c;
				if (cc.isAbstract()) {
					list.add(cc);
				}
			}
		}
		return list;
	}
	
	public List<EAttribute> getAllAttributesFromClass(EClass c) {
		return new ArrayList<EAttribute>(c.getEAllAttributes());
	}
	
	public List<EReference> getAllReferencesFromClass(EClass c) {
		return new ArrayList<EReference>(c.getEAllReferences());
	}
	
	public List<EClass> getAllConcreteSubClasses(EClass c) {
		ArrayList<EClass> list = new ArrayList<EClass>();
		for (EClass cc : c.getESuperTypes()) {
			list.add(cc);
			list.addAll(this.getAllConcreteSubClasses(cc));
		}
		return list;
	}
	
	public List<EClass> getTargetTypeReferences(EClass c) {
		ArrayList<EClass> list = new ArrayList<EClass>();
		for (EReference r : this.getAllReferencesFromClass(c)) {
			if (r.getEType() instanceof EClass) {
				list.add((EClass) r.getEType());
			}
		}
		return list;
	}

}
