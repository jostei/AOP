
public class D4_Teht1 {

	public static void main(String[] args) {
	
		// tehd‰‰n taulukollinen nollia
		int[] taulukko = new int[10];
		
		// m‰‰r‰t‰‰n suurin arvo
		int x = 15;

		// kutsutaan taulukonmuokkausmetodia
		muokkaaTaulukko(taulukko, x);
		
		for ( int alkio : taulukko ) {
				System.out.print(alkio+" ");
			}
	}

	// syˆtt‰‰ arvot 0...x taulukkoon
	public static void muokkaaTaulukko ( int[] taulukko, int x ) {
		
		// syˆtt‰‰ arvot taulukkoon modulo pituus
		for ( int i = 0 ; i <= x ; i++ ) {
			taulukko[i % taulukko.length] = i;
		}
	}
}
