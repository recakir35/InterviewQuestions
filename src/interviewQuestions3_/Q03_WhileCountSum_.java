package interviewQuestions3;

import java.util.Scanner;

public class Q03_WhileCountSum_ {
    //  Kullanicidan toplanmak uzere sayilar isteyin
    // sayi adedi 10'u gecerse veya toplam 500 'u gecerse
    // bu kadar sayi yeter
    // ".. adet sayi girdin, toplami..." yazdirin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        int sayac = 0;

        while (true) {          // bu döngü kırılana kadar devam eder
            if (toplam > 500) {// 1.şart
                System.out.println("Bu kadar sayı yeter. Girdiğin sayılar toplamı: " + toplam);
                break;      // şart sağlanırsa döngü kırılır
            } else if (sayac > 10) {// 2. şart
                System.out.println("Bu kadar sayı yeter." + sayac + " adet sayı girdin.");
                break;
            }
            System.out.print("Lütfen Sayı giriniz: ");
            sayi = scan.nextInt();
            toplam += sayi; // girilen sayı toplanıyor
            sayac++;        // sayaç artırılıyor.
        }

    }

}
