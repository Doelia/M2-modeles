package test;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;

import maps.Boulevard;
import maps.MapsPackage;
import maps.Pedestrian;
import maps.Road;
import maps.Square;
import maps.map;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generat ed method stub

		
		//Je charge l'instance map.xmi du méta-modèle maps.ecore
		Resource resource = chargerModele("model/map.xmi", MapsPackage.eINSTANCE);
		if (resource == null) System.err.println(" Erreur de chargement du modèle");
		
		
		//Instruction récupérant le modèle sous forme d'arbre à partir de la classe racine "map"
		map maMap = (map) resource.getContents().get(0);
		
		
						
		System.out.println(maMap.getName());
		
		displayStreets(maMap);
		getGrandesRuesPietonne(maMap);
		//getRouteAdjacentes(maMap.get);
				
		
	}
	
	public static void displayStreets(map map) {
		System.out.println("Liste des routes :");
		for (Road r : map.getRoads()) {
			System.out.println(r.getName());
		}
	}
	
	public static void getGrandesRuesPietonne(map map) {
		System.out.println("Liste des grandes rues pietonnes :");
		for (Road r : map.getRoads()) {
			if (r instanceof Pedestrian) {
				if (r.getLength() > 1000) {
					System.out.println(r);
				}
			}
		}
	}
	
	public static void getRouteAdjacentes(Boulevard b) {
		System.out.println("List des routes adjacentes");
		for (Road r : b.getMeet()) {
			System.out.println(r);
		}
	}
	
	public static void getRoutesBordant(Square q) {
		System.out.println("Liste des routes bordants la place "+q.getName());
		for (Road r : q.getBorderedBy()) {
			System.out.println(r);
		}
	}
	
	
	public static Resource chargerModele(String uri, EPackage pack) {
		   Resource resource = null;
		   try {
		      URI uriUri = URI.createURI(uri);
		      Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		      resource = (new ResourceSetImpl()).createResource(uriUri);
		      XMLResource.XMLMap xmlMap = new XMLMapImpl();
		      xmlMap.setNoNamespacePackage(pack);
		      java.util.Map options = new java.util.HashMap();
		      options.put(XMLResource.OPTION_XML_MAP, xmlMap);
		      resource.load(options);
		   }
		   catch(Exception e) {
		      System.err.println("ERREUR chargement du modèle : "+e);
		      e.printStackTrace();
		   }
		   return resource;
		}

}
