package interviewQuestions1_;

import java.util.Scanner;

public class Q03_PrimeNumber_ {
    /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir sayı giriniz: ");
        int sayi=scan.nextInt();
        boolean asalMi=true;

        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0){
                asalMi=false;
                break;
            }
        }
        if (asalMi){
            System.out.println(sayi + " Sayısı Asal Sayıdır.");
        }else System.out.println(sayi + " Sayısı Asal Sayı DEĞİLDİR");
    }
}
