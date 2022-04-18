package interviewQuestions3;

import java.util.Scanner;

public class Q04_FrequencyOfCertainChar_ {
    /*
    Kullanicidan bir isim ve karakter girmesini isteyin, sonra karakterin kac kez tekrarlandigini kontrol edin.
            char ch= 'e' ;
            String name ="Sevecen"
            => Tekrar Sayisi = 3

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir isim giriniz: ");
        String name = scan.nextLine();
        System.out.print("Lütfen bir karekter(harf) giriniz: ");
        char letter = scan.next().charAt(0);
        int sayac = 0;

        for (int i = 0; i < name.length(); i++) {// dizi elemanları arasında dönüyoruz.
            if (name.charAt(i)==letter) {
                sayac++;
            }
        }
        System.out.println("< " + letter + " > karakteri " + sayac + " kez tekrarlanıyor.");
    }

}

