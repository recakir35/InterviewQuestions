package interviewQuestions8_;

import java.util.*;

public class Q06_AddedOrNotTask_ {

    // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
    // count how many duplicates we have
    // find out what are the duplicated values

    // 1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
    // kaç tane kopyamız olduğunu sayin
    // yinelenen değerlerin ne olduğunu öğrenin
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1, 3, 1, 2, 4, 5, 3));
        Set<Integer> listSet=new HashSet<>(); // tekrarsiz uniq hale getirmek için set attık
        List<Integer> tekrarlananlist=new ArrayList<>();// tekrarlanan elemanları atacağımız list

        for (Integer each:list){
            if (!listSet.contains(each)){//Gelen Eleman Lissette yoksa içe varsa elseye gider
              listSet.add(each); //lissete eleman eklenir
            }else tekrarlananlist.add(each);// tekrarlananlistte eleman eklenir
        }
        System.out.println("Tekrarlanan Elemanların Sayısı: "+tekrarlananlist.size());
        System.out.println("Tekrarlanan Elemanların Listesi: "+tekrarlananlist);

// 2. yöntem
        List<Integer> tekrarsizlist=new ArrayList<>();
        for (Integer each:list){
            if (!tekrarsizlist.contains(each)) {
                tekrarsizlist.add(each);
            }else tekrarlananlist.add(each);
        }
        System.out.println("Tekrarsiz Elemanlar"+ tekrarsizlist);
        System.out.println("Tekrarlanan Elemanlar"+ tekrarlananlist);
    }
}
