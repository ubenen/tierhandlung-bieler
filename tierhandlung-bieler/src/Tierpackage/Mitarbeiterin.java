package Tierpackage;

import java.text.SimpleDateFormat;

public class Mitarbeiterin extends Person{
	
	private double gehalt;
	private Mitarbeiterin maNext;
		
	public Mitarbeiterin(String name, Adresse adresse, SimpleDateFormat gebDatum, double gehalt) {
		super(name, adresse, gebDatum, new Tier[100]);  
		this.gehalt = gehalt;
		this.maNext = null;
	}
	
	public Mitarbeiterin getMANext() {
		return maNext;
	}
	public void setMANext(Mitarbeiterin ma) {
		this.maNext = ma;
	}
	public void setMANextListe(Mitarbeiterin ma) {
		if(maNext == null) {
			maNext = ma;
		} else { 
			maNext.setMANextListe(ma);
		}
		System.out.println("Methode beendet " + this.getName());
	}
	
	public double getGehalt() {
		return gehalt;
	}
	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}

}
