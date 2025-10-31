package jobsheet.jobsheet6;

import java.util.Scanner;

public class caseMethod {
    public static void main(String[] args) {
        Scanner ans = new Scanner(System.in);

        double finalScore1, finalScore2, averageFinalScore;
        String letterGrade1 = null, letterGrade2 = null, status1 = null, status2 = null,  semesterStatus;

        System.out.println("==== INPUT STUDENT DATA ====");
        System.out.print("Name: ");
        String Name = ans.nextLine();
        System.out.print("NIM : ");
        String NIM = ans.nextLine();

        System.out.println("\n--- Course 1: Algorithms and Programming ---");
        System.out.print("MidTerm Score: ");
        double midTerm1 = ans.nextDouble();
        System.out.print("FinalExam Score: ");
        double finalExam1 = ans.nextDouble();
        System.out.print("Assignment Score: ");
        double Assignment1 = ans.nextDouble();
        
        System.out.println("\n--- Course 2: Data Structures ---");
        System.out.print("MidTerm Score: ");
        double midTerm2 = ans.nextDouble();
        System.out.print("FinalExam Score: ");
        double finalExam2 = ans.nextDouble();
        System.out.print("Assignment Score: ");
        double Assignment2 = ans.nextDouble();

        finalScore1 = (midTerm1 * 0.3) + (finalExam1 * 0.4) + (Assignment1 * 0.3);

        if (finalScore1 >80 && finalScore1 <= 100) {
            letterGrade1 = "A";
            status1 = "PASS";
        } else if (finalScore1 > 73 && finalScore1 <= 80) {
            letterGrade1 = "B+";
            status1 = "PASS";
        } else if (finalScore1 > 65 && finalScore1 <= 73) {
            letterGrade1 = "B";
            status1 = "PASS";
        } else if (finalScore1 > 60 && finalScore1 <= 65) {
            letterGrade1 = "C+";
            status1 = "PASS";
        } else if (finalScore1 > 50 && finalScore1 <= 60) {
            letterGrade1 = "C";
            status1 = "NOT PASS";
        } else if (finalScore1 > 39 && finalScore1 <= 50) {
            letterGrade1 = "D";
            status1 = "NOT PASS";
        } else if (finalScore1 <= 39) {
            letterGrade1 = "E";
            status1 = "NOT PASS";
        }

        finalScore2 = (midTerm2 * 0.3) + (finalExam2 * 0.4) + (Assignment2 * 0.3);
        if (finalScore2 >80 && finalScore1 <= 100) {
            letterGrade2 = "A";
            status2 = "PASS";
        } else if (finalScore2 > 73 && finalScore1 <= 80) {
            letterGrade2 = "B+";
            status2 = "PASS";
        } else if (finalScore2 > 65 && finalScore1 <= 73) {
            letterGrade2 = "B";
            status2 = "PASS";
        } else if (finalScore2 > 60 && finalScore1 <= 65) {
            letterGrade2 = "C+";
            status2 = "PASS";
        } else if (finalScore2 > 50 && finalScore1 <= 60) {
            letterGrade2 = "C";
            status2 = "NOT PASS";
        } else if (finalScore2 > 39 && finalScore1 <= 50) {
            letterGrade2 = "D";
            status2 = "NOT PASS";
        } else if (finalScore2 <= 39) {
            letterGrade2 = "E";
            status2 = "NOT PASS";
        }

        averageFinalScore = (finalScore1 + finalScore2) / 2;
        if (status1.equals("PASS") && status2.equals("PASS")) {
            if (averageFinalScore >= 70) {
                semesterStatus = "PASS";
            } else {
                semesterStatus = "PASS (average < 70)";
            }
        } else {
            semesterStatus = "PASS (one of the courses passed)";
        }
        
        System.out.println("\n========== ACADEMIC ASSESSMENT RESULTS ==========");        
        System.out.println("Name: " + Name);
        System.out.println("NIM : " + NIM + "\n");
        System.out.printf("\n%-25s %-8s %-8s %-8s %-12s %-12s %-15s%n", "Course", "MidTerm", "Final", "Assignment", "Final Score", "Letter Grade", "Status");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("%-25s %-8.1f %-8.1f %-8.1f %-14.2f %-10s %-15s%n", "Algorithms Programming",  midTerm1,  finalExam1,  Assignment1, finalScore1, letterGrade1, status1);
        System.out.printf("%-25s %-8.1f %-8.1f %-8.1f %-14.2f %-10s %-15s%n", "Data Structure", midTerm2,  finalExam2,  Assignment2, finalScore2, letterGrade2, status2 + "\n");
        
        System.out.println("Average Final Score: " + averageFinalScore);
        System.out.println("Semester Status: " + semesterStatus);

    }
}
