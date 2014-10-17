package java;

public class SpelRegels {

	public int bewegenEnergieMinimum;

	public int bewegenEnergieKostenNormaal;

	public int bewegenEnergieKostenVak;

	public int bewegenEnergieKostenVakGat;

	public int bewegenEnergieKostenVakDeuropening;

	public int bewegenEnergieKostenAttribuut;

	public int snelBewegenEnergieKosten;

	public int levensPuntenKostenKussen;

	public int startKrachtStrijder;

	public int startEnergieStrijder;

	public int startKrachtDwerg;

	public int startEnergieDwerg;

	public int startKrachtElf;

	public int startEnergieElf;

	public int tijdAanvallen;

	public int tijdVerdedigen;

	public int tijdVitamine;

	public int vitaminePercentage;
	
	private Spelregels spelregel_instance;
	
	public static synchronized SpelRegels getInstance() {
   if (spelregel_instance == null) {
     spelregel_instance = new SpelRegels();
   }
   return spelregel_instance;
}


}
