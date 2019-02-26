import java.util.Scanner;

public class D2_Teht1 {

	public static void main(String[] args) {
		
		Scanner lukija = new Scanner(System.in);
		
		System.out.print("Syötä numeroiden lukumäärä: ");
		int lukumaara = lukija.nextInt();
		
		int x1 = 1;
		int x2 = 1;
		int apu = 1;
		
		for ( int i = 1; i <= 2*lukumaara; i = i + 1 ) {
			if ( i % 2 == 1 ) {
					System.out.print(x1+" ");
					apu = x2;
					x2 = x1 + x2;
					x1 = apu;
					
			}else {
				System.out.print((i*i)/4 +" ");
			}
		}
		
		lukija.close();
	}
}
