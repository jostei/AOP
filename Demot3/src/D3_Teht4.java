import java.util.Scanner;


public class D3_Teht4 {

	public static void main(String[] args) {
	
	// alustetaan skanneri ja kysytään syötetta
	Scanner lukija = new Scanner(System.in);
	System.out.print("Syötä siivottava merkkijono: ");
	String merkkijono = lukija.nextLine();
	
	lukija.close();
	
	// kutsutaan metodia tulostaessa
	System.out.println("Siivottu merkkijono: "+poistaErikoismerkit(merkkijono));
	}
	
	
	// metodi poistaa kaikki merkit jotka eivät löydy stringeistä isoaakkoset, pikkuaakkoset tai numerot
	public static String poistaErikoismerkit (String mjono) {
		
		String isoaakkoset = "ABCDEFGHIJKLMNOPQRSTUVWXYZÅÄÖ";
		String pikkuaakkoset = "abcdefghijklmnopqrstuvwxyzåäö";
		String numerot = "1234567890";
		
		// palautettava siivottu stringi
		String ulostus = "";
		
		// käydään syöte läpi ja korvataan merkit välilyönneillä
		for ( int i = 0; i < mjono.length(); i++ ) {
			if ( isoaakkoset.indexOf(mjono.charAt(i)) != -1 || pikkuaakkoset.indexOf(mjono.charAt(i)) != -1 || numerot.indexOf(mjono.charAt(i)) != -1 ) {
				ulostus += mjono.charAt(i);
			}else {
				ulostus += " ";
			}
		}
		
		return ulostus;
		
	}

}
