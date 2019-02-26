import java.util.Scanner;

public class D2_Teht6 {

	public static void main(String[] args){

		// luodaan skanneri ja kysyt‰‰n k‰ytt‰j‰lt‰ yksi kokonaisluku a
		Scanner s = new Scanner(System.in);
		System.out.println("Anna kaksi lukua:");
		int a = s.nextInt();

		// testataan onko luku a positiivinen
		// muutos: if -> while, jotta lukua kysyt‰‰n niin kauan ett‰ a > 0
		while (a < 0){
			System.out.println("Luvun t‰ytyy olla positiivinen. Anna uusi luku:");
			a = s.nextInt();			
		}

		// kysyt‰‰n toinen kokonaisluku b
		System.out.println("Kiitos! Anna seuraava luku:");
		int b = s.nextInt();

		// tulostetaan a:n neliˆjuuri
		System.out.println(Math.sqrt(a));
		System.out.println("----");

		int temp = a;
		a = b%a;
		b = temp;

		for ( int i = 0 ; i < 3; i = i + 1 ) {
			if ( a > 0 ) {
				temp = a;
				a = b%a;
				b = temp;
			}else {
				break;
			}
		}

		/* asetetaan b:hen a:n arvo ja a:han jakoj‰‰nnˆs b mod a
		int temp = 0;
		temp = a;
		a = b%a;
		b = temp;

		// b ei ole jaollinen a:lla (b%a != 0) suoritetaan sama uudestaan, max 3 kertaa
		if(a > 0){
			temp = a;
			a = b%a;
			b = temp;
		}
		if(a > 0){
			temp = a;
			a = b%a;
			b = temp;
		}
		if(a > 0){
			temp = a;
			a = b%a;
			b = temp;
		} */

		// turha rivi sill‰ t‰m‰ on jo tehty v‰hint‰‰n kerran
		// ja tehd‰‰n joka iffin lopussa uudestaan
		//temp = b;

		// tulostetaan b
		System.out.println(b);


		for ( int i = 0; i < 6; i = i + 1 ) {
			if ( temp > 0 ) {
				temp = temp - 1;
				System.out.println(temp);
			}else {
				break;
			}
		}

		/* t‰m‰ p‰tk‰ tulostaa temppi‰ 6 kertaa v‰hent‰en t‰st‰ joka kerta yhden, jos temp on suurempi kuin 0
		if(temp > 0){
			System.out.println(--temp);
		}
		if(temp > 0){
			int luku = temp;
			luku = luku-1;
			System.out.println(luku);
		}
		if(temp > 0){
			temp = temp-2;
			System.out.println(temp);
		}
		if(temp > 0){
			int x = --temp;
			System.out.println(x);
			temp--;
		}
		if(temp > 0){
			System.out.println(temp);			
		}
		if(temp > 0){
			temp -= 1;
			System.out.println(temp);
		} */
		s.close();
	}
}

