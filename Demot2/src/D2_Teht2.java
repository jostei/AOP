import java.util.Scanner;

public class D2_Teht2 {

	public static void main(String[] args) {
		
		// alustetaan uusi skanneri ja kysyt��n k�ytt�j�lt� saltaavaa viesti�, sek� siirron m��r��
		Scanner lukija = new Scanner(System.in);
		
		System.out.print("Kirjoita salattava viesti (suomalaisen aakkosten kirjaimet muunnetaan, merkit pysyv�t ennallaan): ");
		String salattavaViesti = lukija.nextLine();
		
		System.out.print("Sy�t� siirtom��r�: ");
		int siirtoStep = lukija.nextInt();
		
		// alustetaan outputin muuttuja sek� kirjastot isoille ja pienille kirjaimille
		String salattuViesti = "";
		
		String pikkuAakkoset = "abcdefghijklmnopqrstuvwxyz���";
		String isotAakkoset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ���";
		
		int siirrettyIndex = 0;

		// loopataan l�pi salattavan stringin kirjaimet, etsit��n kumpaan aakkostoon kirjain kuuluu
		// jonka j�lkeen kirjainta siirret��n siin� kirjastossa josta se l�ytyy
		// koodi ei siirr� merkkej� tai numeroita
		for ( int i = 0; i < salattavaViesti.length(); i = i + 1 ) {
			if ( pikkuAakkoset.indexOf(salattavaViesti.substring(i,i+1)) != -1 ) {
				
				// t�h�n pikkuaakkosten korvaus
				siirrettyIndex = (pikkuAakkoset.indexOf(salattavaViesti.substring(i,i+1)) + siirtoStep) % pikkuAakkoset.length();
				salattuViesti = salattuViesti + pikkuAakkoset.charAt(siirrettyIndex);
				
			}else if( isotAakkoset.indexOf(salattavaViesti.substring(i,i+1)) != -1 ) {
				
				// t�h� isoaakkosten korvaus
				siirrettyIndex = (isotAakkoset.indexOf(salattavaViesti.substring(i,i+1)) + siirtoStep) % isotAakkoset.length();
				salattuViesti = salattuViesti + isotAakkoset.charAt(siirrettyIndex);
				
			}else {
				
				// t�h�n tuntemattoman merkin korvaus t�hdell�
				salattuViesti = salattuViesti + salattavaViesti.charAt(i);
				
			}
		}
		
		// Tulostetaan salattu viesti
		System.out.println("Salattu viesti: "+salattuViesti);
		lukija.close();
	}

}
