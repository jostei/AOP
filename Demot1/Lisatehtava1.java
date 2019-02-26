
import java.util.ArrayList;
//import java.util.Collections;
/*
 Testataan luokkia Pelikortti ja Korttipakka. 
 */
public class Lisatehtava1 {
   
  public static void main(String[] args) {
     
    Korttipakka kp = new Korttipakka();
     
    kp.tulostaPakka();
     
  }
   
  // 
  static class Korttipakka {
     
    private ArrayList<Kortti> kortit = new ArrayList<Kortti>();
     
    public Korttipakka(){
      for( Maa m : Maa.values() ){
        for (int i = 1; i < 14; i++){
          kortit.add( new Kortti(m,i) );
        }
      }
    }
     
    // poistaa ja palauttaa n pההllimmהistה korttia pakasta
    /*public ArrayList<Kortti> nostaPakasta(int n){
     ArrayList<Kortti> temp = new ArrayList<Kortti>();
     for (int i = 0; i < n; i++){
     temp.add( kortit.get(0) );
     kortit.remove(0);
     }
     return temp;
     }*/
     
    public void palautaJarjestykseen(){
      ArrayList<Kortti> temp = new ArrayList<Kortti>();
      for(Maa m : Maa.values() ){
        for (int i = 1; i < 14; i++){
          temp.add( new Kortti(m,i) );
        }
      }
      kortit = temp;
    }
     
     
     
    // tulostaa pakan kaikki kortit
    public void tulostaPakka(){
      System.out.println("- - - - - - - - - - - - - - - - - -");
      System.out.println("TULOSTETAAN PAKAN KORTIT JÄRJESTYKSESSÄ:");
      for (Kortti k : kortit){
        System.out.println(k.toString());
      }
      System.out.println("- - - - - - - - - - - - - - - - - -");
    }
     
  }
   
  static class Kortti{
     
    private int arvo;
    private Maa maa;
     
    public Kortti(Maa maa, int arvo){
      this.maa = maa;
      this.arvo = arvo;
    }
     
    public String toString(){
      if (maa == Maa.PATA){
        return (char)'\u2660' + ( (Integer)arvo ).toString();
      }
      else if (maa == Maa.RUUTU){
        return (char)'\u2666' + ( (Integer)arvo ).toString();
      }
      else if (maa == Maa.RISTI){
        return (char)'\u2663' + ( (Integer)arvo ).toString();
      }
      return (char)'\u2764' + ( (Integer)arvo ).toString();
    }
     
  }
   
  enum Maa{
    PATA, HERTTA, RISTI, RUUTU
  }
   
}