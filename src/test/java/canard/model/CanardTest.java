package canard.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import canard.model.cancan.Coincoin;
import canard.model.vol.NePasVoler;
import canard.model.vol.PropulsionAReaction;

class CanardTest {
	private static final String NAGER = "Tous les canards flottent, même les leurres!";

	private static final String VOLER = "Je vole !";
	private static final String NE_PAS_VOLER = "Je ne sais pas voler";

	private static final String CANCAN = "Can-can";
	private static final String COINCOIN = "Coin-coin";
	private static final String SILENCE = "..[silence]..";

	Canard colvert;
	Canard leurre;
	Canard mandarin;
	Canard canardPlastique;

	@BeforeEach
	private void extracted() {
		colvert = new Colvert("Piero");
		leurre = new Leurre("Danny");
		mandarin = new Mandarin("Oshidori");
		canardPlastique = new CanardEnPlastique("Rubber");
	}

	@Test
	public void test_effectuerVol() {
		String texteVolColvert = colvert.effectuerVol();
		assertEquals(VOLER, texteVolColvert);
		assertEquals(VOLER, mandarin.effectuerVol());
		assertEquals(NE_PAS_VOLER, leurre.effectuerVol());
		assertEquals(NE_PAS_VOLER, canardPlastique.effectuerVol());
	}

	@Test
	public void test_effectuerCancan() {
		assertEquals(CANCAN, colvert.effectuerCancan());
		assertEquals(CANCAN, mandarin.effectuerCancan());
		assertEquals(SILENCE, leurre.effectuerCancan());
		assertEquals(COINCOIN, canardPlastique.effectuerCancan());
	}

	@Test
	public void test_nager() {
		assertEquals(NAGER, colvert.nager());
		assertEquals(NAGER, mandarin.nager());
		assertEquals(NAGER, leurre.nager());
		assertEquals(NAGER, canardPlastique.nager());
	}

	@Test
	public void test_presentation_nom_et_afficher() {
		assertEquals("Piero", colvert.nom());
		assertEquals("Je suis un vrai colvert", colvert.afficher());

		assertEquals("Oshidori", mandarin.nom());
		assertEquals("Je suis un vrai mandarin", mandarin.afficher());

		assertEquals("Danny", leurre.nom());
		assertEquals("Je suis un leurre", leurre.afficher());

		assertEquals("Rubber", canardPlastique.nom());
		assertEquals("Je suis un canard en plastique", canardPlastique.afficher());
	}
	
	@Test
	public void changeCorectementDeComportementVol() {	
		colvert.changerComportementVol(new NePasVoler());
		assertEquals(NE_PAS_VOLER,colvert.effectuerVol());
	}
	
	@Test
	public void changeCorectementDeComportementCancan() {	
		colvert.changerComportementCancan(new Coincoin());
		assertEquals(COINCOIN,colvert.effectuerCancan());
	}
	
	@Test
	public void testBonFonctionnementAjoutPrototypeEtPropulsion() {
		assertEquals("Je suis un vrai colvert", colvert.afficher());		
		assertEquals(NAGER, colvert.nager());
		assertEquals(CANCAN, colvert.effectuerCancan());
		assertEquals(VOLER, colvert.effectuerVol());
		
		Canard prototype = new PrototypeCanard("Etienne");
		assertEquals("Je suis un prototype de canard", prototype.afficher());
		assertEquals("Je vole avec un réacteur !",prototype.effectuerVol());
		prototype.changerComportementVol(()->"Je vole avec un engin à propulsion !");
		assertEquals("Je vole avec un engin à propulsion !", prototype.effectuerVol());
	}

}