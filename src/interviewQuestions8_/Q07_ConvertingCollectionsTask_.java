package interviewQuestions8_;

import java.util.*;

public class Q07_ConvertingCollectionsTask_ {

    // create an array of random numbers of size 10
    // convert that array into a list
    // convert list into set

    // 10 boyutunda rasgele sayılardan oluşan bir array oluştur
    // bu arrayi bir listeye dönüştür
    // listeyi sete çevir
    public static void main(String[] args) {
        Random rand = new Random(); // Random Clasından bir obje ürettik
        int arr[] = new int[10]; // Bir Array Tanımladık.

        for (int i = 0; i < arr.length; i++) { // tanımlanan arraya rast gele elemanlar koyduk
            arr[i] = rand.nextInt(30);
        }
        System.out.println("Array: "+ Arrays.toString(arr));

        List<Integer> arrList=new ArrayList<>(); // Bir list tanımlandı
        for (Integer each: arr){
            arrList.add(each); //Dizideki elemanlar liste atılıyor.
        }
        System.out.println("Liste Çevrilen Arr: "+ arrList);

        Set<Integer> setListArr = new HashSet<>(); // Set oluşturuldu
        setListArr.addAll(arrList); // list sete atıldı
        System.out.println("Set'e Çevrilen List: "+ setListArr);
    }
}
