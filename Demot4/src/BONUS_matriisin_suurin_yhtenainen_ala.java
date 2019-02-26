
public class BONUS_matriisin_suurin_yhtenainen_ala {



	public static void main(String[] args){

		int[][] matriisi = {{0,0,0,1,1},{0,0,1,1,0},{0,0,1,1,1},{1,0,0,0,1},{1,0,0,1,1}};

		for ( int i = 0 ; i < matriisi.length ; i++ ) {
			for ( int j = 0 ; j < matriisi.length ; j++ ) {
				System.out.print(matriisi[i][j]+" ");
			}
			System.out.println("");
		}

		int alaSumma = 0;
		int suurinAla = 0;

		for ( int i = 0 ; i < matriisi.length ; i++ ) {
			for ( int j = 0 ; j < matriisi.length ; j++ ) {
				if ( matriisi [i][j] == 1 ) {
					System.out.println(" i: "+i+" j: "+j);
					alaSumma = laskeAla( i , j , matriisi );
				}
				if(alaSumma >= suurinAla) {
					suurinAla = alaSumma;
				}
			}

			System.out.println(" Suurin ala: "+suurinAla);
			System.out.println("\n");
		}

		for ( int i = 0 ; i < matriisi.length ; i++ ) {
			for ( int j = 0 ; j < matriisi.length ; j++ ) {
				System.out.print(matriisi[i][j]+" ");
			}
			System.out.println("");
		}

		System.out.println("Suurimman summa: "+suurinAla);
	}


	public static int laskeAla ( int x , int y , int[][]matriisi ) {

		int summa = 1;
		matriisi[x][y] = 0;

		if ( x != matriisi.length-1 ) {
			if ( matriisi[x+1][y] == 1 ) {
				summa = summa + laskeAla ( x+1 , y , matriisi );
			}
		}
		if ( x != 0 ){
			if ( matriisi[x-1][y] == 1 ) {
				summa = summa + laskeAla ( x-1 , y , matriisi );
			}
		}
		if ( y != matriisi.length-1 ) {
			if( matriisi[x][y+1] == 1 ) {
				summa = summa + laskeAla ( x , y+1 , matriisi );
			}
		}
		if ( y != 0 ){
			if ( matriisi[x][y-1] == 1 ) {
				summa = summa + laskeAla ( x , y-1 , matriisi );
			}
		}
		return summa;

	}


	public static boolean onkoVasenYksi ( int x , int y , int[][]matriisi ) {
		if ( matriisi[x][y-1] == 1 ) {
			return true;
		}else {
			return false;
		}
	}

	public static boolean onkoOikeaYksi ( int x , int y , int[][]matriisi ) {
		if ( matriisi[x][y+1] == 1 ) {
			return true;
		}else {
			return false;
		}
	}

	public static boolean onkoAlasYksi ( int x , int y , int[][]matriisi ) {
		if ( matriisi[x+1][y] == 1 ) {
			return true;
		}else {
			return false;
		}
	}


}
