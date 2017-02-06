package poo.iccbxl.be;

public class ListeElectorale {

	private int id;
	private String nom;
	private int voix;
	private int sieges;
	private boolean elimine;
	
	public ListeElectorale() {
		
	}
	
	public ListeElectorale(int id, String nom, int voix, int sieges, boolean elimine) throws ElectionsException {
		this.setId(id);
		this.setNom(nom);
		this.setVoix(voix);
		this.setSieges(sieges);
		this.setElimine(elimine);
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) throws ElectionsException {
		if (id < 1) {
			throw new ElectionsException("ID >= 1");
		}
		else {
			this.id = id;
		}
	}
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) throws ElectionsException {
		if (nom.equals(null)) {
			throw new ElectionsException("Entrez un nom");
		}
		else {
			this.nom = nom;
		}
	}
	
	public int getVoix() {
		return voix;
	}
	
	public void setVoix(int voix) throws ElectionsException {
		this.voix = voix;
	}
	
	public int getSieges() {
		return sieges;
	}
	
	public void setSieges(int sieges) throws ElectionsException {
		this.sieges = sieges;
	}
	
	public boolean isElimine() {
		return elimine;
	}
	
	public void setElimine(boolean elimine) {
		this.elimine = elimine;
	}
}
