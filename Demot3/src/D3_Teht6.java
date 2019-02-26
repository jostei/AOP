import java.util.Scanner;

public class D3_Teht6 {

	// mainissa määritellään lukija ja pyydetään syötettä, itse suoritus metodisssa 'suorita'
	// mainissa 5 puolipistettä
	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);
		System.out.print("Anna syöte: ");
		String syote = lukija.nextLine();

		// suorita metodi sisältää muiden aliohjelmien kutsunnat ja tulosten tulostamiset
		suorita(syote,lukija);
		
		lukija.close();
	}
	
	
	// poistaa ylimääräiset välilyönnit syötteen alusta ja lopusta
	// 3 puolipistettä
	public static String poistaValit(String kayttajanSyote) {
		while ( kayttajanSyote.charAt(0) == ' ' && kayttajanSyote.length() > 0) {
			kayttajanSyote = kayttajanSyote.substring(1);
		}
		while ( kayttajanSyote.charAt(kayttajanSyote.length()-1) == ' ' && kayttajanSyote.length() > 0 ) {
			kayttajanSyote = kayttajanSyote.substring(0,kayttajanSyote.length()-2);
		}
		return kayttajanSyote;
	}
	
	// funktio joka palauttaa syötteen (välilyönneillä eroteltujen) sanojen määrän
	// 5 puolipistettä
	public static int sanamaara(String kayttajanSyote) {
		int sanaSumma = 1;
			for ( int i = 0; i < kayttajanSyote.length(); i++ ) {
				if ( kayttajanSyote.charAt(i) == ' ' && kayttajanSyote.charAt(i+1) != ' ' ) {
					sanaSumma = sanaSumma + 1;
			}
		}
		return sanaSumma;
	}

	
	// funktio, joka palauttaa string tyyppisen arvon "Syöte on palindromi." jos syöte on palindromi, "Syöte ei ole palindromi." jos ei
	// 4 puolipistettä
	public static String onkoPalindromi(String mjono) {
		
		// käydään läpi ensimmäinen puolikas ( eli length/2 asti ) ja käänteisesti jälkimmäinen puolikas ( length/2 eteenpäin )
		// testataan onko merkit samat, jos löytyy eri merkkejä, palautetaan kielteinen stringi
		for ( int i = 0; i < mjono.length()/2; i++ ) {
			if( mjono.substring(0,mjono.length()/2).charAt(i) != mjono.substring(mjono.length()/2).charAt(mjono.substring(mjono.length()/2).length()-i-1) ) {
				return "Syöte ei ole palindromi.";
			}
		}
		return "Syöte on palindromi.";
	}
	
	
	// funktio, joka kysyy sanamäärän verran kokonaislukuja ja tulostaa niiden summan strnginä "Lukujen summa: summa"
	// 5 puolipistettä
	public static String summametodi(int sanamaara, Scanner lukija) {
		int lukujenSumma = 0;
		for ( int i = 0; i < sanamaara; i++ ) {
			lukujenSumma = lukujenSumma + lukija.nextInt();
		}
		return "Lukujen summa: "+Integer.toString(lukujenSumma);
	}
	
	
	// ohjelman suoritus proseduurina mainin puolipisteiden rajoittamiseksi
	// 4 puolipistettä
	public static void suorita(String syote, Scanner lukija) {
		System.out.println("Sanamäärä: "+sanamaara(poistaValit(syote)));
		System.out.println("Anna "+sanamaara(poistaValit(syote))+" kokonaislukua: ");
		System.out.println(summametodi(sanamaara(poistaValit(syote)),lukija));
		System.out.println("Onko palindromi? "+onkoPalindromi(poistaValit(syote)));
	}
	
}
