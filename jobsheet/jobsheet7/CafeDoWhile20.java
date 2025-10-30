package jobsheet.jobsheet7;

import java.util.Scanner;

public class CafeDoWhile20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coffee, tea, bread;
        final int coffeePrice = 12000, teaPrice = 7000, breadPrice = 20000;
        String customerName;

        do {
            System.out.print("\nEnter customer name (type 'cancel' to stop): ");
            customerName = sc.nextLine();

            if (customerName.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction canceled. Program ended.");
                break;
            }

            System.out.print("Number of coffee bought: ");
            coffee = sc.nextInt();
            System.out.print("Number of tea bought: ");
            tea = sc.nextInt();
            System.out.print("Number of bread bought: ");
            bread = sc.nextInt();

            int total = (coffee * coffeePrice) + (tea * teaPrice) + (bread * breadPrice);
            System.out.println("Total payment for " + customerName + ": Rp " + total);

            sc.nextLine(); // clear buffer
        } while (true);
    }

}
