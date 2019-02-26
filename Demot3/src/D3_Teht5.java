import java.util.Scanner;

public class D3_Teht5 {

	public static void main(String[] args) {

		// kysytään käsiteltävä merkkijono
		Scanner lukija = new Scanner(System.in);
		System.out.print("Syötäppä joku stringi: ");
		String syote = lukija.nextLine();

		// kysytään montako tähteä per merkki
		System.out.print("Syötä montako tähteä per merkki tulostetaan: ");
		double tahteaPerMerkki = lukija.nextDouble();

		// tulostetaan syötetyn merkkijono pituus numerona
		System.out.println(syote.length());

		// tulostetaan syötteen pituus*tahteaPerMerkki verran tähtiä
		tulostaTahdet(tahteaPerMerkki,syote.length());
		System.out.println("");

		// käydään syöte läpi merkki merkiltä ja lasketaan jokaisen kohdalla montako kertaa merkki esiintyy sanassa
		// tämän jälkeen tulostetaan tähtiä merkin esiintymismäärän verran joka merkille
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
		
		// tulostetaan loppuu vielä syötteen pituus*tahteaPerMerkki verran tähtiä
		tulostaTahdet(tahteaPerMerkki,syote.length());
		lukija.close();
	}

	// ottaa kaksi muuttujaa (tähteä/merkki ja saman kirjaimen lukumäärä) ja tulostaa tähtiä halutun määrän
	public static void tulostaTahdet (double tahteaPerMerkki, int merkkipituus) {
		for ( int i = 0; i < (int)(merkkipituus*tahteaPerMerkki); i++) {
			System.out.print("*");
		}
	}
}
