import java.util.Random;
import java.util.Scanner;


public class D3_Teht2 {

	public static void main(String[] args) {

		// luodaan skanneri ja kysytään noppien ja tahkojen määrää
		Scanner lukija = new Scanner(System.in);

		System.out.print("Syötä noppien määrä: ");
		int maara = lukija.nextInt();
		System.out.print("Syötä tahkojen määrä: ");
		int tahkomaara = lukija.nextInt();

		lukija.close();

		// heitetään noppia 10 kertaa ja tulostetaan summa
		for ( int j = 0; j < 10; j++) {
			System.out.println(maara+":n nopan simuloitu summa on: "+heitaNoppaa(maara, tahkomaara));
		}
	}


	public static int heitaNoppaa(int n, int tahkot) {

		// pohjustetaan muuttujat ja rng
		int summa = 0;
		Random arpoja = new Random();
		
		// summataan yhteen randomnumeroita väliltä 1...tahkot
		for (int i = 0; i < n; i++) {
			summa = summa + 1 + arpoja.nextInt(tahkot);
		}
		
		//palautetaan summa
		return summa;
	}

}
