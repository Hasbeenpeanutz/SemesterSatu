package jobsheet.jobsheet8;

import java.util.Scanner;

public class TriangleAssignment05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int numInput = input.nextInt();

        String s = "";

        for (int i = 0; i < numInput; i++) {
            s += " *";
            System.out.println(s);
        }
    }
}
