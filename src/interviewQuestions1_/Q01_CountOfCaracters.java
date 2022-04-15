package interviewQuestions1_;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountOfCaracters {
    /*
      Kullanicidan bir String aliniz.
      String'de var olan her character'in sayisini ekrana yazdiriniz.
      Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
             abaa   ==> a=3  b=1
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz: ");
        String str = scan.nextLine();
        String arr[] = str.split("");// Str yi Diziye aktarıyoruz.
        int sayac = 0;

        Arrays.sort(arr);// Diziyi sıralıyoruz.
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) { // arr dizsinin lengthine kadar döner
            if (arr[i - 1].equals(arr[i])) { // eğer birinci karakter ile ikinci karakter eşitse sayacı bir artırır
                sayac++;
            } else {                         // eşit değilse birinci karakteri yazdırıp sayacı sıfırlar
                System.out.println(arr[i - 1] + " = " + (sayac+1));
                sayac = 0;
            }
            if (i == arr.length - 1) System.out.println(arr[i] + " = " + (sayac+1)); // son karaktere gelince tek kaldığından ayreten onu yazdırır
        }
    }

}

