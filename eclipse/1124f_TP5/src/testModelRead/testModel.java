package testModelRead;

import org.eclipse.emf.ecore.EClass;

public class testModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ModelReader reader = new ModelReader("model/maps.ecore", "map");
		
		EClass c = reader.getClassByName("Pedestrian");
		//System.out.println(reader.getAllConcreteSubClasses(c));
		System.out.println(reader.getTargetTypeReferences(c));
		//System.out.println(reader.getAllAttributesFromClass(c));
		//System.out.println(reader.getContreteClasses());
		
		//System.out.println(reader.getModelPackage().getName());
		
	}
	
	

}
