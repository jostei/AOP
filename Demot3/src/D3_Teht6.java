import java.util.Scanner;

public class D3_Teht6 {

	// mainissa m��ritell��n lukija ja pyydet��n sy�tett�, itse suoritus metodisssa 'suorita'
	// mainissa 5 puolipistett�
	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);
		System.out.print("Anna sy�te: ");
		String syote = lukija.nextLine();

		// suorita metodi sis�lt�� muiden aliohjelmien kutsunnat ja tulosten tulostamiset
		suorita(syote,lukija);
		
		lukija.close();
	}
	
	
	// poistaa ylim��r�iset v�lily�nnit sy�tteen alusta ja lopusta
	// 3 puolipistett�
	public static String poistaValit(String kayttajanSyote) {
		while ( kayttajanSyote.charAt(0) == ' ' && kayttajanSyote.length() > 0) {
			kayttajanSyote = kayttajanSyote.substring(1);
		}
		while ( kayttajanSyote.charAt(kayttajanSyote.length()-1) == ' ' && kayttajanSyote.length() > 0 ) {
			kayttajanSyote = kayttajanSyote.substring(0,kayttajanSyote.length()-2);
		}
		return kayttajanSyote;
	}
	
	// funktio joka palauttaa sy�tteen (v�lily�nneill� eroteltujen) sanojen m��r�n
	// 5 puolipistett�
	public static int sanamaara(String kayttajanSyote) {
		int sanaSumma = 1;
			for ( int i = 0; i < kayttajanSyote.length(); i++ ) {
				if ( kayttajanSyote.charAt(i) == ' ' && kayttajanSyote.charAt(i+1) != ' ' ) {
					sanaSumma = sanaSumma + 1;
			}
		}
		return sanaSumma;
	}

	
	// funktio, joka palauttaa string tyyppisen arvon "Sy�te on palindromi." jos sy�te on palindromi, "Sy�te ei ole palindromi." jos ei
	// 4 puolipistett�
	public static String onkoPalindromi(String mjono) {
		
		// k�yd��n l�pi ensimm�inen puolikas ( eli length/2 asti ) ja k��nteisesti j�lkimm�inen puolikas ( length/2 eteenp�in )
		// testataan onko merkit samat, jos l�ytyy eri merkkej�, palautetaan kielteinen stringi
		for ( int i = 0; i < mjono.length()/2; i++ ) {
			if( mjono.substring(0,mjono.length()/2).charAt(i) != mjono.substring(mjono.length()/2).charAt(mjono.substring(mjono.length()/2).length()-i-1) ) {
				return "Sy�te ei ole palindromi.";
			}
		}
		return "Sy�te on palindromi.";
	}
	
	
	// funktio, joka kysyy sanam��r�n verran kokonaislukuja ja tulostaa niiden summan strngin� "Lukujen summa: summa"
	// 5 puolipistett�
	public static String summametodi(int sanamaara, Scanner lukija) {
		int lukujenSumma = 0;
		for ( int i = 0; i < sanamaara; i++ ) {
			lukujenSumma = lukujenSumma + lukija.nextInt();
		}
		return "Lukujen summa: "+Integer.toString(lukujenSumma);
	}
	
	
	// ohjelman suoritus proseduurina mainin puolipisteiden rajoittamiseksi
	// 4 puolipistett�
	public static void suorita(String syote, Scanner lukija) {
		System.out.println("Sanam��r�: "+sanamaara(poistaValit(syote)));
		System.out.println("Anna "+sanamaara(poistaValit(syote))+" kokonaislukua: ");
		System.out.println(summametodi(sanamaara(poistaValit(syote)),lukija));
		System.out.println("Onko palindromi? "+onkoPalindromi(poistaValit(syote)));
	}
	
}
