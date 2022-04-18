package interviewQuestions3_;

import java.util.Arrays;

public class Q06_MultiDimensolArray_ {
    /*
int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
verilen Array icinde
--> kac tane eleman oldugunu return eden methodu yazdiriniz //cevap : 13 donsun
*/
    public static void main(String[] args) {

        int arr[][] = {{7, 12, 97, 23}, {543, 23, 675}, {2}, {2, 33, 6, 3, 7}}; // multiDimensolArray
        elemanSayisi(arr);
    }

    private static void elemanSayisi(int[][] arr) {
        int sayac = 0; // Bir sayac oluşturuyoruz.

        for (int i = 0; i < arr.length; i++) { // Outer Lopp dönüyor
            for (int j = 0; j < arr[i].length; j++) { // İnner loop dönüyor
                sayac++; // Sayaç Artıyor
            }
        }
        System.out.println("arr Dizisi: "+Arrays.deepToString(arr)); // arr dizisi yazdırılıyor
        System.out.println("arr dizisinde < " + sayac + " > eleman bulunuyor");

    }
}

