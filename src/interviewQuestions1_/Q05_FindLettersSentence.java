package interviewQuestions1_;

import java.util.Scanner;

public class Q05_FindLettersSentence {

    public static void main(String[] args) {

        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir cümle giriniz: ");
        String cumle=scan.nextLine().toUpperCase();
        System.out.print("Lütfen bir harf giriniz: ");
        char harf=scan.next().toUpperCase().charAt(0);
        int count=0;

        for (int i = 0; i <cumle.length() ; i++) {// Girilen cümlenin karakter sayısı kadar dönecek
            if (harf==cumle.charAt(i)){// girilen harfi girilen cümlede arayacak bulursa sayıyı bir artıracak
                count++;
            }
        }
        System.out.println("<"+cumle+"> cümlesinde <"+ harf+ "> harfi "+count+" kez kullanılmıştır.");
    }

}
