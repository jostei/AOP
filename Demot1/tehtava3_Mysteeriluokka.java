public class tehtava3_Mysteeriluokka{
  public static void main(String[] args){
    
    String s = "Koodaus on kivaa!";              // asetetaan s:lle String-tyyppinen arvo
    int x = 0;                                   // asetetaan x:lle int-tyyppinen arvo 0
    
    for(int i=s.length(); i > 0; i++){           // aloitetaan for-looppi asettamalla muuttujaan i stringin s pituus ja kasvatetaan i:t� yhdell� per kierros
      if(s.length()==0){                         // testataan onko s:n pituus 0, ja for-looppi katkeaa jos n�in on
        break;
      }else{                                     // jos s:n pituus ei ole 0, kasvatetaan x:�� yhdell�
        x = x+1;
      }
      if(i >= s.length()){                       // edellisten toimintojen j�lkeen kysyt��n, onko i suurempi kuin s:n pituus
      i = i/2;
      s = s.substring(i);                        // jos n�in on, jaetaan i kahdella ja asetetaan s:n arvoksi puolet annetusta stringist�
      }                                          // t�t� jatketaan kunnes i = 1, jolloin i = i/2 = int(0.5) = 0 ja looppi katkeaa
    }
    
    System.out.println(x);                       // lopuksi tulostetaan x, joka kertoo montako kertaa s piti katkaista jotta for-looppi loppuu
    
  }
}