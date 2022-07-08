package interviewQuestions9;

import java.util.HashMap;
import java.util.Map;

public class Q05_PrintMap_ {
    /*
        Hashmap ile 1 den 6 ya kadar sayilari sayi ve okunusu seklinde yazdirin
    */

    public static void main(String[] args) {
      HashMap<Integer,String> map=new HashMap<>();
      map.put(1, "Bir");
      map.put(2, "İki");
      map.put(3, "Üç");
      map.put(4, "Dört");
      map.put(5, "Beş");
      map.put(6, "Altı");

      for (Map.Entry<Integer,String> each: map.entrySet()){
          System.out.println("Sayı: "+ each.getKey()+" Konusu: "+ each.getValue());
      }
    }
}
