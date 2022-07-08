package interviewQuestions6_;


import java.util.Scanner;

public class Q03_OddIndexNumber_ {
    // indexi tek sayi olan karakterleri yazdiran bir code create ediniz
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Metin Giriniz: ");
        String metin= scan.nextLine();

        for (int i = 0; i <metin.length() ; i++) {//
            if (i%2==1){
                System.out.print(metin.charAt(i)+ " ");
            }

        }

    }

}
