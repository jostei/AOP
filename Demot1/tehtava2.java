import java.util.Scanner;

public class tehtava2 {
  public static void main(String[] args){
    
    Scanner lukija = new Scanner(System.in);
    
    System.out.print("Sy�t� syntym�vuotesi: ");
    String vuosi = lukija.nextLine();                                                                  // pyydet��n k�ytt�j�lt� syntym�vuosi
    
    if ( 2017 - Integer.parseInt(vuosi) <= 18 ){                                                       // testataan onko alaik�inen 2017 lopussa
      System.out.println("Olet alaik�inen vuoden 2017 lopussa! No beer for you!");                     // ei kaljaa jos alaik�inen
    }else{                                                                                             // muulloin kaljaa
      System.out.println("Olet yli 18 ik�inen vuoden 2017 lopussa! Have a beer!");
    }
  }
}