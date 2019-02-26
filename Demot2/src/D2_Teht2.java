import java.util.Scanner;

public class D2_Teht2 {

	public static void main(String[] args) {
		
		// alustetaan uusi skanneri ja kysytään käyttäjältä saltaavaa viestiä, sekä siirron määrää
		Scanner lukija = new Scanner(System.in);
		
		System.out.print("Kirjoita salattava viesti (suomalaisen aakkosten kirjaimet muunnetaan, merkit pysyvät ennallaan): ");
		String salattavaViesti = lukija.nextLine();
		
		System.out.print("Syötä siirtomäärä: ");
		int siirtoStep = lukija.nextInt();
		
		// alustetaan outputin muuttuja sekä kirjastot isoille ja pienille kirjaimille
		String salattuViesti = "";
		
		String pikkuAakkoset = "abcdefghijklmnopqrstuvwxyzåäö";
		String isotAakkoset = "ABCDEFGHIJKLMNOPQRSTUVWXYZÅÄÖ";
		
		int siirrettyIndex = 0;

		// loopataan läpi salattavan stringin kirjaimet, etsitään kumpaan aakkostoon kirjain kuuluu
		// jonka jälkeen kirjainta siirretään siinä kirjastossa josta se löytyy
		// koodi ei siirrä merkkejä tai numeroita
		for ( int i = 0; i < salattavaViesti.length(); i = i + 1 ) {
			if ( pikkuAakkoset.indexOf(salattavaViesti.substring(i,i+1)) != -1 ) {
				
				// tähän pikkuaakkosten korvaus
				siirrettyIndex = (pikkuAakkoset.indexOf(salattavaViesti.substring(i,i+1)) + siirtoStep) % pikkuAakkoset.length();
				salattuViesti = salattuViesti + pikkuAakkoset.charAt(siirrettyIndex);
				
			}else if( isotAakkoset.indexOf(salattavaViesti.substring(i,i+1)) != -1 ) {
				
				// tähä isoaakkosten korvaus
				siirrettyIndex = (isotAakkoset.indexOf(salattavaViesti.substring(i,i+1)) + siirtoStep) % isotAakkoset.length();
				salattuViesti = salattuViesti + isotAakkoset.charAt(siirrettyIndex);
				
			}else {
				
				// tähän tuntemattoman merkin korvaus tähdellä
				salattuViesti = salattuViesti + salattavaViesti.charAt(i);
				
			}
		}
		
		// Tulostetaan salattu viesti
		System.out.println("Salattu viesti: "+salattuViesti);
		lukija.close();
	}

}
