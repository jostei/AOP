import java.util.Scanner;

public class D2_Teht4 {

	public static void main(String[] args) {
		
		// perusidea:
		// k�y alkuper�inen sana l�pi kirjain kerrallaan
		// poista kirjain alkuper�isest� ja liit� se uuteen stringiin
		// k�y loppu sana l�pi etsien samaa kirjainta
		// poista kirjain aina lis�tess� se uuteen stringiin
		// toista kunnes alkuper�inen sana-length()==0
		
		// alustetaan skanneri ja muuttujat
		Scanner lukija = new Scanner(System.in);
		
		System.out.print("Sy�t� sortattava sana: ");
		String alkusana = lukija.nextLine();
		String loppusana = "";
		
		// apunumero while looppiin sanaa kirjainta etsiess�
		// summamuuttuja v�lily�ntien laskemiseen
		int looppiNro = 0;
		int spaceNro = 0;
		
		// k�yd��n l�pi kunnes kirjaimet loppuu
		// lis�t��n loppusanan loppuun alkusanan ensimm�inen kirjain
		while( alkusana.length() > 0 ) {
			
			// skipataan jos merkki on v�lily�nti ja nostetaan v�lily�ntisummaa yhdell�
			if ( alkusana.charAt(0) == ' ' ) {
				alkusana = alkusana.substring(1);
				spaceNro = spaceNro + 1;
			}else {
				loppusana = loppusana + alkusana.charAt(0);
				alkusana = alkusana.substring(1);
				looppiNro = loppusana.length()-1;
			
				// etsit��n samaan tyyliin alkusanasta loppusana indeksill� looppiNro l�ytyv�� kirjainta
				// liitet��n l�ytynyt kirjain loppusanan per��n ja poistetaan se alkusanasta
				while ( alkusana.indexOf(loppusana.charAt(looppiNro)) != -1 ) {
					loppusana = loppusana + alkusana.charAt(alkusana.indexOf(loppusana.charAt(looppiNro)));
					alkusana = alkusana.substring(0,alkusana.indexOf(loppusana.charAt(looppiNro))) + alkusana.substring(alkusana.indexOf(loppusana.charAt(looppiNro))+1);
				}
			}
		}
		
		// tulostetaan loppusana ja v�lily�ntien m��r�
		System.out.println("Kirjainsortattu sana: "+loppusana);
		System.out.println("V�lily�ntej� poistettu: "+spaceNro);
		lukija.close();
	}
}