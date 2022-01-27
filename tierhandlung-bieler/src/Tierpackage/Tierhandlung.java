package Tierpackage;

public class Tierhandlung {
	
	private String firmenname = "Tierhandlung Bieler";
	private String adresse = "Marie-Bautz-Weg";
	private int telefon = 12345;
	private Tier[] tierListe = new Tier[100];
	private Person[] personListe = new Person[100];
	private Mitarbeiterin maListeAnfang; 
	private boolean verkauft = false;
	
	public void verkauft(Tier verkaufstier) {
		boolean verkauft = false;
		if(verkauft  = true) {
			System.out.println(verkaufstier.getName() + " wurde verkauft");
		}else {
	
		}	
	boolean eingefügt = true;
	
	for(int index=0; index < tierListe.length; index++) {
		if(tierListe[index] == null) {
			tierListe[index] = verkaufstier;
			eingefügt = false;
			break;
		}else {
			if(!eingefügt) {
				System.out.println("Tier wurde nicht als verkauft markiert");
			}
		}
			}
		}
	
	public boolean getVerkauft() {
		return verkauft;
	}
	public void setVerkauft(boolean verkauft) {
		this.verkauft = verkauft;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public void setAdresse(String adresse) {
		 this.adresse = adresse;                       //prüfung ob echte adresse?
	}
	
	public String getFirmenname() {
		return firmenname;
	}
	
	public Tier[] getTierListe() {
		return tierListe;
	}
	
	public void setTierListe(Tier[] tierListe) {
		this.tierListe = tierListe;
	}
	
	public Person[] getPersonListe() {
		return personListe;
	} 
	
	public void setPersonListe(Person[] personListe) {
		this.personListe = personListe;
	}
	
	public void addTier(Tier neuesTier) {
		boolean eingefügt = true;
		
		for(int index=0; index < tierListe.length; index++) {
			if(tierListe[index] == null) {
				tierListe[index] = neuesTier;
				eingefügt = false;
				break;
			}
		}
		
		if(!eingefügt) {
			System.out.println("Tier wurde nicht hinzugefügt. Zu wenig Platz.");
		}
	}
	
	public void entferneTier(int index) {
		//index ist die arrayposition
		int i;
		
		if (index <= tierListe.length-1) {
			
			for( i= index; i < tierListe.length-2; i++) {
			tierListe[i] = tierListe[i+1];
		}
			tierListe[i+1] = null;
		} 
		else {
			System.out.println("Tier nicht vorhanden");
			
		}
	}
	
	public int alleTiereFuettern() {
		int anzahlFutter = 0;
		
		return anzahlFutter;
	}
	
	public void addMA(Mitarbeiterin ma) {                    //nochmal erfragen 
		                                                     //was damit auf sich hat
		Mitarbeiterin maAktuell = maListeAnfang;
		
		if (maAktuell == null) {
			maListeAnfang = ma;
		}
		else {
			while(maAktuell.getMANext() != null) {
				maAktuell = maAktuell.getMANext();
			}
			maAktuell.setMANext(ma);
		}
		maListeAnfang.setMANext(ma);
	}
	
	public int getListLength() {                                 //Sinn erfragen
		int ergebnis = 0;
		Mitarbeiterin maAktuell = maListeAnfang;
		
		if (maAktuell != null) {
			ergebnis = 1;
			while(maAktuell.getMANext() != null) {
				maAktuell = maAktuell.getMANext();
				ergebnis++;
			}
		}
		return ergebnis;
	}
	
	public void sortMAList() {
		//nach namen sortieren?
	}
	
	public void deleteMA(int index) {
		//mitarbeiter löschen
	}

	
}


































