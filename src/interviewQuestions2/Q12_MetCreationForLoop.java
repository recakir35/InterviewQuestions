package interviewQuestions2;

import java.util.Scanner;

public class Q12_MetCreationForLoop {

		/* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Bir String Giriniz: ");
            String str = scan.nextLine();
            String tersStr="";

            for (int i = 1; i <= str.length(); i++) {
                tersStr+=str.charAt(str.length()-i);

            }
            System.out.println(tersStr);
        }
}