package Tierpackage;

import java.text.SimpleDateFormat;

public class Hund extends Tier{
	public String rasse;
	boolean entwurmt;
	//public String[] kommandos;
	
	//art, name, groesse, gewicht, satt, gebDatum, farbe
	
	public Hund(String art, String name, float groesse, float gewicht, boolean satt, String gebDatum, String farbe, String rasse, boolean entwurmt){
		super( art, groesse, gewicht, satt, gebDatum, farbe);
		this.rasse = rasse;
		this.entwurmt = entwurmt;
		//this.kommandos = new String[5];
	}
	
	public String getRasse() {
		return rasse;
	}
	public void setRasse(String rasse){
		 this.rasse = rasse;
	}
	
	public boolean getEntwurmt() {
		return entwurmt;
	}
	public void setEntwurmt(boolean entwurmt){
		 this.entwurmt = entwurmt;
	}
	
	//public String[] getKommandos(){
		//return kommandos;
	//}
	
	//public void setKommandos(String[] kommandos) {
		//this.kommandos = kommandos;
	//}
	public void entwurmen() {
		if(entwurmt) {
			System.out.println(this.getName() + " muss nicht entwurmt werden.");
		} else {
			System.out.println(this.getName() + " entwurmen!");
			entwurmt = true;
		}
	}
	
	public boolean fuettern() {
		if(this.getSatt()) {
			return false;
		} else {
			System.out.println("Bitte den Hund namens " + this.getName() +" füttern");
			return true;
		}
	}
	
}
