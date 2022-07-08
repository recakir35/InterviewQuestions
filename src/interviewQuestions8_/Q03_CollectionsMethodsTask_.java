package interviewQuestions8_;

import java.util.*;

public class Q03_CollectionsMethodsTask_ {
    // part 1: create list of 5 numbers from user input
    // sort the list in reverse order and print it
    // shuffle the list and print it
    // rotate right by 3 places and print it

    // bölüm 1: kullanıcı girişinden 5 sayı listesi oluşturun
    // listeyi ters sırada sırala ve yazdır
    // listeyi karıştır ve yazdır
    // 3 yer sağa döndür ve yazdır

    // part 2: find the max number and min number, print them
    // replace all max number with min number

    // bölüm 2: maksimum sayıyı ve minimum sayıyı bulun, yazdırın
    // tüm maksimum sayıları minimum sayı ile değiştir
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> sayilar = new ArrayList<>();
        int kontrol = 0;

        while (kontrol < 5) {
            System.out.print("Sayi giriniz: ");
            sayilar.add(scan.nextInt());
            kontrol++;
        }

        Collections.sort(sayilar, Collections.reverseOrder());// Ters Sırala ve Yazdır
        System.out.println("Girilen Sayılar Büyükten Küçüğe Sıralı: " + sayilar);

        Collections.shuffle(sayilar);// Karışık Yazdır
        System.out.println("Verilen Sayıların Karışmış Hali: " + sayilar);
        Collections.rotate(sayilar, 3);// belirtilen listedeki öğeleri kaydırır
        System.out.println("rotate edildikten sonra: " + sayilar);


        System.out.println("Max Sayı: " + sayilar.stream().reduce(Math::max));
        System.out.println("Min Sayı: " + sayilar.stream().reduce(Math::min));
    }
}
