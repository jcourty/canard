package canard.model;

public class Colvert extends Canard{
	
	public Colvert(String nom) {
		super(nom);
	}
	
	@Override
	public String afficher() {
		return "Je suis un vrai colvert ";
	}
	
	public String nom() {
		return nom;
	}
}
