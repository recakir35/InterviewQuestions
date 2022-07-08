package interviewQuestions4_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q05_SpecialCharRemoveArray_ {
    /*
   Problem Tanımı :
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList( "$-13", "$15", "$20"));
        if (getSum(list)<0){
            System.out.println("Sonuç= -1");
        }else System.out.println("Sonuç= "+getSum(list));

    }

    private static int getSum(List<String> list) {
        int topla=0;
        for (String each: list){
            topla+=Integer.parseInt(each.substring(1));
        }

        return topla;
    }
}