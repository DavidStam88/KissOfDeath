package java;

import java.util.Observable;

public class Wezen extends Observable {

	private int levenspunten;

	private int energie;

	private int kracht;

	private String type;
	
	private Rol kikker;
	private Rol monster;
	private Rol toeschouwer;
	private Rol spelende;
	
	private Rol rol;
	
	private void maakBoodschap(String boodschap) {

	}

	private void maakAanval(Speelvak aanvalVak) {

	}

	public void setRol(String rol){
		switch(rol){
		case "Kikker":
		rol = new Kikker();
		break;
		case "Spelende":
		rol = new Spelende();
		break;
		case "Monster": 
		rol = new Monster();
		break;
		case "Toeschouwer":
		rol = new Toeschouwer();
		break;
	}
	private void verlaagEnergie(int energieKosten) {

	}

	private void verlaagLevensPunten(int aantal) {

	}

	private boolean checkOfDood() {
		return false;
	}

	private boolean checkOfVerdedigt() {
		return false;
	}

	private void verwijderSpelKarakter(Wezen wezen) {

	}

	private void verwijderVanSpeelvak() {

	}

	private void telSpelendeWezens() {

	}

	private void maakKus(Wezen kusser, Speelvak vakjevanKusser) {

	}

	private SpelRegels getInstance() {
		
      return null;
	}

	private int getLevenspuntenVoorKus() {
		return 0;
	}

	private void maakVerdediging() {

	}

	private int getEnergieVoorVerdediging() {
		return 0;
	}

	private void beweeg(Speelvak doelVak) {

	}

	private void setPositie(Speelvak doelVak) {

	}

	private void kiesBestemming(SpeelvakLijst bestemmingLijst) {

	}

}
