package practice_basic_day05;

import java.util.Scanner;

public class AYna {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Cümle veya Kelime Giriniz: ");
        String str = scan.nextLine();
        int sayac = 0;
        String yeniStr = "";
        boolean ozelKarakterMi = true;

        for (int i = 0; i < str.length(); i++) { //Stringin karakterleri arasında dönüyor
            for (char j = 'A'; j < 'Z'; j++) { // String Karakterlerinde büyük harfi kontrol ediyor
                if (str.charAt(i) == j) {
                    ozelKarakterMi = false;
                    yeniStr += (char) ('Z' - sayac);
                }
                sayac++;
            }
            sayac = 0;
            for (char j = 'a'; j < 'z'; j++) { // String Karakterlerinde küçük harfi kontrol ediyor
                if (str.charAt(i) == j) {
                    ozelKarakterMi = false;
                    yeniStr += (char) ('z' - sayac);
                }
                sayac++;
            }
            if (ozelKarakterMi){ // Büyük küçük harfler dışında bir özel karaktere sahipse onu yeni strye ekliyor.
                yeniStr+=str.charAt(i);
            }
            ozelKarakterMi = true;
            sayac = 0;
        }
        System.out.println(yeniStr);
    }
}
