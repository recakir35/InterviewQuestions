package interviewQuestions3;

import java.util.Scanner;

public class Q02_Palindrome_ {
    /*
      Crteate a program checks if a String is PALINDROME or not.
      If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
      For Example : "madam" or "nursesrun" .
      Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
      polindrome :tersten okunuşu da aynı olan ifadeierdir.
      ornek : Ey edip Adanada pide ye,  Traş niçin şart
       */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cümle veya Kelime giriniz: ");
        String str = scan.nextLine();

        if (palindromeMi(str)) {
            System.out.println("<" + str + "> Polindrome'dur");
        } else System.out.println(str + " Polindrome DEĞİL'dir");
    }

    private static boolean palindromeMi(String str) {
        boolean polindrome = false;
        // StringBuilder tersStr1 = new StringBuilder();  // StringBuilder ilede çözülebilir
        // tersStr1.append(str);
        // String tersStr=tersStr1.reverse().toString();

        String tersStr = "";
        for (int i = str.length() - 1; i >= 0; i--) { // str tersten yazdırıyoruz
            tersStr += str.charAt(i);
        }
        if (str.equalsIgnoreCase(tersStr)) polindrome = true; // Verilen String, tersten yazıldığındada aynı ise

        return polindrome;
    }
}
