package interviewQuestions8_;

import java.util.ArrayList;
import java.util.Arrays;

public class Q02_2D_CollectionsTask_ {
    // Create 2D ArrayList which can store String ArrayLists
    // Create 3 ArrayLists which are Employees, Employers, Companies
    // Store this 3 ArrayList in 2D ArrayList

    // String ArrayList'leri depolayabilen 2D ArrayList oluşturun
    // Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
    // Bu 3 ArrayList'i 2D ArrayList'te saklayın
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> listeler=new ArrayList<>();

        ArrayList<String> calisanlar=new ArrayList<>(Arrays.asList("Ali","Leyla","Zafer","Şeyma","Hayrettin","Yasemin"));
        ArrayList<String> isverenler=new ArrayList<>(Arrays.asList("Hayri","Fatma","Muhammet","Sevda","Mahmut","Canan"));
        ArrayList<String> sirketler=new ArrayList<>(Arrays.asList("IBM","Migros","A101","Bim","Lassa","Hp"));

        listeler.add(calisanlar);
        listeler.add(isverenler);
        listeler.add(sirketler);

        System.out.println(listeler);
    }
}
