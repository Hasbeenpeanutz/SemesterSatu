package jobsheet.jobsheet8;

import java.util.Scanner;

public class DisplayTwo05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number greater than 2: ");
        int numInput = input.nextInt();

        for (int i = 2; i <= numInput; i += 2) {
            System.out.println(i + " ");
        }
    }
}
