import java.util.Scanner;


public class D3_Teht1 {

	public static void main(String[] args) {
	
	Scanner lukija = new Scanner(System.in);
			
	// kysytään testattavaa sanaa
	System.out.print("Syötä testattava sana: ");
	String syotto = lukija.nextLine();
	
	System.out.println("Sana '"+syotto+"' on palindromi: "+onkoPalindromi(syotto));
	
	lukija.close();
	}

	
	// testausmetodi
	public static boolean onkoPalindromi(String mjono) {
		
		// jaetaan mjono keskeltä kahtia
		String s1 = mjono.substring(0,mjono.length()/2);
		String s2 = mjono.substring(mjono.length()/2);
		
		// luetaan s1 oikeinepäin ja s2 väärinpäin ja palautetaan false jos merkit eriävät
		for ( int i = 0; i < mjono.length()/2; i++ ) {
			if( s1.charAt(i) != s2.charAt(s2.length()-i-1) ) {
				return false;
			}
		}
		return true;
	}
	
}
