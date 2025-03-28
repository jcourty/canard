package canard.model;

import canard.model.cancan.ComportementCancan;
import canard.model.vol.ComportementVol;

public class Canard {
	protected String nom;
	protected ComportementVol comportementVol;
	protected ComportementCancan comportementCancan;
	
	protected Canard(String nom, ComportementVol comportementVol, ComportementCancan comportementCancan) {
		this.nom=nom;
		this.comportementVol=comportementVol;
		this.comportementCancan=comportementCancan;
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
	
	public String effectuerCancan() {
		return comportementCancan.cancaner();
	}

	public String nom() {
		return nom;
	}

}
