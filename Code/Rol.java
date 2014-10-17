package java;

public interface Rol {

	private boolean verdedig;

	public abstract void maakAanval(Speelvak aanvalVak);

	public abstract void verlaagLevensPunten(int aantal);

	public abstract void maakKus(Wezen kusser, Speelvak vakjeVanKus);

	public abstract void create(Wezen kusser, Speelvak vakjeVoorKus);

	public abstract void create(Wezen verdediger, double tijdVoorVerdediging);

	public abstract void beweeg(Speelvak doelVak);

}
