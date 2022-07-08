package interviewQuestions4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Q01_UniqeArray {
    /*
     * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array haline getiren bir program yaziniz.
     *
     * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
     * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
     */

    public static void main(String[] args) {
        int input[] = {1, 2, 2, 3, 1, 4, 2, -2, 5, 6, 8, 7, 5, 6, -2, 9, 3, 10}; // verilen dizimiz

        List<Integer> tekrarsizListe = new ArrayList<>(); // Tekrarsız elemanları koyacağımız listemizi tanımladık

        for (int i = 0; i < input.length; i++) { // input dizisini baştan sona dönüyoruz.
            if (!tekrarsizListe.contains(input[i])) {// tekrarsızlist input dizisinden gelen elemanı içermiyorsa
                tekrarsizListe.add(input[i]); // input dizisinden gelen elemanı tekrarsız liste ekliyoruz.
            }
        }
        System.out.println(tekrarsizListe); // tekrarsizListe listemizi yazdırıyoruz.
    }
}
