import java.util.Scanner;

public class tehtava6_b {
  
  public static void main(String[] args){
    
    Scanner lukija = new Scanner(System.in);
    
    System.out.print("Syötä merkkijono A: ");       // luetaan käyttäjältä merkkijonot A ja B
    String ekaJono = lukija.nextLine();
    System.out.print("Syötä merkkijono B: ");
    String tokaJono = lukija.nextLine();
    
    String tokaJonoCaps = tokaJono.toUpperCase();   // caps versio tokaJonosta
    
    int[] indexVec = new int[ekaJono.length()];     // alustetaan ekaJonon pituinen int vektori
    
    for ( int x = 0; x < ekaJono.length(); x = x +1 ){
      indexVec[x] = 0;
    }
    
    String indexJono = "";     // kopioidaan muuttuja josta poistellaan kirjaimia sitä mukaan kun käydään 
    
    for ( int k = 0; k < ekaJono.length(); k = k + 1 ){
      indexJono = indexJono + ekaJono.charAt(k);
    }

    int i = 0;
    while ( indexJono.length() > 0 ){  // käydään läpi indexJono ja merkitään vektoriin indexVec onko kohdalla tokaJono vai ei
      if ( indexJono.indexOf(tokaJono) == 0 ){
        indexVec[i] = 1;
        indexJono = indexJono.substring(1);      // samalla indexJono pilkotaan alusta kirjain kerrallaan
      }else{
        indexVec[i] = 0;
        indexJono = indexJono.substring(1);
      }
      i = i + 1;
    }
    
    String parseJono = ekaJono;
    
    for ( int j = 0; j < ekaJono.length(); j = j + 1 ){
      if ( indexVec[j] == 1 ){
        parseJono = parseJono.substring(0, j) + tokaJonoCaps + parseJono.substring(j+tokaJono.length());
      }
    }
    System.out.println(parseJono);
    lukija.close();
  }
}