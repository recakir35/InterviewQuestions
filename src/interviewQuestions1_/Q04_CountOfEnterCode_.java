package interviewQuestions1_;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String girilenPasword;
        String pasword = "rcp123";
        int girisHakki = 3;

        while (true) {
            System.out.print("Lütfen Şifrenizi giriniz: ");
            girilenPasword = scan.next();
            if (girilenPasword.equals(pasword)) {
                System.out.println("Tebrikler..." + girisHakki + ". denemede doğru şifreyi girdiniz.");
                break;
            } else {
                girisHakki--;
                System.out.println("Hatalı Şifre Girdiniz. " + girisHakki + " Deneme Hakkınız Kaldı");
            }
            if (girisHakki == 0) {
                System.out.println( "Giriş hakkınız kalmadı... Yardım için Müşteri hizmetlerimizi arayınız... ");
                break;
            }
        }
    }
}
