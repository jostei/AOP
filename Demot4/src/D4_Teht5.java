import java.util.Random;

public class D4_Teht5 {

	public static void main(String[] args) {

		Random arpoja = new Random();
		
		// yl�raja taulukoiden arvoille, arvot v�lilt� [1, raja]
		int raja = 4;
		
		// taulukoiden max pituus, arvotaa v�lilt� [1, maxPituus]
		int maxPituus = 4;
		
		// arvotaan satunnaiset pituudet taulukoille v�lilt� [1, 5]
		int[] taulukko1 = new int[arpoja.nextInt(maxPituus)+1];
		int[] taulukko2 = new int[arpoja.nextInt(maxPituus)+1];		
		
		// arvotaan satunnaiset arvot taulukoille
		arvoLuvut ( taulukko1 , arpoja , raja );
		arvoLuvut ( taulukko2 , arpoja , raja );
		
		// tulostetaan taulukot n�kyviin testiksi
		System.out.print("Taulukko 1: ");
		tulostaTaulukko( taulukko1 );
		System.out.print("Taulukko 2: ");
		tulostaTaulukko( taulukko2 );
		
		// jos samanpituiset, testataan ovatko identtiset
		// jos eripituiset, tulostetaan lyhyemm�n taulukon arvot
		if ( taulukko1.length == taulukko2.length ) {
			System.out.println("Taulukot yht� pitk�t.\nOvatko taulukot identtiset: " + ovatkoSamat( taulukko1, taulukko2 ));
		}else {
			System.out.println("Taulukot eripituiset.\nLyhyemm�n taulukon arvot: ");
			if( taulukko1.length < taulukko2.length ) {
				tulostaTaulukko( taulukko1 );
			}else {
				tulostaTaulukko( taulukko2 );
			}
		}
		
	}
	
	// arpoo satunnaiset arvot taulukkoon
	public static void arvoLuvut ( int[] taulukko , Random arpoja , int raja ) {
		for ( int i = 0 ; i < taulukko.length ; i++ ) {
			taulukko[i] = arpoja.nextInt(raja)+1;
			while ( taulukko[i] % 2 != 0 && taulukko[i] % 4 == 0 ) {
				taulukko[i] = arpoja.nextInt(20)+1;
			}
		}
	}
	
	// palauttaa Stringin� "Kyll�" jos taulukoilla on samat arvot, "Ei" jos ei
	public static String ovatkoSamat ( int[] taulukko1 , int[] taulukko2 ) {
		for ( int i = 0 ; i < taulukko1.length ; i++ ) {
			if ( taulukko1[i] != taulukko2[i] ) {
				return "Ei";
			}
		}
		return "Kyll�";
	}
	
	// tulostaa taulukon
	public static void tulostaTaulukko ( int[] taulukko ) {
		for ( int i = 0 ; i < taulukko.length ; i++ ) {
			System.out.print( taulukko[i] + " " );
		}
		System.out.println();
	}

}