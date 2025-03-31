package canard.applicaton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import canard.model.Canard;
import canard.model.Colvert;
import canard.model.PrototypeCanard;
import canard.model.vol.PropulsionAReaction;

public class Client {

	public static void main(String[] args) {
		Canard colvert = new Colvert("Piero");
		Canard prototype = new PrototypeCanard("Etienne");
		
		System.out.println(colvert.afficher());		
		System.out.println(colvert.nager());
		System.out.println(colvert.effectuerCancan());
		System.out.println(colvert.effectuerVol());
		System.out.println("");
		System.out.println(prototype.afficher());
		System.out.println(prototype.effectuerVol());
		prototype.changerComportementVol(new PropulsionAReaction());
		System.out.println(prototype.effectuerVol());

	}

}
