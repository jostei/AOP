public class D2_Teht3 {

	public static void main(String[] args) {

		// konvertoidaan stringiargumentti intiksi
		int korkeus = Integer.parseInt(args[0]);
		
		
		// keskeytetään jos luku ei ole pariton
		if ( korkeus % 2 == 0) {
			System.out.println("Luku ei ole pariton, ei voida tulostaa timanttia.");
		}else {
		
			
			// piirretään yläpuoli timantista
			for ( int i = 1; i < (korkeus/2 +1); i = i + 1 ) {
				for ( int j = 1; j <= korkeus; j = j +1 ) {
					//testataan etäisyyttä keskirivistä, jos yli rajan, tulostetaan välilyöntejä tähden sijasta
					if( Math.abs(j - (korkeus/2 +1)) < i ) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					// rivinvaihto rivin lopussa
					if ( j == korkeus ) {
						System.out.println("");
					}
				}
			}
			
			
			// piirretään alapuoli (ja keskirivi) timantista, sama looppi kuin ylhäällä, mutta ylösalaisin
			for ( int x = (korkeus/2 +1); x > 0; x = x - 1 ) {
				for ( int y = 1; y <= korkeus; y = y +1 ) {
					//testataan etäisyyttä keskirivistä, jos yli rajan, tulostetaan välilyöntejä tähden sijasta
					if( Math.abs(y - (korkeus/2 +1)) < x ) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					// rivinvaihto rivin lopussa
					if ( y == korkeus ) {
						System.out.println("");
					}
				}
			}
		}
	}
}
