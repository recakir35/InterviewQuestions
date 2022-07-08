package interviewQuestions4_;

public class Q06_MultipleMethodVarargs_ {
    /*
	Problem Tanımı :
	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
	yazdıran parametreli method yazınız
 */
    public static void main(String[] args) {
        int not[] = {6, 4, 3, 5};

        System.out.println("Not Ortalaması= "+notOrtalamasi(not));
    }

    private static double notOrtalamasi(int[] not) {
        double ort=0;
        for (int each:not){
            ort+=each;
        }
        return ort/not.length;
    }

}
