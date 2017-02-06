package poo.iccbxl.be;

public class MainElections {
	public static void main(String[] args) throws ElectionsException {
		
		ListeElectorale listeA = new ListeElectorale(1,"A", 32000, 2, false);
		ListeElectorale listeB = new ListeElectorale(2,"B", 25000, 2, false);
		ListeElectorale listeC = new ListeElectorale(3,"C", 16000, 1, false);
		ListeElectorale listeD = new ListeElectorale(4,"D", 12000, 1, false);
		ListeElectorale listeE = new ListeElectorale(5, "E", 8000, 0, true);
		ListeElectorale listeF = new ListeElectorale(6, "F", 4500, 0, true);
		ListeElectorale listeG = new ListeElectorale(7, "G", 2500, 0, true);
		
		
		System.out.println(listeA.getVoix());
		System.out.println(listeD.getVoix());
		
		
	}
}
