package jobsheet.jobsheet7;

import java.util.Scanner;

public class SiakadWhile20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score, totalStudents, i = 0;

        System.out.print("Enter number of students: ");
        totalStudents = sc.nextInt();

        while (i < totalStudents) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            score = sc.nextInt();

            if (score < 0 || score > 100) {
                System.out.println("Invalid score! Please enter again.");
                continue;
            }

            if (score > 80) {
                System.out.println("Grade: A");
                System.out.println("Good, keep it up!");
            } else if (score > 73) {
                System.out.println("Grade: B+");
            } else if (score > 65) {
                System.out.println("Grade: B");
            } else if (score > 60) {
                System.out.println("Grade: C+");
            } else if (score > 50) {
                System.out.println("Grade: C");
            } else if (score > 39) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: E");
            }

            i++;
        }
    }

}
