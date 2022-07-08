package interviewQuestions7_;

public class Q05_Printing2DArray_ {

        // Print 2D String array using loops

    public static void main(String[] args) {
        String [][] arr = {{"abc","def","ghi"}, {"jkl","mno","prs"}};

        for (int i = 0; i <arr.length ; i++) { // outter array dönüyor
            for (int j = 0; j <arr[i].length; j++) {// inner array dönüyor
                System.out.print(arr[i][j]+" "); // sadece elemanları yazdırır
            }
            System.out.println();
        }
    }
}
