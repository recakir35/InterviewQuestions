package interviewQuestions2_;

import java.util.Scanner;

public class Q12_MetCreationForLoop_ {

    /* Interview Question
     Write a Java program to reverse a string. Use for loop and create a method called
      reverseString */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Strin yazınız: ");
        String str = scan.nextLine();

        System.out.println(reverseString(str));
    }

    private static String reverseString(String str) {
        String tersStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            tersStr += str.charAt(i);
        }

        return tersStr;
    }
}

