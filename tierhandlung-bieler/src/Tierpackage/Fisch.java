package Tierpackage;

public class Fisch extends Tier{
	float salzgehalt;
	//int wert;
	
	public Fisch(String art, String name, float groesse, float gewicht, boolean satt, String gebDatum, String farbe, float salzgehalt){
		super( art, groesse, gewicht, satt, gebDatum, farbe);
		this.salzgehalt = salzgehalt;
		//this.kommandos = new String[5];
	}
	
	public float getSalzgehalt() {
		return salzgehalt;
	}
	public void setSalzgehahlt(float salzgehalt){
		 this.salzgehalt = salzgehalt;
	}
	
	public void salzgehalt(){
		int wert = 0;
		if(wert >= 5) {
			System.out.println("Der Salzgehalt liegt bei über 5g/l");
		}else {
			System.out.println("Der Salzgehalt liegt bei unter 5g/l, bitte prüfen");
		}
	}
	
}