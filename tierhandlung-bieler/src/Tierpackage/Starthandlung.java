package Tierpackage;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;

public class Starthandlung {
	
	//15-32
	public static void main(String[] args) {
		
		Tierhandlung tierhandlungBieler;                  //tierhandlungsobjekt erstelen 
		tierhandlungBieler = new Tierhandlung();             // neues objet wird erstellt
		
		Scanner sc = new Scanner(System.in);                  // benutzereingaben per scanner-klasse

		System.out.println("Willkommen bei der " + tierhandlungBieler.getFirmenname()) ;   // startmeldung
		int eingabe = 0;
		
		System.out.println("Lade Daten.");                  //daten laden
		tierhandlungBieler.setTierListe(ladeTierDaten());
		tierhandlungBieler.setPersonListe(ladePersonDaten());
		System.out.println("Daten geladen.");
		
		menüpunkt3(tierhandlungBieler);      //tiere anzeigen
		
		
		while (eingabe != 11) {
			System.out.println("------------------------");
			System.out.println("Hauptmenü");
			System.out.println("1. Tier hinzufügen");
			System.out.println("2. Tiere verkaufen");
			System.out.println("3. Tiere anzeigen");
			System.out.println("4. Tier löschen");
			System.out.println("5. Person hinzufügen");
			System.out.println("6. Person anzeigen");
			System.out.println("7. Person löschen");
			System.out.println("8. MA hinzufügen");
			System.out.println("9. MA anzeigen");
			System.out.println("10. MA löschen");
			System.out.println("11. Programm beenden");
			
			System.out.println("Eingabe: ");
			try {
				
				eingabe = sc.nextInt();
			}
				catch(Exception e) {
					System.out.println("Fehler: keine Zahl. "+ e.toString());
					eingabe = 0;
					sc.next();
			}
		
			
			switch (eingabe) {
			case 1:
				menüpunkt1(tierhandlungBieler);
				break;
			case 2:
				menüpunkt2(tierhandlungBieler);
				break;
			case 3:
				menüpunkt3(tierhandlungBieler);
				break;
			case 4:
				menüpunkt4(tierhandlungBieler);
				break;
			case 5:
				menüpunkt5(tierhandlungBieler);
				break;
			case 6:
				menüpunkt6(tierhandlungBieler);
				break;
			case 7:
				menüpunkt7(tierhandlungBieler);
				break;
			case 8:
				menüpunkt8(tierhandlungBieler);
				break;	
			case 9:
				menüpunkt9(tierhandlungBieler);
				break;
			case 10:
				menüpunkt10(tierhandlungBieler);
				break;
			case 11:
				menüpunkt11(tierhandlungBieler);
				break;
			default:
				System.out.println("Falsche Eingabe");
				break;
			}


		}
	System.out.println("Daten wurden nicht gespeichert :(");
	}
	
	//---menümethoden   tier hinzufügen
	
	public static void menüpunkt1(Tierhandlung tierhandlungBieler) {
		
		Scanner sc = new Scanner(System.in); // scanner-objekt wird wieder gesetzt
		String art;
		String name;
		float groesse;
		float gewicht;
		boolean satt;
		String gebDatum ;
		String farbe;
		String rasse;
		boolean entwurmt;
		//String kommandos;
		boolean hauskatze;
		float salzgehalt;
		int wert = 0; 
//		boolean eingabe2 = true;
//		int eingabe3 = 0;
//		int ShowT = 0;
		
//		while(eingabe2) {
//			System.out.println(">>>>>>>>>>>>>>>>Tier hinzufügen<<<<<<<<<<<<<<<<");
//			System.out.println("1. Hund");
//			System.out.println("2. Katze");
//			System.out.println("3. Fische");
//			System.out.println("4. Hauptmenü");
//			System.out.println(">>>>>>>>>>>>>>>>---------------<<<<<<<<<<<<<<<<");
//			
//			switch(eingabe3) {
//			case 1:
//				art = "Hund";
//				System.out.println("Name: ");
//				name = sc.next();
//				System.out.println("Farbe: ");
//				farbe = sc.next();
//				System.out.println("Größe: ");
//				groesse = (float)0;
//				
//				boolean schleife = true;
//					while(schleife) {
//						try {
//							groesse = sc.nextFloat();
//							schleife = false;
//						}
//						catch (InputMismatchException e) {
//							System.out.println("Bitte nur Zahlen mit ',' anstatt'.' eingeben");
//						}
//					}
//			case 2:
//				art = "Katze";
//				System.out.println("Name: ");
//				name = sc.next();
//				System.out.println("Farbe: ");
//				farbe = sc.next();
//				System.out.println("Größe: ");
//				groesse = (float)0;
//				boolean schleife1 = true;
//					while(schleife1) {
//						try {
//							groesse = sc.nextFloat();
//							schleife1 = false;
//						}
//						catch (InputMismatchException e) {
//							System.out.println("Bitte nur Zahlen mit ',' anstatt'.' eingeben");
//						}
//					}
//			}
//		}
		
		
		Tier neuesTier = new Tier ("Hund", (float) 0.0, (float) 0.0, true, "10.12.2020", "graubraun"); 
		tierhandlungBieler.addTier(neuesTier);
		Katze k1 = new Katze ("Katze", "Billi",(float)0.0, (float)0.0,  true, "10.12.2020", "grau", "Siam", true, true);
		tierhandlungBieler.addTier(k1);
		Hund h1 = new Hund ("Hund", "Lise",(float)0.0, (float)0.0,  true, "10.12.2020", "braunschwarz", "Dackel", true);
		tierhandlungBieler.addTier(h1);
		Fisch f1 = new Fisch("Fisch", "Kirby", (float)0.0, (float)0.0, true, "10.102021", "bunt", (float)0.0);
		tierhandlungBieler.addTier(f1);
		
		System.out.println("Bitte Daten eingeben. Art:");
		art = sc.next();           
		System.out.println("Name:");
		name = sc.next();
		System.out.println("Größe:");
		groesse = sc.nextFloat();
		System.out.println("Gewicht:");
		gewicht = sc.nextFloat();
		System.out.println("Satt: ");
		satt = sc.nextBoolean();
		gebDatum = sc.next();
		System.out.println("GebDatum: ");
		gebDatum = sc.next();
		System.out.println("Farbe: ");
		farbe = sc.next();
		System.out.println("Rasse:");
		rasse = sc.next();
		System.out.println("Entwurmt: ");
		entwurmt = sc.nextBoolean();
		System.out.println("Kommandos: ");
		//kommandos = sc.next();
		System.out.println("Hauskatze: ");
		hauskatze = sc.nextBoolean();
		System.out.println("Salzgehalt: ");
		salzgehalt = sc.nextFloat();
		
		groesse = (float) 0.0;
		boolean schleife = true;
		
		while(schleife) {
			try {
					groesse = sc.nextFloat();
					schleife = false;
			}
			catch (Exception fehler) {
				System.out.println("Nochmal bitte.");
				sc.next();
			}
		//if else hund katze ...
			
		}
		// tierobjekt zum hinzufügen
		//Tier neuesTier = new Tier( art, name, groesse, gewicht, satt, gebDatum, farbe); 
		//tierhandlungBieler.addTier(neuesTier);
	}
	
	// tier verkauft
	public static void menüpunkt2(Tierhandlung tierhandlungBieler) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Bitte Art eingeben: ");
		String art = sc.next();
		System.out.println("Bitte Namen eingeben: ");
		String name = sc.next();
		System.out.println("Als verkauft Eingetragen");
		tierhandlungBieler.getVerkauft();
	}
	
	// tiere anzeigen
	public static void menüpunkt3(Tierhandlung tierhandlungBieler) {
		
		Scanner sc = new Scanner(System.in);
		
		//int eingabe = 0;	
		for(int i = 0; i< tierhandlungBieler.getTierListe().length; i++) {
			if(tierhandlungBieler.getTierListe()[i] == null) {
				System.out.println("-------Liste Ende-------");
				break;
			}
			
			System.out.println("-----------------");
			System.out.println((i+1) + ". Tier");
			System.out.println("Art: " + tierhandlungBieler.getTierListe()[i].getArt());
			System.out.println("Name: " + tierhandlungBieler.getTierListe()[i].getName());
			System.out.println("Größe: " + tierhandlungBieler.getTierListe()[i].getGroesse());
			System.out.println("Gewicht: " + tierhandlungBieler.getTierListe()[i].getGewicht());
			System.out.println("Satt: " + tierhandlungBieler.getTierListe()[i].getSatt());
			System.out.println("GebDatum: " + tierhandlungBieler.getTierListe()[i].getGebDatum());
			System.out.println("Farbe: " + tierhandlungBieler.getTierListe()[i].getFarbe());
			System.out.println("Rasse: " + tierhandlungBieler.getTierListe()[i].getRasse());
			System.out.println("Entwurmt: " + tierhandlungBieler.getTierListe()[i].getEntwurmt());
			System.out.println("Kommandos: " + tierhandlungBieler.getTierListe()[i].getKommandos());
			System.out.println("Hauskatze: " + tierhandlungBieler.getTierListe()[i].getHauskatze());
			System.out.println("Salzgehalt: " + tierhandlungBieler.getTierListe()[i].getSalzgehalt());
			
		}
		System.out.println("");
	}
	//int eingabe = 0;	
	

	//tier entfernen
	public static void menüpunkt4(Tierhandlung tierhandlungBieler) {
		//noch zu füllen
		
		System.out.println("Bitte Tiernummer wählen");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		
		tierhandlungBieler.entferneTier(index-1);
	}
	
	//tiere anzeigen
	public static Tier[] ladeTierDaten() {
		Tier[] rueckgabe;     
		rueckgabe = new Tier[100];
		//rueckgabe = new Hund[100];     //art, name, groesse, gewicht, satt, gebDatum, farbe  rasse entwurmt kommandos
		//name, groesse, gewicht, satt, gebDatum, farbe , rasse, entwurmt, hauskatze
		rueckgabe[0] = new Katze ("Katze", "Billi",(float)0.0, (float)0.0,  true, "10.12.2020", "grau", "Siam", true, true); //anpassen an construktoren der unterklassen
		rueckgabe[1] = new Hund ("Hund", "Lise",(float)0.0, (float)0.0,  true, "10.12.2020", "braunschwarz", "Dackel", true);
		//rueckgabe[2] = new Tier("Hund", "Willi", (float) 0.0, (float) 0.0, true, ("10.12.2020"), "graubraun", "Dackel", true, new String[5], false, (float)0.0);
		rueckgabe[2] = new Fisch("Fisch", "Kirby", (float)0.0, (float)0.0, true, "10.102021", "bunt", (float)0.0);
		/*Array mit Daten füllen. Stattdessen könnte z.B. auch ein Datei- oder DB-Zugriff 
		durchgeführt werden
		/*Arrayfelder 4-99 bleiben erstmal bei null*/
		
		Katze k1 = (Katze) rueckgabe[0];
		Hund h1 = (Hund) rueckgabe[1];
		Fisch f1 = (Fisch) rueckgabe[2];
		return rueckgabe;
	}
	
	public static Person[] ladePersonDaten() {
		Person[] rueckgabe;
		rueckgabe = new Person[100];
		
		rueckgabe[0] = new Person("Kim", new Adresse("Strase 1", 1234, "", "14"), new SimpleDateFormat("01.10.2021"), new Tier[100]);
		rueckgabe[1] = new Person("Franz", new Adresse("Strase 1", 1234, "", "14"), new SimpleDateFormat("01.10.2021"), new Tier[100]);
		/*Array mit Daten füllen. Stattdessen könnte z.B. auch ein Datei- oder DB-Zugriff 
		durchgeführt werden
		/*Arrayfelder 4-99 bleiben erstmal bei null*/
		return rueckgabe;
	}
	
	public static void menüpunkt5(Tierhandlung tierhandlungBieler) {
	
	}
	public static void menüpunkt6(Tierhandlung tierhandlungBieler) {
		
	}
	public static void menüpunkt7(Tierhandlung tierhandlungBieler) {
		
	}
	public static void menüpunkt8(Tierhandlung tierhandlungBieler) {
		
	}
	public static void menüpunkt9(Tierhandlung tierhandlungBieler) {
		
	}
	public static void menüpunkt10(Tierhandlung tierhandlungBieler) {
		
	}
	public static void menüpunkt11(Tierhandlung tierhandlungBieler) {
		
	}
}
