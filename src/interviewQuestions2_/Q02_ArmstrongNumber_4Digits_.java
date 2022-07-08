package interviewQuestions2_;

import java.util.Scanner;

public class Q02_ArmstrongNumber_4Digits_ {
   /*
    Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407, 1634)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
        1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634

        5 basamakli : 54748 */

   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Bir sayi giriniz :");
       String strSayi = scan.next();
       armstrongMethod(strSayi);

   }

    private static void armstrongMethod(String strSayi) {
       String arrSayi[]=strSayi.split("");
       int sayininKüplerininToplamı=0;
        for (int i = 0; i < arrSayi.length; i++) {
            sayininKüplerininToplamı+= Math.pow(Integer.valueOf(arrSayi[i]), arrSayi.length);
        }
       if (sayininKüplerininToplamı==Integer.parseInt(strSayi)){
           System.out.println(Integer.parseInt(strSayi) + " Sayısı Armstrong bir sayıdır");
       } else System.out.println(Integer.parseInt(strSayi) + " Sayısı Armstrong bir sayı DEĞİLDİR ");

    }

}
