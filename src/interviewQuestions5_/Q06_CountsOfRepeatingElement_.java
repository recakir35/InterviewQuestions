package interviewQuestions5_;

import java.util.Scanner;

public class Q06_CountsOfRepeatingElement_ {
    /*
            How many times a given number is repeated in a sequence
            Create the Java program that finds it.
     */

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 22, 23, 85, 58, 77, 66, 22, 23, 77};

        Scanner scan = new Scanner(System.in);
        System.out.print("Aranılan sayıyı giriniz: ");
        int tekrarlananSayi = scan.nextInt();
        int count = 0;

        for (int each : arr) {
            if (each == tekrarlananSayi) count++;
        }
        System.out.println(tekrarlananSayi+" Sayısı dizide "+ count+" kez tekrarlanmaktadır.");
    }
}
