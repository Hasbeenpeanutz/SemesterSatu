package jobsheet.jobsheet8;

import java.util.Scanner;

public class ForMultiples05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int multiple, sum = 0, counter = 0;
        double average = 0;

        System.out.print("Enter a number: ");
        multiple = input.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % multiple == 0) {
                sum += i;
                counter++;
            }
        }

        if (counter > 0) {
            average = (double) sum / counter;
        }

        System.out.println("Total multiples: " + counter);
        System.out.println("Sum of multiples: " + sum);
        System.out.println("Average: " + average);
    }
}
