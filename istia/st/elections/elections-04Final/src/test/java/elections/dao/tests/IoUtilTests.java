package elections.dao.tests;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import elections.dao.entities.ListeElectorale;
import elections.dao.service.IoUtil;

public class IoUtilTests {
	
	@BeforeClass
	public static void avantTests() {
		System.out.println("------------------------");
		System.out.println("Avant Tests");
		System.out.println("------------------------");
		
		List<ListeElectorale> listes = new ArrayList<ListeElectorale>();
		ListeElectorale l1 = new ListeElectorale(1, "A", 2000, 5, false);
		ListeElectorale l2 = new ListeElectorale(2, "B", 1000, 2, false);
		listes.add(0,l1);
		listes.add(1,l2);
		String fileName = "listes.xml";
		String logFileName = "elections-log";
		Path path = Paths.get(fileName, null);
	}
		
	
	
	@AfterClass
	public static void apresTests() {
		
		System.out.println("------------------------");
		System.out.println("Fin du Test");
		System.out.println("------------------------");

	}
	
	@Test
	public void saveListToFileTest() throws IOException { 
		
		List<ListeElectorale> listes = new ArrayList<ListeElectorale>();
		String str = null;

		System.out.println(listes.toString());
		System.out.println("Ecriture des listes dans le fichier \"listes2.xml\"");
		assertTrue(IoUtil.saveListesToFile(listes));
		
		Path path = Paths.get("listes10.xml");
		assertTrue("Fichier n'existe pas", Files.exists(path, LinkOption.NOFOLLOW_LINKS));
		BufferedReader bf = Files.newBufferedReader(path);
		str = new String(Files.readAllBytes(Paths.get("listes10.xml")));
		assertFalse("Le fichier est vide", str.isEmpty());
		Files.delete(path);
		assertFalse("Fichier existe", Files.exists(path, LinkOption.NOFOLLOW_LINKS));
		
		
	}

	private void assertTrue(String string, boolean exists) {
		// TODO Auto-generated method stub
		
	}



	private void assertTrue(boolean[] saveListesToFile) {
		// TODO Auto-generated method stub
		
	}



	@Test
	public void getStringFromFileTest(){
		
		System.out.println("\n\n***getStringFromFileTest(), Start...***\n\n");
		
		String str = IoUtil.getStringFromFile("listes10.xml");
		System.out.println("\n#R�cup�ration des listes avec getStringFromFile...\n");
		assertFalse("Fichier non vide", str.length() == 0);
		System.out.println(str);
		System.out.println("\n\n***getStringFromFileTest(), End...***\n\n");
		
		String strvide = IoUtil.getStringFromFile("mauvais.xml");
		assertTrue("Fichier vide", str.length() == 0);
		
	}
	
	@Test
	public void convertFromXmlTest(){
		

		ListeElectorale l3 = new ListeElectorale(1, "C", 2000, 5, false);
		ListeElectorale l4 = new ListeElectorale(2, "D", 1000, 2, false);
		List<ListeElectorale> listesOrigin = new ArrayList<ListeElectorale>();
		listesOrigin.add(0, l3);
		listesOrigin.add(1, l4);
		System.out.println("\n\n***convertFromXmlTest() : SAUVEGARDE DES LISTES***\n");
		IoUtil.saveListesToFile(listesOrigin);
		
		System.out.println("\n\n*Récupération des listes dans \"String xml\"*\n");
		String xml = IoUtil.getStringFromFile("listes3.xml");
		System.out.println("\n*String récupéré : \n"+xml+"\n\n");
		
		List<ListeElectorale> listesDest = new ArrayList<ListeElectorale>();
		
		System.out.println("*Conversion du \"String xml\" vers listeDest");
		listesDest = IoUtil.convertFromXml(xml);
		System.out.println(listesDest.toString());
	}
	

}
