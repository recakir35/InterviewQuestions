package interviewQuestions4;

import java.util.Scanner;

public class Q03_HackerLanguage_ {

// Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Metin Yazınız: ");
        String metin = scan.nextLine();

        hackerDili(metin);
    }

    private static void hackerDili(String metin) {
        String metinArr[] = new String[metin.length()]; // yeni metinimiz için bir dizi oluşturuyoruz.

        System.out.print("Hacker Dili: ");
        for (int i = 0; i < metin.length(); i++) {              // Metin elemanlarını dolaşıyoruz
            if (metin.substring(i, i + 1).equalsIgnoreCase("s")) { // Eğer eleman "s" ise
                metinArr[i] = "5";                                              // bu eleman 5 ile değiştiriliyor.
            } else if (metin.substring(i, i + 1).equalsIgnoreCase("a")) {// Eğer eleman "a" ise
                metinArr[i] = "4";                                              // bu eleman 4 ile değiştiriliyor.
            } else if (metin.substring(i, i + 1).equalsIgnoreCase("e")) {// Eğer eleman "e" ise
                metinArr[i] = "3";                                              // bu eleman 3 ile değiştiriliyor.
            } else if (metin.substring(i, i + 1).equalsIgnoreCase("i")) {// Eğer eleman "i" ise
                metinArr[i] = "1";                                              // bu eleman 1 ile değiştiriliyor.
            } else if (metin.substring(i, i + 1).equalsIgnoreCase("0")) {// Eğer eleman "o" ise
                metinArr[i] = "0";                                              // bu eleman 0 ile değiştiriliyor.
            } else metinArr[i] = metin.substring(i, i + 1); // yukarıdaki şartlar karşılanmıyorsa elemanı aynen atıyor.
            System.out.print(metinArr[i]); // diziyi tek tek yazdırıyor.
        }

    }

}

