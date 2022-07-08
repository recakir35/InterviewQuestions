package interviewQuestions5_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04_PrintVowelsOfString_ {
    //Get String from user and print just vowels(aeiou) inside String on the console
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen String bir ifade giriniz: ");
        String str = scan.nextLine();

        List<String> strSesli = new ArrayList<>();
        String strArr[] = str.split("");
        String str2 = "aeiıoöuü";

        System.out.print("Sesli Harfler: ");
        for (int i = 0; i < strArr.length; i++) {
            if (str2.contains(strArr[i]) && !strSesli.contains(strArr[i])) {
                strSesli.add(strArr[i]);
            }
        }
        System.out.println("Sesli Harfler: "+strSesli);
    }
}


