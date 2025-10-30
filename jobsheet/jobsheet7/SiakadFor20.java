package jobsheet.jobsheet7;

import java.util.Scanner;
public class SiakadFor20 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double score, highest = 0, lowest = 100;
        int passed = 0, failed = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter student " + i + " score: ");
            score = sc.nextDouble();

            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }

            if (score >= 60) {
                passed++;
            } else {
                failed++;
            }
        }

        System.out.println("\nHighest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Number of students passed: " + passed);
        System.out.println("Number of students failed: " + failed);
    }
}