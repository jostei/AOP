import java.util.Scanner;

public class tehtava6 {
  
	public static void main(String[] args){
    
    Scanner lukija = new Scanner(System.in);
    
    System.out.print("Sy�t� merkkijono A: ");                                                                     // luetaan k�ytt�j�lt� merkkijonot A ja B
    String ekaJono = lukija.nextLine();
    System.out.print("Sy�t� merkkijono B: ");
    String tokaJono = lukija.nextLine();
    
    String uusiJono = ekaJono;
    
    while(uusiJono.indexOf(tokaJono)!=-1){                                                                        // etsit��n A:n ensimm�inen indeksi josta B l�ydet��n, toistetaan kunnes B:t� ei l�ydy en��
      String eiHailaitti1 = uusiJono.substring(0, uusiJono.indexOf(tokaJono));                                    // valitaan pala ennen B:n indeksi�
      String hailaitti = tokaJono.toUpperCase();                                                                  // lis�t��n v�liin B isoilla kirjaimilla
      String eiHailaitti2 = uusiJono.substring(uusiJono.indexOf(tokaJono)+tokaJono.length(),uusiJono.length());   // valitaan pala B:n j�lkeen A:sta
      uusiJono = eiHailaitti1+hailaitti+eiHailaitti2;                                                             // kasataan uusi merkkijono palasista jossa A:n ensimm�inen B:t� vastaava p�tk� korvattu isoilla kirjaimilla
    }
    
    System.out.println("T�ss� B:n highlightit jonosta A: "+uusiJono);                                             // tulostetaan uusi merkkijono
    lukija.close();
  }
}