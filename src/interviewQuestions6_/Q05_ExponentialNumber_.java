package interviewQuestions6_;

import java.util.Scanner;

public class Q05_ExponentialNumber_ {
    //Get 2 numbers from the user.
    //first number base
    //second number Top
    //Write a code that calculates the prime of a number.
    // 2, 3 --> 2^3 = 2*2*2= 8

    // 4, 3 --> 4^3= 4*4*4 = 64

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Sayı Tabanı giriniz: ");
        int base=scan.nextInt();
        System.out.print("Lütfen sayı üstünüz giriniz: ");
        int top=scan.nextInt();
        int result=1;

        for (int i = 0; i <top ; i++) {// 0 dan verilen üsse kadar döngü oluşur.
            result*=base;        // verilen taban verilen üs sayısınca çarpılır
        }
        System.out.println("Sonuç= "+result);
    }

}
