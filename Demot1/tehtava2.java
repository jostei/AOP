import java.util.Scanner;

public class tehtava2 {
  public static void main(String[] args){
    
    Scanner lukija = new Scanner(System.in);
    
    System.out.print("Syötä syntymävuotesi: ");
    String vuosi = lukija.nextLine();                                                                  // pyydetään käyttäjältä syntymävuosi
    
    if ( 2017 - Integer.parseInt(vuosi) <= 18 ){                                                       // testataan onko alaikäinen 2017 lopussa
      System.out.println("Olet alaikäinen vuoden 2017 lopussa! No beer for you!");                     // ei kaljaa jos alaikäinen
    }else{                                                                                             // muulloin kaljaa
      System.out.println("Olet yli 18 ikäinen vuoden 2017 lopussa! Have a beer!");
    }
  }
}