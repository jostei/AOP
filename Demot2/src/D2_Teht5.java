import java.util.Scanner;

public class D2_Teht5 {

	public static void main(String[] args) {
		
		// luodaan uusi skanneri
		Scanner lukija = new Scanner(System.in);
		
		// kysyt��n k�ytt�j�lt� kolme merkkijonoa
		// huom. koodi erottelee isot ja pienet kirjaimet
		System.out.print("Sy�t� merkkijono A: ");
		String ekaJono = lukija.nextLine();
		System.out.print("Sy�t� merkkijono B: ");
		String tokaJono = lukija.nextLine();
		System.out.print("Sy�t� merkkijono C: ");
		String kolmasJono = lukija.nextLine();
		
		System.out.print("Ainoastaan yhdess� jonossa esiintyv�t kirjaimet ovat: ");
		
		// luodaan apumuuttuja jonka avulla v�ltet��n tuplat
		String kirjainJono = "";
		
		// k�yd��n jono A l�pi kirjain kirjaimelta ja tarkistetaan l�ytyyk� vastaava merkki jonoista B, C tai kirjainJono
		// jos kirjainta ei l�ydy (.indexOf() = -1) tulostetaan kirjain ja lis�t��n se k�ytettyihin kirjaimiin
		for ( int x = 0; x < ekaJono.length(); x = x + 1 ) {
			for ( int i = 0; i < ekaJono.length(); i = i + 1 ) {
				if ( tokaJono.indexOf(ekaJono.charAt(i)) == -1 && kolmasJono.indexOf(ekaJono.charAt(i)) == -1 && kirjainJono.indexOf(ekaJono.charAt(i)) == -1 ) {
					System.out.print(ekaJono.charAt(i));
					kirjainJono = kirjainJono + ekaJono.charAt(i);
				}
			}
		}
		
		// sama operaatio jonolle B ...
		for ( int y = 0; y < tokaJono.length(); y = y + 1 ) {
			for ( int i = 0; i < tokaJono.length(); i = i +1 ) {
				if ( ekaJono.indexOf(tokaJono.charAt(i)) == -1 && kolmasJono.indexOf(tokaJono.charAt(i)) == -1 && kirjainJono.indexOf(tokaJono.charAt(i)) == -1 ) {
					System.out.print(tokaJono.charAt(i));
					kirjainJono = kirjainJono + tokaJono.charAt(i);
				}
			}
		}
		
		// ... ja jonolle C
		for ( int z = 0; z < kolmasJono.length(); z = z + 1 ) {
			for ( int i = 0; i < kolmasJono.length(); i = i +1 ) {
				if ( tokaJono.indexOf(kolmasJono.charAt(i)) == -1 && ekaJono.indexOf(kolmasJono.charAt(i)) == -1 && kirjainJono.indexOf(kolmasJono.charAt(i)) == -1 ) {
					System.out.print(kolmasJono.charAt(i));
					kirjainJono = kirjainJono + kolmasJono.charAt(i);
				}
			}
		}
		
		// suljetaan lukija
		lukija.close();
	}

}
