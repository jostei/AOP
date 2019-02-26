import java.util.Scanner;

public class D3_Teht5 {

	public static void main(String[] args) {

		// kysyt��n k�sitelt�v� merkkijono
		Scanner lukija = new Scanner(System.in);
		System.out.print("Sy�t�pp� joku stringi: ");
		String syote = lukija.nextLine();

		// kysyt��n montako t�hte� per merkki
		System.out.print("Sy�t� montako t�hte� per merkki tulostetaan: ");
		double tahteaPerMerkki = lukija.nextDouble();

		// tulostetaan sy�tetyn merkkijono pituus numerona
		System.out.println(syote.length());

		// tulostetaan sy�tteen pituus*tahteaPerMerkki verran t�hti�
		tulostaTahdet(tahteaPerMerkki,syote.length());
		System.out.println("");

		// k�yd��n sy�te l�pi merkki merkilt� ja lasketaan jokaisen kohdalla montako kertaa merkki esiintyy sanassa
		// t�m�n j�lkeen tulostetaan t�hti� merkin esiintymism��r�n verran joka merkille
		for ( int j = 0; j < syote.length(); j++ ) {
			int merkkilaskuri = 0;
			for (int i = 0; i < syote.length(); i++) {
				if ( syote.charAt(j) == syote.charAt(i) ) {
					merkkilaskuri = merkkilaskuri + 1;
				}
			}
			tulostaTahdet(tahteaPerMerkki,merkkilaskuri);
			System.out.println("");
		}
		
		// tulostetaan loppuu viel� sy�tteen pituus*tahteaPerMerkki verran t�hti�
		tulostaTahdet(tahteaPerMerkki,syote.length());
		lukija.close();
	}

	// ottaa kaksi muuttujaa (t�hte�/merkki ja saman kirjaimen lukum��r�) ja tulostaa t�hti� halutun m��r�n
	public static void tulostaTahdet (double tahteaPerMerkki, int merkkipituus) {
		for ( int i = 0; i < (int)(merkkipituus*tahteaPerMerkki); i++) {
			System.out.print("*");
		}
	}
}
