public class tehtava1 {
  public static void main(String[] args){
    
    if(args[0].length() < args[1].length() && args[0].length() < args[2].length()){              // testataan onko ensimmäinen jono lyhin
      System.out.println(args[0]);
    }else if (args[1].length() < args[0].length() && args[1].length() < args[3].length()){       // jos ei, testataan toinen jono
      System.out.println(args[1]);
    }else{                                                                                       // jos kumpikaan ei ole lyhi jono, tulostetaan kolmas
      System.out.println(args[2]);
      
    }
  }
}