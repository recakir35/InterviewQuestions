package interviewQuestions8_;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Q01_SetTask_ {

    //  PART 1
    // create a method that accepts ArrayList<Integer> and Set<Integer> as parameters
    // and add all elements from ArrayList to Set

    // ArrayList<Integer> ve Set<Integer> öğelerini parametre olarak kabul eden bir yöntem oluşturun
    // ve tüm öğeleri ArrayList'ten Set'e ekleyin

    // PART 2
    // create a method that takes Set<Character> and varargs of char as parameters
    // and adds all chars to the set

    // Set<Character> ve char değişkenlerini parametre olarak alan bir yöntem oluşturun
    // ve tüm karakterleri sete ekleyin

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // List oluşturuluyor
        list.add(23); // List' eleman ekleniyor
        list.add(33);
        list.add(13);
        list.add(9);
        list.add(37);
        list.add(45);
        list.add(77);
        list.add(81);
        arryListiSeteCevir(list);

        //Bolum2
        Set<Character> characterSet = new HashSet<>(); // Set oluşturuluyor.
        seteCharacterEkle(characterSet,'A','B','C','R','r','q'); // Sete eleman eklemek için varargs kullanılıyor
    }

    private static void seteCharacterEkle(Set<Character> characterSet, Character ...chars) {
        for (int i = 0; i <chars.length ; i++) {
            characterSet.add(chars[i]);
        }
        System.out.println(characterSet);
    }

    private static void arryListiSeteCevir(ArrayList<Integer> list) {
        Set<Integer> listSet = new HashSet<>();
        for (Integer each : list) {
            listSet.add(each);
        }
        System.out.println("Set: " + listSet);
    }
}
