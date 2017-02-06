package poo.iccbxl.be;

public class ElectionsException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ElectionsException() {
		System.out.println("Erreur");
	}
	
	public ElectionsException(String message) {
		super(message);
	}
	
	public ElectionsException(Throwable cause) {
		super(cause);
	}
	
	public ElectionsException(String message, Throwable cause) {
		super(message, cause);
	}
}
