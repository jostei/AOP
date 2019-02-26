import java.util.Random;

public class D4_Teht4 {

	//----------------------------------------------------------------------------------------------------------
	//
	// Vinkkej� koodiin:
	//     - selke�mpi muotoilu (rivitys, sisennys etc.)
	//     - niem� muuttujat ja metodin kuvaavasti
	//     - k�yt� useampaa muuttujanime�, sek� eri nime� muuttujalle ja metodille
	//
	//  Virhe:
	//     - Ohjelman pit�isi tulostaa generoidun taulukon arvojen keskiarvo, jos se on alle 5, 0 muutoin
	//     - Ohjelma tulostaa aina 0 vaikka satunnaisen keskiarvon pit�isi joskus olla < 5
	//     - Ensimm�inen while looppi katkeaa vasta kun double tka > 5
	//     - Koska alussa varmistettiin, ett� double tka > 5, j�limm�inen if-else haaran ehto on aina false
	//
	//  Korjausehdotus: Arvo ensimm�inen tka arvo ilman while looppia jolloin arvoksi saadaan satunnainen keskiarvo,
	//                  jolloin loppup��n if-else saattaa joskus tulostaa muutakin kuin 0
	//
	//----------------------------------------------------------------------------------------------------------
	
	public static int rvtra = 11;                   // k�ytet��n taulukon pituuden satunnaistamisessa

	public static void main(String[] tk){		
		double tka = 0;		
		
		// t�m� while py�rii kunnes tka > 5
		while(tka(tka)){							// t�ss� tka muuttuja on arvoa double!
			tka = tka(tka());						// t�ss� tka() palauttaa int[], jolloin tka(tka()) palauttaa doublen
		}
		
		//tka = tka(tka());							// ilman while looppia
		
		//System.out.println("tka arvo iffiss�: "+tka);
		//System.out.println("tka(tka) arvo iffiss�: "+tka(tka));
		
		if(tka(tka)){								// t�ss� tka on double ja ehto palauttaa booleania
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
			tk[tka] = ka.nextInt(tka+1)+1;			// asettaa tk:n arvoiksi satunnaislukuja v�lilt� 1 - tka
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
