package canard.model;

import canard.model.vol.*;
import canard.model.cancan.*;

public class PrototypeCanard extends Canard{

	public PrototypeCanard(String nom) {
		super(nom, new PropulsionAReaction(), new CanardMuet());
	}

	@Override
	public String afficher() {
		return "Je suis un prototype de canard";
	}
	
	public String nom() {
		return nom;
	}
}
