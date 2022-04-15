package interviewQuestions4;

import java.util.ArrayList;

public class Q02_CreateRandomList_SetList {
    // int array list oluşturun 10 elemandan oluşmalı
    // random ekle isinde void bir metod oluşturun  ve parametresi int array list olsun.
    // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
    // eğer çift sayı atarsa o elemaının yerine 111 yazsın
    // eğer çift sayı yoksa çift sayı yoktur mesajını versin.

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        randomEkle(list);
    }

    private static void randomEkle(ArrayList<Integer> list) {
        boolean ciftSayiVarMi=false;
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 20)); //0-20 arası sayı ekler
            // double veri tipine sahip olan Math.random classi hata verdiğinden
            //integer a casting yaptık. random() methodu 0-1 sayı üretir
        }
        System.out.println("Random Liste: "+list);
        for (int i = 0; i <list.size(); i++) {
            if (list.get(i)%2==0){
                ciftSayiVarMi=true;
                list.set(i,111);
            }
        }
        System.out.println("Random Liste: "+list);
        if (ciftSayiVarMi==false){
            System.out.println("Çift Sayı Yoktur");
        }
    }

}
