package canard.model;

public class Canard {
	protected String nom;
	
	protected Canard(String nom) {
		this.nom=nom;		
	}
	
	public String nager() {
		return "Tous les canards flottent, même les leurres ";
	}
	
	public String afficher() {
		return "Je suis un canard ! ";
	}

	public String nom() {
		return nom;
	}

}
