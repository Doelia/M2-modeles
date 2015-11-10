package test;

import org.eclipse.emf.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;

import uml.Model;
import uml.UmlFactory;
import uml.UmlPackage;

public class testSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Je charge l'instance map.xmi du méta-modèle maps.ecore
		Resource resource = chargerModele("model/tp3.uml", UmlPackage.eINSTANCE);
		if (resource == null) System.err.println(" Erreur de chargement du modèle");
		
		
		//Instruction récupérant le modèle sous forme d'arbre à partir de la classe racine "Model"
		Model umlP = (Model) resource.getContents().get(0);
		
		
		String nomModele=  umlP.getName();
		
		System.out.println("Ton modèle se nomme: \""+nomModele+"\"");
		
		
		//Modifier le nom du modèle UML
		umlP.setName("NewModel");
		System.out.println("\""+nomModele+"\" Changé ! Le modèle se nomme: \""+umlP.getName()+"\"");
		
		
		//Sauvergarder le modèle avec son nouveau nom
		sauverModele("model/changerNom.xmi", umlP);
		
	}
	
	
	public static void sauverModele(String uri, EObject root) {
		   Resource resource = null;
		   try {
		      URI uriUri = URI.createURI(uri);
		      Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		      resource = (new ResourceSetImpl()).createResource(uriUri);
		      resource.getContents().add(root);
		      resource.save(null);
		   } catch (Exception e) {
		      System.err.println("ERREUR sauvegarde du modèle : "+e);
		      e.printStackTrace();
		   }
		}

		public static Resource chargerModele(String uri, EPackage pack) {
		   Resource resource = null;
		   try {
		      URI uriUri = URI.createURI(uri);
		      Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("uml", new XMIResourceFactoryImpl());
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
