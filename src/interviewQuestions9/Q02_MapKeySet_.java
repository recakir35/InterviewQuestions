package interviewQuestions9;

import java.util.*;

public class Q02_MapKeySet_ {
    // create a map of zipcodes and Cities, at least 3 entries
    // get the keySet and iterate over it, print the map like below:
    // zipcode1 => city1
    // zipcode2 => city2
    // part 2: print all the keys of the map

    public static void main(String[] args) {

        Map<Integer,String> sehir = new HashMap<>();
        sehir.put(34000,"İstanbul");
        sehir.put(6000,"Ankara");
        sehir.put(35000,"İzmir");
        sehir.put(45000,"Manisa");
        sehir.put(37000,"Kastamonu");

        for (Map.Entry<Integer,String> each : sehir.entrySet()){

            System.out.println(each.getKey()+" => "+ each.getValue());
        }

        System.out.println("Keyler: "+ sehir.keySet());

Set<Integer> keySehir=new TreeSet<>();// Doğal Sıralı
keySehir.addAll(sehir.keySet());
        System.out.println(keySehir);
 }
}
