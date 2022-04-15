package interviewQuestions2;

import java.util.Scanner;

public class Q01_ArmstrongNumber {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;


        do {
            System.out.print("Lütfen Üç basamaklı bir sayı giriniz: ");
            sayi = scan.nextInt();
        } while (sayi < 99 || sayi > 1000);

        armstrongSayi(sayi);
        girilenSayiyaKadarOlanArmstrong(sayi);
    }

    public static void armstrongSayi(int sayi) {
        int girilenSayi = sayi;
        int basamaktakiSayi;
        int sayininKupleriToplami = 0;

        while (sayi > 0) {
            basamaktakiSayi = (sayi % 10);// Basamaktaki Sayıyı Bulur
            sayininKupleriToplami += (basamaktakiSayi * basamaktakiSayi * basamaktakiSayi);
            sayi = sayi / 10; // sayi yi bir basamak azaltır 123, 12 gibi
        }
        if (girilenSayi == sayininKupleriToplami) {
            System.out.println(girilenSayi + " Sayısı Armstrong bir sayıdır");
        } else System.out.println(girilenSayi + " Sayısı Armstrong bir sayı DEĞİLDİR ");
    }

    //soru 2 icin

    private static void girilenSayiyaKadarOlanArmstrong(int sayi) {
        for (int i = 1; i <= sayi; i++) {
            armstrongSayi(i);
        }
    }
}