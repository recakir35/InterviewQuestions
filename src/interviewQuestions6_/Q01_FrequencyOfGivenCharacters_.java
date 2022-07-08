package interviewQuestions6_;

public class Q01_FrequencyOfGivenCharacters_ {
    /*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.

   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */
    public static void main(String[] args) {

        String str = "AAABBCDD";
        frekans(str);
    }

    private static void frekans(String str) {
        String output = "";
        int sayac = 0;

        for (int i = 0; i < str.length(); i++) {// i karşılaştırılan değer
            sayac=0;
            for (int j = i; j < str.length(); j++) {// 1. karakter ile diğer tüm karakterler dönülüyor.
                if (str.substring(i, i + 1).equals(str.substring(j, j + 1))) {// 1.karaktere eşitse
                    sayac++;// sayaç 1 artacak
                }
            }
            if (!output.contains(str.substring(i, i + 1))) {// output stringi strnin 1. karakterini içermiyorsa outputa eklenecek
                output += str.substring(i, i + 1)+sayac;
            }
        }
        System.out.println(output);//outputyazdırılıyor.
    }
}


