package jobsheet.midExam;

import java.util.Scanner;

public class theExam {
    public static void main(String[] args) {
        Scanner ans = new Scanner(System.in);

        System.out.println("=== Algorithms and Programming ===");
        System.out.print("Mid-term Exam ansore: ");
        double midAlgo = ans.nextDouble();
        System.out.print("Final Exam ansore: ");
        double finalAlgoExam = ans.nextDouble();
        System.out.print("Assignment ansore: ");
        double assignmentAlgo = ans.nextDouble();

        double finalAlgo = (midAlgo * 0.3) + (finalAlgoExam * 0.4) + (assignmentAlgo * 0.3);
        String statusAlgo = (finalAlgo >= 60) ? "PASSED" : "FAILED";

        // Data Structure
        System.out.println("\n=== Data Structure ===");
        System.out.print("Mid-term Exam ansore: ");
        double midDS = ans.nextDouble();
        System.out.print("Final Exam ansore: ");
        double finalDSExam = ans.nextDouble();
        System.out.print("Assignment ansore: ");
        double assignmentDS = ans.nextDouble();

        double finalDS = (midDS * 0.3) + (finalDSExam * 0.4) + (assignmentDS * 0.3);
        String statusDS = (finalDS >= 60) ? "PASSED" : "FAILED";

        double average = (finalAlgo + finalDS) / 2;
        String semesterStatus;

        if (statusAlgo.equals("PASSED") && statusDS.equals("PASSED")) {
            if (average >= 70) {
                semesterStatus = "SEMESTER PASSED";
            } else {
                semesterStatus = "SEMESTER FAILED (average < 70)";
            }
        } else {
            semesterStatus = "SEMESTER FAILED (one or more courses failed)";
        }

        System.out.println("\n===== GRADUATION RESULT =====");
        System.out.printf("Final ansore - Algorithms & Programming: %.2f (%s)%n", finalAlgo, statusAlgo);
        System.out.printf("Final ansore - Data Structure: %.2f (%s)%n", finalDS, statusDS);
        System.out.printf("Average Final ansore: %.2f%n", average);
        System.out.println("Semester Status: " + semesterStatus);

        ans.close();
    }
}
