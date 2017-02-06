package prElectionsMouloud_step2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import poo.iccbxl.be.ElectionsException;
import poo.iccbxl.be.ListeElectorale;

public class ListeElectoraleTest {

	@Test
	public void testListeElectorale() throws ElectionsException {
		ListeElectorale listeA = new ListeElectorale(1,"A", 32000, 2, false);
		assertEquals(32000, listeA.getSieges());
		assertEquals(2, listeA.getSieges());
		assertFalse(listeA.isElimine());
		
		ListeElectorale listeF = new ListeElectorale(6, "F", 4500, 0, true);
		assertEquals("F", listeF.getNom());
		assertEquals(4500, listeF.getVoix());
		assertTrue(listeA.isElimine());
		
	}
	
	@Test
	public void testSetNom() throws ElectionsException {
		ListeElectorale listeB = new ListeElectorale(2," ", 4500, 0, true);
		assertNull(listeB.getNom());
		ListeElectorale listeD = new ListeElectorale(4,"D", 12000, 1, false);
		assertNotNull(listeD.getNom());
		
	}
	@Test
	public void testSetId() throws ElectionsException {
		ListeElectorale listeD = new ListeElectorale(4,"F", 12500, 1, false);
		assertEquals(4, listeD.getId());
		
	}



}
