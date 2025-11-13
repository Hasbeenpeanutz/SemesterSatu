package jobsheet.jobsheet9;
import java.util.Scanner;

public class NestedLoopStudentID05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];

        // Fill temperatures
        for (int i = 0; i < temps.length; i++) {
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print("Enter temperature for city " + (i + 1) + ", day " + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
        }

        // Display using foreach
        System.out.println("\n=== Display Using Foreach ===");
        for (double[] city : temps) {
            for (double t : city)
                System.out.print(t + " ");
            System.out.println();
        }

        // Average per city
        System.out.println("\n=== Average Temperature per City ===");
        for (int i = 0; i < temps.length; i++) {
            double sum = 0;
            for (double t : temps[i]) sum += t;
            double avg = sum / temps[i].length;
            System.out.println("City " + (i + 1) + " average: " + avg);
        }
    }
}