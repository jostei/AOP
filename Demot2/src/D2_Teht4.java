import java.util.Scanner;

public class D2_Teht4 {

	public static void main(String[] args) {
		
		// perusidea:
		// käy alkuperäinen sana läpi kirjain kerrallaan
		// poista kirjain alkuperäisestä ja liitä se uuteen stringiin
		// käy loppu sana läpi etsien samaa kirjainta
		// poista kirjain aina lisätessä se uuteen stringiin
		// toista kunnes alkuperäinen sana-length()==0
		
		// alustetaan skanneri ja muuttujat
		Scanner lukija = new Scanner(System.in);
		
		System.out.print("Syötä sortattava sana: ");
		String alkusana = lukija.nextLine();
		String loppusana = "";
		
		// apunumero while looppiin sanaa kirjainta etsiessä
		// summamuuttuja välilyöntien laskemiseen
		int looppiNro = 0;
		int spaceNro = 0;
		
		// käydään läpi kunnes kirjaimet loppuu
		// lisätään loppusanan loppuun alkusanan ensimmäinen kirjain
		while( alkusana.length() > 0 ) {
			
			// skipataan jos merkki on välilyönti ja nostetaan välilyöntisummaa yhdellä
			if ( alkusana.charAt(0) == ' ' ) {
				alkusana = alkusana.substring(1);
				spaceNro = spaceNro + 1;
			}else {
				loppusana = loppusana + alkusana.charAt(0);
				alkusana = alkusana.substring(1);
				looppiNro = loppusana.length()-1;
			
				// etsitään samaan tyyliin alkusanasta loppusana indeksillä looppiNro löytyvää kirjainta
				// liitetään löytynyt kirjain loppusanan perään ja poistetaan se alkusanasta
				while ( alkusana.indexOf(loppusana.charAt(looppiNro)) != -1 ) {
					loppusana = loppusana + alkusana.charAt(alkusana.indexOf(loppusana.charAt(looppiNro)));
					alkusana = alkusana.substring(0,alkusana.indexOf(loppusana.charAt(looppiNro))) + alkusana.substring(alkusana.indexOf(loppusana.charAt(looppiNro))+1);
				}
			}
		}
		
		// tulostetaan loppusana ja välilyöntien määrä
		System.out.println("Kirjainsortattu sana: "+loppusana);
		System.out.println("Välilyöntejä poistettu: "+spaceNro);
		lukija.close();
	}
}