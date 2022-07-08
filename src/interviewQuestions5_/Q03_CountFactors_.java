package interviewQuestions5_;

import java.util.Scanner;

public class Q03_CountFactors_ {
      /*
        Type java code by using while loop,
       Write a program to count the factors of an integer which is entered by user.
       Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
       Factors of 8  = 1, 2, 4, 8 ==> 4
*/
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.print("Bir Tamsayi Giriniz: ");
          int sayi = scan.nextInt();

          int count=0;
          System.out.print(sayi+" = ");
          for (int i = 1; i <= sayi ; i++) {
              if (sayi%i==0) {
                  count++;
                  System.out.print(i+" ");
              }
          }
          System.out.print(" ==> "+count);

      }
  }
