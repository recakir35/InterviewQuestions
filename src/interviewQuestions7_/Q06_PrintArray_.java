package interviewQuestions7_;

public class Q06_PrintArray_ {
    // Create a method which takes String array as a parameter
    // and prints all the element

    public static void main(String[] args) {

        String[] meyveler = {"üzüm", "ayva", "armut", "karpuz", "kavun", "elma", "çilek", "erik"};
        yazdir(meyveler);

    }

    private static void yazdir(String[] meyveler) {
        for (String each : meyveler) {
            System.out.print(each + " ");
        }
    }
}
