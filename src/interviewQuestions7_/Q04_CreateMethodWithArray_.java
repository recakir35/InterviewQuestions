package interviewQuestions7_;

import java.util.Random;

public class Q04_CreateMethodWithArray_ {

    //    ||This Part Should be in Main Method||
    //
    //     -Create an array of size 5, assign some random values from 0 to 10
    //     -(use random class and for loop to assign values)
    //
    //
    //    ||You should create public static void methods fori loop (Parameter should be int Array for methods)||
    //
    //     -1-Create a method that prints array like "2 3 1 10 2", space between elements of array
    //     -2-Create a method that prints the sum of an array
    //     -3-Create a method that prints the max element of an array
    //
    //    P.S: Return type should be void because we are not returning anything just printing


    public static void main(String[] args) {
        Random rnd=new Random(); // Random sayı üretmek için obje oluşturuluyor
        int arr[]=new int[5]; // arr dizisi tanımlanıyor
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=rnd.nextInt(10);// arr dizisine rast gele 1 ile 10 arası sayı atanıyor.
        }

        diziyazdır(arr);
        diziTopla(arr);
        maxEleman(arr);
    }

    private static void maxEleman(int[] arr) {
        int max=Integer.MIN_VALUE;
        for (int each: arr){
            if (each>max) max=each;
        }
        System.out.println("Max Eleman= "+max);
    }

    private static void diziTopla(int[] arr) {
        int topla=0;
        for (int each:arr){
            topla+=each;
        }
        System.out.println("Toplam= "+topla);
    }

    private static void diziyazdır(int[] arr) {
        for (int each: arr){
            System.out.print(each+" ");
        }
        System.out.println();
    }
}
