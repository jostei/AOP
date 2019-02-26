import java.util.Scanner;

public class D2_Teht1 {

 public static void main(String[] args) {
  
  Scanner lukija = new Scanner(System.in);
  
  int lukumaara = lukija.nextInt();
  
  int y = 1;
  
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
    System.out.print(y+" ");
    y = y + i + 1;
   }
  }
  
  lukija.close();
 }
}
