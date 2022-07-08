package interviewQuestions7_;

import java.util.Scanner;

public class Q02_TreeShape_ {
    // Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
    // Not :govde sabit sayi olsun
    /* tac uzunlugu -> 6 iken

    ^
    ^^
    ^^^
    ^^^^
    ^^^^^
    ^^^^^^
    |||
    |||
    |||
    |||
    |||
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Taç sayısını giriniz: ");
        int tac=scan.nextInt();
        int govde=3;

        for (int i = 0; i <tac ; i++) {// Satır
            for (int j = 0; j <=i; j++) { // Sütün
                System.out.print("^");// yazılacak ifade
            }
            System.out.println();// alta geçmesi için
        }
        for (int i = 0; i <tac ; i++) {// satır sayısı
            for (int j = 0; j <govde; j++) {// sütün
                System.out.print("|"); // yazılacak ifade
            }
            System.out.println();
        }
    }

 }
