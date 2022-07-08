package interviewQuestions5_;

import java.util.Scanner;


public class Q02_PrintEvenNumber_ {
    /*
    Write a method named isEven that accepts an integer argument.
    The method should return true if the argument is even, or false otherwise.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayı giriniz: ");
        int sayi = scan.nextInt();
        if (isEven(sayi)) {
            System.out.println("Verilen değer çift sayıdır.");
        } else System.out.println("Verilen değer tek sayıdır.");
    }

    private static boolean isEven(int sayi) {
       return (sayi%2==0);// tek veya çift sayi döndürüyor
    }

}
