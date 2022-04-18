package interviewQuestions4;

import java.util.ArrayList;
import java.util.Random;

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

        Random rnd = new Random();  // Random bir obje tanımladık
        for (int i = 0; i < 10; i++) { // 0 den 10 kadar döngü gurduk
            list.add(rnd.nextInt(20)); // listeye rastgele 1-20 arası rakam atadık
        }
        System.out.println("Oluşan List: " + list); // oluşan listeyi yazdırdık
        boolean ciftSayiVarMi = false;
        for (int i = 0; i < list.size(); i++) { //listeyi baştan sona geziyoruz.
            if (list.get(i) % 2 == 0) { // listenin elemanlarından çift sayı olanlar
                list.set(i, 111);       // listenin çift elemanlarına 111 atadık
                ciftSayiVarMi = true;   // çift sayı olduğundan true atadık
            }
        }
        System.out.println("Dönüşen List: " + list); // yeni oluşan listeyi yazdırdık
        if (!ciftSayiVarMi) System.out.println("çift sayı yoktur");// çift sayı yoksa mesajı yazdırdık
    }
}

