package test;

import java.util.ArrayList;

import uml.Association;
import uml.Behavior;
import uml.Class;
import uml.DataType;
import uml.Generalization;
import uml.Model;
import uml.Package;
import uml.PackageableElement;
import uml.Property;
import uml.Region;
import uml.State;
import uml.StateMachine;
import uml.Vertex;
import uml.impl.UmlFactoryImpl;

public class RefactorStateMachine {
	
	private Model m;
	
	public RefactorStateMachine(Model m) {
		this.m = m;
	}
	
	public void refactorInStateFactory() {
		System.out.println("Mise de toutes les classes dans un nouveau package...");
		this.putClassesInPackage();
		System.out.println("Transformation des classes en mode StatePattern");
		for (Class c : getAllClass()) {
			this.transformInStateFactory(c);
		}
	}
	
	private void transformInStateFactory(Class c) {
		
		Package p = getMainPackage();
		StateMachine m = this.getStateMachine(c);
		
		Class generaleState = UmlFactoryImpl.eINSTANCE.createClass();
		generaleState.setName("Abstract State");
		generaleState.setIsAbstract(true);
		p.getPackagedElement().add(generaleState);
		
		Class randomClass = null;
		for (State state : this.getAllStates(m)) {
			Class nClass = UmlFactoryImpl.eINSTANCE.createClass();
			nClass.setName("State "+state.getName());
			
			Generalization gen = UmlFactoryImpl.eINSTANCE.createGeneralization();
			gen.setGeneral(generaleState);
			nClass.getGeneralization().add(gen);
			
			// TODO créer les opérations
			
			p.getPackagedElement().add(nClass);
			randomClass = nClass;
		}
		
		// TODO mettre les autre bout des associations
		Association as = UmlFactoryImpl.eINSTANCE.createAssociation();
		as.setName("currentState");
		
		Property classeConcernee = UmlFactoryImpl.eINSTANCE.createProperty();
		classeConcernee.setName("classeConcernee");
		classeConcernee.setType(generaleState);
		as.getMemberEnd().add(classeConcernee);
		classeConcernee.setOwningAssociation(as);
		
		Property etatCourant = UmlFactoryImpl.eINSTANCE.createProperty();
		etatCourant.setName("etatCourant");
		etatCourant.setType(randomClass);
		as.getMemberEnd().add(etatCourant);
		etatCourant.setOwningAssociation(as);
		
		p.getPackagedElement().add(as);
		
	}
	
	public Package putClassesInPackage() {
		Package p = UmlFactoryImpl.eINSTANCE.createPackage();
		for (PackageableElement c : this.m.getPackagedElement()) {
			if (c instanceof Class) {
				p.getPackagedElement().add((Class) c);
			}
		}
		this.m.getPackagedElement().add(p);		
		return p;
	}
	
	private Package getMainPackage() {
		return getFirtPackaqe();
	}
	
	private ArrayList<Class> getAllClass() {
		ArrayList<Class> list = new ArrayList<Class>();
		for (PackageableElement c : this.getMainPackage().getPackagedElement()) {
			if (c instanceof Class) {
				list.add((Class) c);
			}
		}
		return list;
	}
	
	public Class getFirtClass() {
		try {
			return getAllClass().get(0);
		} catch (Exception e) {
			System.out.println("Aucune first classe trouvée");
			return null;
		}
	}
	
	private Package getFirtPackaqe() {
		for (PackageableElement e : this.m.getPackagedElement()) {
			System.out.println(e);
			if (e instanceof Package) {
				return (Package) e;
			}
		}
		System.out.println("Aucun package trouvé");
		return null;
	}
	
	private Class getFirstClassForPackage(Package p) {
		for (PackageableElement e : p.getPackagedElement()) {
			if (e instanceof Class) {
				return (Class) e;
			}
		}
		return null;
	}
	
	
	/**
	 * On considère qu'une classe ne peut avoir qu'une machine à état
	 * @param c
	 * @return
	 */
	public StateMachine getStateMachine(Class c) {
		for (Behavior e : c.getOwnedBehavior()) {
			if (e instanceof StateMachine) {
				return (StateMachine) e;
			}
		}
		return null;
	}
	
	public ArrayList<State> getAllStates(StateMachine m) {
		ArrayList<State> list = new ArrayList<State>();
		for (Region r : m.getRegion()) {
			for (Vertex v : r.getSubvertex()) {
				if (v instanceof State) {
					list.add((State) v);
				}
			}
		}
		return list;
	}

}
