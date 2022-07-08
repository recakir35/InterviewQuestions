package interviewQuestions9;

import java.util.HashMap;
import java.util.Map;

public class Q01_MapKeysValues_ {
    //5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
    //5 tane ulke ismi ve nufusunu yazdırıyoruz(country)
    //5 tane ulke ismi yazdırıyoruz. (keyset())
    //5 tane ulke nufusunu yazdırıyoruz. (values())
    //nüfusların toplamını yazdırın.
    //kaç tane 50 milyondan fazla nüfuslu ülke var?
    // ulke ve nufus  lari hem map gibi..hem de ayri ayri yazdirma ?

    public static void main(String[] args) {

        Map<String, Integer> ulkeNufusu = new HashMap<>();
        ulkeNufusu.put("Türkiye", 83);
        ulkeNufusu.put("Japonya", 50);
        ulkeNufusu.put("Çin", 300);
        ulkeNufusu.put("Hollanda", 30);
        ulkeNufusu.put("Almanya", 50);
        System.out.println("ulke isimleri ve nufuslari :" + ulkeNufusu + " milyondur");

        System.out.println("Ülke İsimleri: " + ulkeNufusu.keySet());
        System.out.println("Ülke Nüfusları: " + ulkeNufusu.values());
        int toplam = 0;

        for (Integer each : ulkeNufusu.values()) { // Ülke Nufus Toplamları
            toplam += each;
        }
        System.out.println("Toplam Ülke Nufusları: " + toplam);

        int sayac = 0;

        for (Integer each : ulkeNufusu.values()) {
            if (each > 50) {
                sayac++;
            }
        }

        System.out.println("50 Milyondan Fazla " + sayac + " Ülke var");
        for (Map.Entry<String, Integer> each : ulkeNufusu.entrySet()) {
            System.out.println(each);
        }
    }
}
