package canard.model;

import canard.model.vol.ComportementVol;

public class Canard {
	protected String nom;
	protected ComportementVol comportementVol;
	
	protected Canard(String nom, ComportementVol comportementVol) {
		this.nom=nom;
		this.comportementVol=comportementVol;
	}
	
	public String nager() {
		return "Tous les canards flottent, même les leurres ";
	}
	
	public String afficher() {
		return "Je suis un canard ! ";
	}
	
	public String effectuerVol() {
		return comportementVol.voler();
	}

	public String nom() {
		return nom;
	}

}
