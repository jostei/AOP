
public class D4_Teht6 {

	public static void main(String[] args) {
	
		char[][][] charBoksi = new char[5][5][5];
		 
		// havainnollistamiseksi asetetaan kaikki arrayn alkiot '.' arvoisiksi
		asetaArvot ( charBoksi , '.' );
		
		// upotettava merkkijono
		String mjono = "ABC";
		
		// jos charBoksi on kuutio ja sana mahtuu boksiin, laitetaan se sinne
		tulostaArray ( keskitaStringi ( charBoksi , mjono ) );

	}
	
	// palauttaa true jos charArray on kuutio, false jos ei
	public static boolean onkoKuutio ( char[][][] charArray ) {
		return ( ( charArray.length == charArray[0].length ) && ( charArray[0].length == charArray[0][0].length ) && ( charArray[0][0].length == charArray.length ) );
	}
	
	// upottaa annetun stringin mjono kuution diagonaalille
	public static char[][][] keskitaStringi ( char[][][] charArray , String mjono ) {
		
		if ( onkoKuutio( charArray ) && charArray.length >= mjono.length() ) {
			
			// jokaisen koordinaattisuunnan erotuksen keskiarvo
			// eli siirto X,Y,Z suunnissa joilla stringi keskittyy tässä kyseisessä suunnassa
			// parillisessa tapauksessa valitsee 'toisen puolen'
			int siirtoX = ((charArray.length - mjono.length())/2);
			int siirtoY = ((charArray[0].length - mjono.length())/2);
			int siirtoZ = ((charArray[0][0].length - mjono.length())/2);
			
			// kirjoitetaan stringi kuution lävistäjälle
			for ( int i = 0 ; i < mjono.length() ; i ++ ) {
				charArray[i+siirtoX][i+siirtoY][i+siirtoZ] = mjono.charAt(i);
			}
			return charArray;
		}else {
			return charArray;
		}
	}
	
	// tulostaa annetun char taulukon
	public static void tulostaArray ( char[][][] charArray ) {
		for ( char[][] kerros : charArray ) {
			for ( char[] toinenkerros : kerros ) {
				for ( char alkio : toinenkerros ) {
					System.out.print( alkio + " " );
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}

	// asettaa annettuun taulukkoon sama character joka soluun
	public static void asetaArvot ( char[][][] charArray , char arvo ) {
		for ( int i = 0 ; i < charArray.length ; i++ ) {
			for ( int j = 0 ; j < charArray[0].length ; j++ ) {
				for ( int k = 0 ; k < charArray[0][0].length ; k++ ) {
					charArray[i][j][k] = arvo;
				}
			}
		}
	}
	
}
