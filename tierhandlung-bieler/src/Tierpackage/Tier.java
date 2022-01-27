package Tierpackage;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class Tier {                      //oder abstract class
	private String art;
	private String name;
	private float groesse;
	private float gewicht;
	private boolean satt;
	private String gebDatum;
	private String farbe;
	//private Tier[] tierListe;
	private String rasse;
	private boolean entwurmt;
	private String[] kommandos;
	private float salzgehalt;
	private boolean hauskatze;
	private boolean verkauft;
	
	public Tier(String art, float groesse, float gewicht, boolean satt, String gebDatum, String farbe) {
	//public Tier(String art, String name, float groesse, String farbe) {
		super();
		this.art = art;
		//this.name = name;
		this.groesse = groesse;
		this.gewicht = gewicht;
		this.satt = satt;
		this.gebDatum = gebDatum;
		this.farbe = farbe;
		//this.rasse = rasse;
		//this.entwurmt = entwurmt;
		//this.kommandos = kommandos;
		//this.salzgehalt = salzgehalt;
		//this.hauskatze = hauskatze;
		//this.verkauft = verkauft;
		//this.tierListe = new Tier[100];
		
		//DateFormat formatter = new SimpleDateFormat("dd.mm.yyyy");
		
		//try {
			//gebDatum = formatter.parse("1.1.2000"); //sinn erfragen
		//}catch (ParseException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
		//}
	}
	
	public String getArt() {
		return art;
	}
	public void setArt(String art) {
		this.art = art;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public float getGroesse() {
		return groesse;
	}
	public void setGroesse(float groesse) {
		this.groesse = groesse;
	}
	
	public float getGewicht() {
		return gewicht;
	}
	public void setGewicht(float gewicht) {
		this.gewicht = gewicht;
	}
	
	public boolean getSatt() {
		return satt;
	}
	public void setSatt(boolean satt) {
		this.satt = satt;
	}
	
	public String getGebDatum() {
		return gebDatum;
	}
	public void setGebDatum(String gebDatum) {
		this.gebDatum =  gebDatum;
	}
	
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
	public String getRasse() {
		return rasse;
	}
	public void setRasse(String rasse) {
		this.rasse = rasse;
	}
	
	public boolean getEntwurmt() {
		return entwurmt;
	}
	public void setEntwurmt(boolean entwurmt){
		 this.entwurmt = entwurmt;
	}
	
	public String[] getKommandos(){
		return kommandos;
	}
	
	public void setKommandos(String[] kommandos) {
		this.kommandos = kommandos;
	}
	
	public boolean getHauskatze() {
		return hauskatze;
	}
	public void setHauskatze(boolean hauskatze){
		 this.hauskatze = hauskatze;
	}
	
	public float getSalzgehalt() {
		return salzgehalt;
	}
	public void setSalzgehalt(float salzgehalt){
		 this.salzgehalt = salzgehalt;
	}
	
	public boolean getVerkauft() {
		return verkauft;
	}
	public void setVerkauft(boolean verkauft){
		 this.verkauft = verkauft;
	}
	
	
	public boolean fuettern() {
		if(this.getSatt()) {
			return false;
		} else {
			System.out.println("Bitte das Tier namens " + this.getName() +" füttern");
			return true;
		}
	}
	
	
	//public void schlafen() {
		//if(this.getName() != )
		//Licht aus
	//}
	
	public int beschäftigen() {
		int beschäftigungswert;
		
		//Beschäftigungsprozedur (errechnet Beschäftigungswert)
		beschäftigungswert = 5;
		
		return beschäftigungswert;	
	}
	
	public boolean verkauft() {
		if(this.getVerkauft()) {
			return false;
		}else {
			System.out.println("Das Tier: " + this.getName() +" wurde verkauft");
		return true;	
	}
	}

}




























