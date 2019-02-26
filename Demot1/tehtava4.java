import java.util.Scanner;

public class tehtava4 {
  public static void main(String[] args){
    
    Scanner lukija = new Scanner(System.in);
    
    System.out.print("Syötä sähköpostiosoitteesi: ");
    String domain = lukija.nextLine();
    
    System.out.println("Email domainisi on: "+domain.substring(domain.indexOf('@')+1));
    
  }
}