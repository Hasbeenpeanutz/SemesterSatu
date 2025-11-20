package jobsheet.jobsheet9_array;

import java.util.Scanner;

public class arrayAverageScoreModified20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] score = new int[n];

        int passTotal = 0;
        int passCount = 0;

        int failTotal = 0;
        int failCount = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the final score " + i + ": ");
            score[i] = sc.nextInt();

            if (score[i] >= 70) {
                passTotal += score[i];
                passCount++;
            } else {
                failTotal += score[i];
                failCount++;
            }
        }

        double passAvg = (passCount > 0) ? (passTotal / (double) passCount) : 0;
        double failAvg = (failCount > 0) ? (failTotal / (double) failCount) : 0;

        System.out.println("The average score of students who passed is " + passAvg);
        System.out.println("The average score of students who failed is " + failAvg);

        sc.close();
    }
}
