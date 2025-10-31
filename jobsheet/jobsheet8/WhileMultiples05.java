package jobsheet.jobsheet8;

import java.util.Scanner;

public class WhileMultiples05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int multiple = input.nextInt();

        int i = 1, sum = 0, counter = 0;

        while (i <= 50) {
            if (i % multiple == 0) {
                sum += i;
                counter++;
            }
            i++;
        }

        System.out.println("Total multiples: " + counter);
        System.out.println("Sum of multiples: " + sum);
    }

}
