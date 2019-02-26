import java.util.Random;

public class D4_Teht4 {

	//----------------------------------------------------------------------------------------------------------
	//
	// Vinkkejä koodiin:
	//     - selkeämpi muotoilu (rivitys, sisennys etc.)
	//     - niemä muuttujat ja metodin kuvaavasti
	//     - käytä useampaa muuttujanimeä, sekä eri nimeä muuttujalle ja metodille
	//
	//  Virhe:
	//     - Ohjelman pitäisi tulostaa generoidun taulukon arvojen keskiarvo, jos se on alle 5, 0 muutoin
	//     - Ohjelma tulostaa aina 0 vaikka satunnaisen keskiarvon pitäisi joskus olla < 5
	//     - Ensimmäinen while looppi katkeaa vasta kun double tka > 5
	//     - Koska alussa varmistettiin, että double tka > 5, jälimmäinen if-else haaran ehto on aina false
	//
	//  Korjausehdotus: Arvo ensimmäinen tka arvo ilman while looppia jolloin arvoksi saadaan satunnainen keskiarvo,
	//                  jolloin loppupään if-else saattaa joskus tulostaa muutakin kuin 0
	//
	//----------------------------------------------------------------------------------------------------------
	
	public static int rvtra = 11;                   // käytetään taulukon pituuden satunnaistamisessa

	public static void main(String[] tk){		
		double tka = 0;		
		
		// tämä while pyörii kunnes tka > 5
		while(tka(tka)){							// tässä tka muuttuja on arvoa double!
			tka = tka(tka());						// tässä tka() palauttaa int[], jolloin tka(tka()) palauttaa doublen
		}
		
		//tka = tka(tka());							// ilman while looppia
		
		//System.out.println("tka arvo iffissä: "+tka);
		//System.out.println("tka(tka) arvo iffissä: "+tka(tka));
		
		if(tka(tka)){								// tässä tka on double ja ehto palauttaa booleania
			System.out.println(tka);				// eli jos tka < 5, tulostetaan tka
		}else{
			System.out.println(0);					// muulloin tulostetaan 0
			}
		
	}
	
	// palauttaa taulukon satunnaisarvoilla
	public static int[] tka(){
		
		Random ka = new Random();
		int[] tk = new int[ka.nextInt(rvtra)+7];	// arpoo 7 - (rvtra + 6) pituisen int-arrayn, rvtra = 11
		
		for(int tka = 0; tka < tk.length; tka++){
			tk[tka] = ka.nextInt(tka+1)+1;			// asettaa tk:n arvoiksi satunnaislukuja väliltä 1 - tka
		}
		return tk;
	}
	
	// laskee tk taulukon alkioiden keskiarvon
	private static double tka(int[] tk) {
		
		if(tk.length == 0)
			return 0;      
		
		int tka = 0;
		for(int tka1 : tk){
			tka += tka1;							// tka:han summataan kaikki int[] tk:n alkiot
		}		
		return tka/tk.length;						// palautetaan siis keskiarvo tk:n arvoista
	}
	
	// palauttaa true jos tka on pienempi kuin viisi
	public static boolean tka (double tka){
		return	tka < 5;
	}

}
