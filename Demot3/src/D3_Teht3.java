import java.util.Random;
import java.util.Scanner;

public class D3_Teht3 {


	// main kutsuu ainoastaan metodia teht3()
	public static void main(String[] args) {

		teht3();
	}

	// etsii halutut merkit syˆtteest‰ ja arpoo nelinumeroisen luvun jos syˆtteest‰ lˆytyy parillinen m‰‰r‰ merkkej‰
	// jos pariton, tulostaa nollan. Lopuksi tulostetaan merkkijonon viimeinen merkki
	private static void teht3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Anna merkkijono:");
		String mjono = scan.nextLine();
		System.out.println("Anna etsitt‰v‰t merkit:");
		String merkit = scan.nextLine();
		scan.close();

		int merkkienMaara = laskeMerkit(mjono, merkit);
//		System.out.println(merkkienMaara); tarkistusta varten
		String muodostettavaMerkkijono = "";
		if(merkkienMaara %2 == 0){
			muodostettavaMerkkijono = tuotaParillinenMerkkijono(muodostettavaMerkkijono); // __MUUTOS__: muokattu m‰‰ritt‰m‰‰n uusi arvo muuttujalle
		}else{
			muodostettavaMerkkijono = "0";
		}
//		System.out.println(muodostettavaMerkkijono); tarkistusta varten

		System.out.println("Viimeiseksi merkiksi muodostui "+viimeinenMerkki(muodostettavaMerkkijono));
	}

	
	/**
	 * Laskee esiintymien m‰‰r‰n
	 * @param mjono merkkijono, josta merkkej‰ etsit‰‰n
	 * @param merkit merkkijono, jota etsit‰‰n
	 * @return kuinka monta kertaa merkkijono merkit esiintyi merkkijonossa mjono
	 */
	private static int laskeMerkit(String mjono, String merkit) {
		int maara = 0;
		//indexOf palauttaa -1, kun etsitt‰v‰‰ merkkijonoa ei lˆytynyt. Muulloin palautuu indeksi, josta merkkijono alkaa.
		for(int i=mjono.indexOf(merkit); i>=0; i=mjono.indexOf(merkit, i+1)){
			maara++;
		}
		return maara;
	}

	
	/**
	 * Tuotetaan uusi nelinumeroinen merkkijono. Merkkijono on parillinen kokonaisluku.
	 * @param muodostettavaMerkkijono merkkijono, johon numeroita ker‰t‰‰n. On lopuksi parillinen sek‰ nelinumeroinen.
	 */
	private static String tuotaParillinenMerkkijono(String muodostettavaMerkkijono) { // __MUUTOS__: muutettu palauttamaan String
		Random rand = new Random();
		for(int i=0; i<4; i++){			
			int luku = rand.nextInt(10);
			if(i==3){
				//viimeinen kierros: varmistetaan parillinen, yksinumeroinen luku
				if(luku % 2==1){
					luku++;
					luku %= 10;
				}
			}			
			muodostettavaMerkkijono += Integer.toString(luku);
		}
		return muodostettavaMerkkijono; // __MUUTOS__: lis‰tty jotta palauttaa uuden merkkijonon
	}

	
	/**
	 * Palauttaa viimeisen merkin annetusta merkkijonosta.
	 * @param mjono Merkkijono, josta viimeinen merkki halutaan
	 * @return yksi merkki.
	 */
	private static char viimeinenMerkki(String mjono) {
		return mjono.charAt(mjono.length()-1);
	}

}
