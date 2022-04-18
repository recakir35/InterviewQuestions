package interviewQuestions2;

import java.util.Scanner;

public class Q04_PerfectNumber_ {
    /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı giriniz: ");
        int sayi = scan.nextInt();

        mukemmelSayi(sayi);
        verilenSayiyaKadarMukemmelSayilar(sayi);
    }

    //Mükemmel Sayi Bulma Methodu
    private static void mukemmelSayi(int sayi) {
        int toplam1 = 0;
        for (int i = 1; i < sayi; i++) { //1 den basliyor burada bolenleri kontrol edecegiz, sayi dahil degil dedigi icin <= yapmadik
            if (sayi % i == 0) {             //sayinin herhangi bir boleni varsa(i-> bolen)
                toplam1 += i;
            }
        }
        if (toplam1 == sayi) {              //bolenlerin toplami sayiya esitese
            System.out.println(sayi + " Sayısı Mükemmel bir sayıdır.");
        } else System.out.println(sayi + " Sayısı Mükemmel bir sayı DEĞİL'dir.");
    }

    // Kullanici tarafindan bir sayiya kadar olan sayilarin,
    // mukemmel olup olmadigini bulan method yaziniz.
    private static void verilenSayiyaKadarMukemmelSayilar(int sayi) {
        int toplam = 0;
        System.out.print("\n"+sayi+ " sayısına kadar olan mükemmel sayılar: ");
        for (int i = 2; i <= sayi; i++) {// 1.verilen sayıya kadar olan sayıları dönüyor.
            toplam = 0;
            for (int j = 1; j < i; j++) { // 1.deki i değerini yine 1 ile i arasındaki değerlere bölüyor.
                if (i % j == 0) { // eğer tam bölünebiliyorsa j değerini topluyor.
                    toplam += j;
                }
            }
           // System.out.println(i+" "+ toplam);
            if (i == toplam) { // mükemmel sayı şartı
                System.out.print(i + " ");
            }
        }

    }
}