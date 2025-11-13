package jobsheet.jobsheet9;

import java.util.Arrays;
import java.util.Scanner;

public class AthleteData {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sports = {"Badminton", "Table Tennis", "Basketball", "Volleyball"};
        String[][] athletes = new String[4][5];

        for (int i = 0; i < sports.length; i++) {
            System.out.println("\nEnter 5 athletes for " + sports[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Name " + (j + 1) + ": ");
                athletes[i][j] = sc.nextLine();
            }
            Arrays.sort(athletes[i]);
        }

        System.out.println("\n=== Sorted Athlete List ===");
        for (int i = 0; i < sports.length; i++) {
            System.out.println(sports[i] + ":");
            for (String name : athletes[i]) {
                System.out.println("- " + name);
            }
        }
    }
}
