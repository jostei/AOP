import java.util.Scanner;

public class D2_Teht5 {

	public static void main(String[] args) {
		
		// luodaan uusi skanneri
		Scanner lukija = new Scanner(System.in);
		
		// kysytään käyttäjältä kolme merkkijonoa
		// huom. koodi erottelee isot ja pienet kirjaimet
		System.out.print("Syötä merkkijono A: ");
		String ekaJono = lukija.nextLine();
		System.out.print("Syötä merkkijono B: ");
		String tokaJono = lukija.nextLine();
		System.out.print("Syötä merkkijono C: ");
		String kolmasJono = lukija.nextLine();
		
		System.out.print("Ainoastaan yhdessä jonossa esiintyvät kirjaimet ovat: ");
		
		// luodaan apumuuttuja jonka avulla vältetään tuplat
		String kirjainJono = "";
		
		// käydään jono A läpi kirjain kirjaimelta ja tarkistetaan löytyykö vastaava merkki jonoista B, C tai kirjainJono
		// jos kirjainta ei löydy (.indexOf() = -1) tulostetaan kirjain ja lisätään se käytettyihin kirjaimiin
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
