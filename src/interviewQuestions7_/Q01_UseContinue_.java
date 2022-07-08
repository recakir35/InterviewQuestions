package interviewQuestions7_;

import java.util.Scanner;

public class Q01_UseContinue_ {

    // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
    // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Kelime giriniz: ");
        String word = scan.nextLine();

        for (int i = 0; i < word.length(); i++) { // kelimenin 0. indexinden sonuncu indexsine kadar döngüye konur
            if (!(word.charAt(i) == 'a') && !(word.charAt(i) == ' ')) {// eğer verilen index a harfi veya boşluk ise onu yazdırmaz
                System.out.println(word.charAt(i));
            }
        }
    }

}
