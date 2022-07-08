package interviewQuestions8_;

import java.util.*;

public class Q04_MapTask_ {
    // PART 1
    // create a map with groupName as key and groupMembers as value
    // "Group1" = ["Member1", "Member2"]
    // "Group2" = ["Member3", "Member4", "Member5"]


    // BÖLÜM 1
    // anahtar olarak groupName ve değer olarak groupMembers ile bir harita oluşturun
    // "Grup1" = ["Üye1", "Üye2"]
    // "Grup2" = ["Üye3", "Üye4", "Üye5"]

    // PART 2
    // find how many members each group has

    // BÖLÜM 2
    // her grubun kaç üyesi olduğunu bul
    public static void main(String[] args) {

        ArrayList<String> hayvanlar = new ArrayList<>(Arrays.asList("Kedi", "Köpek", "Aslan", "Kaplan", "Leopar", "Keçi"));
        ArrayList<String> bitkiler = new ArrayList<>(Arrays.asList("Buğday", "Arpa", "Yulaf", "Fasulye"));

        Map<String, ArrayList<String>> dunya = new HashMap<>();

        dunya.put("Hayvanlar", hayvanlar);
        dunya.put("Bitkiler", bitkiler);
        System.out.println(dunya);

        //2. bölüm

        Collection<String> keys = dunya.keySet();
        Collection<ArrayList<String>> values = dunya.values();
        for (ArrayList<String> each : values) {
            System.out.println(each.size());
        }
    }
}
