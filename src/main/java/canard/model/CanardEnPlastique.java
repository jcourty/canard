package canard.model;

public class CanardEnPlastique extends Canard{
	
	public CanardEnPlastique(String nom) {
		super(nom);
	}
	
	@Override
	public String afficher() {
		return "Je suis un canard en Plastique ";
	}
	
	public String nom() {
		return nom;
	}
}
