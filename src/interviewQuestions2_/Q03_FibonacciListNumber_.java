package interviewQuestions2_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03_FibonacciListNumber_ {

    /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Fibonacci Sayısı için bir Sayı giriniz: ");
        int sayi = scan.nextInt();
        int count = 1;

        List<Integer> fibonacci = new ArrayList<Integer>();
        fibonacci.add(0);
        fibonacci.add(1);

        if (sayi < 2) {
            System.out.println("1'den büyük bir sayı giriniz");
        } else {
            while (fibonacci.get(count) < sayi) {
                fibonacci.add(count + 1, (fibonacci.get(count) + fibonacci.get(count - 1)));
                count++;
            }
            if (fibonacci.get(fibonacci.size() - 1) > sayi) {
                fibonacci.remove(fibonacci.size() - 1);
                System.out.println("Girdiginiz sayi fibonacci dizisinde BULUNMAMAKtadir ." +
                        "\n Girilen sayiya kadar fibonacci dizisi : " + fibonacci);
            } else System.out.println("Girdiginiz sayi fibonacci dizisinde bulunmaktadir..:" + fibonacci);

        }

    }

}
