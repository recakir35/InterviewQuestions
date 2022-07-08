package interviewQuestions3_;

import java.util.Scanner;

public class Q01_ReverseString_ {
        /*
		// Stringi ters cevirmek icin bir Java Programi yazin
		//1.Yol: StringBuilder () kullanarak
		//2.Yol: String Classini kullanarak
		//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir String Giriniz: ");
        String str = scan.nextLine();

        //1.Yol: StringBuilder () kullanarak
        StringBuilder build = new StringBuilder(str); // String'e str atayıp obje oluşturuyoruz.
        // build.append(str);  // Objeyi oluşturduktan sonra bu şekildede atama yapabilirdik
        System.out.println("1.Yol ==> StringBuilder: " + build.reverse()); // objeyi ters çevirip yazdırıyoruz.

        //2.Yol: String Classini kullanarak
        System.out.print("2.Yol ==> Strin Class: ");
        for (int i = str.length() - 1; i >= 0; i--) {   // str son indexten  ilk index'e doğru döner.
            System.out.print(str.charAt(i));            // son index'ten ilk index'e doğru yazdırır
        }

        //3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
   System.out.println("\n3.Yol ==> Method ile: "+ strTersArray(str)); // method çağırıyor.

    }

    private static String strTersArray(String str) {
        String arr[]=str.split(""); // str diziye aktarılıyor
        String tersStr="";
        for (int i = arr.length-1; i >=0; i--) { // dizinin son elemanından ilk elemanına doğru döner
            tersStr+=arr[i];                    // dizinin son elemanından ilk elemanına doğru yazar
        }

        return tersStr;
    }
}