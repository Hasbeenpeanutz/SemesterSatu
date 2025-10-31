package jobsheet.jobsheet8;

import java.util.Scanner;

public class DoWhileLeaveEntitlement05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int leaveEntitlement = 5;
        int numLeave;
        String confirmation;

        do {
            System.out.println("Remaining leave: " + leaveEntitlement);
            System.out.print("Enter leave days: ");
            numLeave = input.nextInt();

            if (numLeave > leaveEntitlement) {
                System.out.println("Too many days! Enter again.");
                continue;
            }

            leaveEntitlement -= numLeave;

            if (leaveEntitlement <= 2) {
                System.out.println("Warning! Only " + leaveEntitlement + " days left!");
            }

            System.out.print("Continue? (y/t): ");
            confirmation = input.next();

            if (confirmation.equalsIgnoreCase("t")) {
                break;
            }

        } while (true);

        System.out.println("Program ended.");
    }
}
