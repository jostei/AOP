import java.util.Scanner;

public class tehtava5 {
  public static void main(String[] args){
    
    Scanner lukija = new Scanner(System.in);
    
    System.out.println("Syötä kokonaislukuarvoiset kertoimet toisen asteen yhtälölle ax^2 + bx + c = 0: ");
    
/*    System.out.print("Kerroin a: ");
    double a = Double.parseDouble(lukija.nextLine());                                   // luetaan karroin a doublena
    System.out.print("Kerroin b: ");
    double b = Double.parseDouble(lukija.nextLine());                                   // luetaan karroin b doublena
    System.out.print("Kerroin c: ");
    double c = Double.parseDouble(lukija.nextLine());                                   // luetaan karroin c doublena */
    
    System.out.print("Kerroin a: ");
    int a = Integer.parseInt(lukija.nextLine());                                        // luetaan karroin a inttinä
    System.out.print("Kerroin b: ");
    int b = Integer.parseInt(lukija.nextLine());                                        // luetaan karroin b inttinä
    System.out.print("Kerroin c: ");
    int c = Integer.parseInt(lukija.nextLine());                                        // luetaan karroin c inttinä
    
    double xEka = ((-b-Math.sqrt(b*b-4*a*c))/(2*a));
    double xToka = ((-b+Math.sqrt(b*b-4*a*c))/(2*a));
    
    System.out.println("Tämän toisen asteen yhtälön juuret ovat:");
    if(b*b-4*a*c < 0){                                                                  // testataan antaakoa yhtälö reaalilukuarvoiset juuret
      System.out.println("Ei reaalijuuria.");
    }else if(b*b-4*a*c == 0){                                                           // testataan onko yhtälöllä vain yksi juuri
      System.out.println("Yksi reaalijuuri (x_1 == x_2): "+xEka);                        
    }else{                                                                              // jos kumpikaan arvo ei ole NaN, tulostetaan juuret
      System.out.println("x_1 = "+xEka);
      System.out.println("x_2 = "+xToka);
      
    }
  }
}