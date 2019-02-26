
public class D4_Teht2 {

	public static void main(String[] args) {

		// tehtävän esimerkkitaulukot
		int[] taulukko1 = { 2 , 5 , 7 , 0 };
		int[] taulukko2 = { 1 , 3 , 6 , 8, 7 };
		
		// vaihtoehtoiset taulukot testiin
		// int[] taulukko1 = { 1 , 12 , 3 , 0 , 7, 3, 9 };
		// int[] taulukko2 = { 67 , 21 , 3 , 7 , 12 };
		
		// tässä kohtaa tulostetaan puuttuvia indeksejä
		System.out.println("Puuttuvat indeksit: ");
		muokkaaTaulukko (taulukko1, taulukko2);
		
		// tulostetaan taulukot
		tulostaTaulukot ( taulukko1 , taulukko2 );

	}
	
	 // muokkaaTaulukko muokkaa annetut taulukot 
	 // taulukon 1 arvoja verrataan taulukon 2 indekseihin
	 // jos taulukon 1 arvo osuu johonkin indeksiin joka löytyy taulukosta 2
	 // tämä arvo muutetaan nollaksi ja muutetun arvon indeksi tulostetaan
	public static void muokkaaTaulukko ( int[] taulukko1, int[] taulukko2) {

		for ( int j = 0 ; j < taulukko1.length ; j++ ) {
			if ( taulukko1[j] < taulukko2.length ) {
				taulukko2[taulukko1[j]] = 0;
			}else{
				System.out.println(taulukko1[j]);
			}
		}
	}
	
	// tulostaa kaksi annettua taulukkoa
	public static void tulostaTaulukot ( int[] t1 , int[] t2 ) {
		System.out.println();
		System.out.println( "Taulukko 1: " );
		for ( int alkio1 : t1 ) {
			System.out.print( alkio1 + " " );
		}
		System.out.println("\n");
		System.out.println( "Taulukko 2: " );
		for ( int alkio2 : t2 ) {
			System.out.print( alkio2 + " " );
		}
	}

}
