import java.util.Random;

public class D4_Teht3 {


	public static void main(String[] args) {
	
		// alustetaan rng ja taulukko
		Random arpoja = new Random();
		int[] satunnaisTaulukko = new int [10];
		
		// arvotaan satunnaiset arvot väliltä 0 - 100
		for ( int i = 0 ; i < satunnaisTaulukko.length ; i++ ) {
			satunnaisTaulukko[i] = arpoja.nextInt(100);
		}
		
		// kopioidaan satunnaisTaulukko talteen
		int [] kopioTaulukko = new int[satunnaisTaulukko.length];
		
		for ( int i = 0 ; i < kopioTaulukko.length ; i++ ) {
			kopioTaulukko[i] = satunnaisTaulukko[i];
		}

		// muutetaan pari alkiota -1
		muutaAlkioita ( satunnaisTaulukko, arpoja );
		
		// tulostetaan taulukot ja poistetut arvot
		// ( tehtävänannon mukaan yksi metodi )
		tulostaTaulukot ( satunnaisTaulukko, kopioTaulukko );
		tulostaMuutetutArvot ( satunnaisTaulukko, kopioTaulukko );
		
	}
	
	
	// metodi muuttaa satunnaisesti 1 - 3 alkiota arvoon -1
	public static void muutaAlkioita ( int[] taulukko, Random arpoja ) {
		
		// raja muutetuille arvoille väliltä 1 - 3
		int raja = arpoja.nextInt(2)+1;
				
				
		// muutetaan satunnaisen indeksin alkio -1
		for ( int i = 0 ; i < raja ; i++ ) {
			int indeksi = arpoja.nextInt(taulukko.length);
			taulukko[indeksi] = -1;
		}
	}
	
	
	// metodi tulostaa annetut kaksi taulukkoa
	public static void tulostaTaulukot ( int[] taulukko1, int[] taulukko2 ) {
		
		System.out.println("Taulukko 1:");
		for ( int i = 0 ; i < taulukko1.length ; i++ ) {
			System.out.print( taulukko1[i] + " " );
		}
		System.out.println("\n");
		System.out.println("Taulukko 2:");
		for ( int i = 0 ; i < taulukko2.length ; i++ ) {
			System.out.print( taulukko2[i] + " " );
		}
		System.out.println("\n");
	}
		
	// tulostetaan taulukon2 taulukosta1 eriävät arvot
	public static void tulostaMuutetutArvot ( int[] taulukko1, int[] taulukko2 ) {
		System.out.println("Muutetut arvot:");
		for ( int i = 0 ; i < taulukko1.length ; i++ ) {
			if ( taulukko1[i] != taulukko2[i] ) {
				System.out.print( taulukko2[i] + " " );
			}
		}
	}

	
}
