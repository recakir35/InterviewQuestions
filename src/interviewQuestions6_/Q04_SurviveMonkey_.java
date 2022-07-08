package interviewQuestions6_;

public class Q04_SurviveMonkey_ {
    /*
    There is a lonely monkey in the island
    He needs to eat 4 bananas every day
    there are just 165 bananas in that island
    Create following variables and find how many days
    monkey can survive.
    Use do while loop, increment and decrement and if statements
    int numberOfBananas =165, survivalDays = 1;
    boolean monkeyAlive = true;
    */
    public static void main(String[] args) {
        int numberOfBananas = 165;
        int survivalDays = 0;
        boolean monkeyAlive = true;

        do {
            numberOfBananas -= 4;// Hergün 4 muz yediği için muzun hergün azalması gerekiyor.
            survivalDays++;     // gün sayısı 1 artıyor.
            if (numberOfBananas < 0) { //Eğer kalan muz sayısı 0 dan küçükse
                monkeyAlive = false;    // Maymun öldü
            }
        } while (monkeyAlive); // Maymun canlı olduğu müddet döngü devam eder
        System.out.println("Maymun : " + survivalDays + " gün yaşadı");
    }
}

