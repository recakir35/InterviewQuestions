package interviewQuestions1_;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz: ");
        String kelime=scan.next();
        System.out.println("Kelimenin ilk ve son harfini kaç kez tekrarlatalım: ");
        int sayi=scan.nextInt();

        for (int i = 0; i <sayi; i++) { // girilen sayı kadar döngüye girer.
            System.out.print(kelime.substring(0,1)+kelime.substring(kelime.length()-1));// Stringin length kelimenin boyutudur index bunun bir eksiğidir. Ayrıca substring tek indexte indexten sonrasını iki indexte indexler arasını verir.
        }

    }
}
