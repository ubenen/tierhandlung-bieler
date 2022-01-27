package Tierpackage;

import java.text.SimpleDateFormat;

public class Katze extends Tier{
	public String rasse;
	boolean entwurmt;
	boolean hauskatze;
	
	public Katze (String art, String name, float groesse, float gewicht, boolean satt, String gebDatum, String farbe, String rasse, boolean entwurmt, boolean hauskatze){
		//String art, float groesse, float gewicht, boolean satt, String gebDatum, String farbe
		super(art,  groesse, gewicht, satt, gebDatum, farbe);                            // diese sind schon methodiert in tier.java
		this.rasse = rasse;
		this.entwurmt = entwurmt;                          // diese kommen hier in katze dazu
		this.hauskatze = hauskatze;
	}
	
	public String getRasse() {
		return rasse;
	}
	public void setRasse(String rasse){
		 this.rasse = rasse;
	}
	
	public boolean getHauskatze() {
		return hauskatze;
	}
	public void setHauskatze(boolean hauskatze){
		 this.hauskatze = hauskatze;
	}
	
	public boolean getEntwurmt() {
		return entwurmt;
	}
	public void setEntwurmt(boolean entwurmt){
		 this.entwurmt = entwurmt;
	}
	
	public boolean fuettern() {
		if(this.getSatt()) {
			return false;
		} else {
			System.out.println("Bitte die Katze namens " + this.getName() +" füttern");
			return true;
		}
	}
	
	public void entwurmen() {
		if(entwurmt) {
			System.out.println(this.getName() + " muss nicht entwurmt werden.");
		} else {
			System.out.println(this.getName() + " entwurmen!");
			entwurmt = true;
		}
	}
	
	public boolean hauskatze() {
		if(this.hauskatze) {
			return false;
		} else{
			System.out.println("Hauskatze");
			return false;
		}
	}

}
