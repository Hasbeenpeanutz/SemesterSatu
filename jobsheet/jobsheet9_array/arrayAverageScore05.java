package jobsheet.jobsheet9_array;

import java.util.Scanner;

public class arrayAverageScore05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score = new int[10];
        int total = 0;
        double avarage ;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter score for student " + (i+1) + ": ");
            score[i] = sc.nextInt();
            total += score[i];
        }

        double average = total / (double) score.length;
        System.out.println("\nTotal = " + total);
        System.out.println("Average = " + average);

        int passCount = 0, max = score[0], min = score[0];

        for (int i = 0; i < score.length; i++) {
            if (score[i] > 70) passCount++;
            if (score[i] > max) max = score[i];
            if (score[i] < min) min = score[i];
        }

        System.out.println("Students passing: " + passCount);
        System.out.println("Highest score: " + max);
        System.out.println("Lowest score: " + min);

        sc.close();
    
    }
}
