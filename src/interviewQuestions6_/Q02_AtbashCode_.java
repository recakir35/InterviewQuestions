package interviewQuestions6_;

import java.util.Scanner;

public class Q02_AtbashCode_ {
    /*
      AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
      Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
      "abcdefghijklmnopqrstuvwxyz"; 26 harf
      "zyxwvutsrqponmlkjihgfedcba";
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.println("Şifrelemek istediğiniz metni giriniz: ");
        String metin=scan.nextLine();
        int index=0;

        for (int i = 0; i < metin.length(); i++) {//metinin 1. karakteri ile sonuna kadar döner
            index='z'-metin.charAt(i); // metindeki harfin charat değeri z den çıkarıldığında aradaki fark ayna karaktere eşittir.
            System.out.print((char)('a'+index));
        }
    }

}

