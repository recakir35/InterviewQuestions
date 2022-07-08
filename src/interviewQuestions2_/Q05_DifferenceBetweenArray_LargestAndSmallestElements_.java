package interviewQuestions2_;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_DifferenceBetweenArray_LargestAndSmallestElements_ {
    /*
 Create a function that takes an array and the difference between the largest
 and the smallest numbers.
 Ask user to enter array elements.
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Dizi eleman Sayısını giriniz: ");
        int arraylenth = scan.nextInt();

        dizielemanlariniGirme(arraylenth); // method oluşturuluyor.

    }

    private static void dizielemanlariniGirme(int arraylenth) {
        int arr[] = new int[arraylenth];
        int count = 0;
        do {                                // Dizi elemanlarını girme
            System.out.println("Dizinin " + count + " . elemanını giriniz: ");
            int sayi = scan.nextInt();
            arr[count] = sayi;
            count++;
        } while (count < arraylenth); // sayac dizi eleman sayısından küçük olduğu müddetçe dönecek
        System.out.println(Arrays.toString(arr));  // girilen dizi yazdırılıyor.
        Arrays.sort(arr); // girilen dizi sıralanıyor.
        System.out.println("Dizinin En büyük elemanı ile en küçük elemanı farkı: " + // dizinin 0. indexi en küçük sayı en son indexte en büyük sayıdır.
                arr[arr.length-1] + " - " + arr[0]  + " = " + (arr[arr.length-1] - arr[0]));
    }

}
