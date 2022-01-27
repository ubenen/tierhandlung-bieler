package Tierpackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	private String name;
	private Adresse adresse;
	private SimpleDateFormat gebDatum;
	private Tier[] gekaufteTiere;
	
	public Person(String name, Adresse adresse, SimpleDateFormat gebDatum, Tier[] gekaufteTiere) {
		super();
		this.name = name;
		this.adresse = adresse;
		this.gebDatum = gebDatum;
		this.gekaufteTiere = new Tier[100];
		
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	public SimpleDateFormat getGebDatum() {
		return gebDatum;
	}
	public void setGebDatum(SimpleDateFormat gebDatum) {
		this.gebDatum = gebDatum;
	}
	
	public Tier[] getGekaufteTiere() {
		return gekaufteTiere;
	}
	public void setGekaufteTiere(Tier[] gekaufteTiere) {
		this.gekaufteTiere = gekaufteTiere;
	}
	
	//public String getAdresseString() {
		//return adresse.getStrasse() + " " ;
	//}

}
