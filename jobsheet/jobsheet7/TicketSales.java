package jobsheet.jobsheet7;

import java.util.Scanner;

public class TicketSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tickets;
        double total = 0;
        final double price = 50000;

        while (true) {
            System.out.print("Enter number of tickets (0 to stop): ");
            tickets = sc.nextInt();

            if (tickets == 0) {
                break;
            } else if (tickets < 0) {
                System.out.println("Invalid input! Try again.");
                continue;
            }

            double discount = 0;
            if (tickets > 10) {
                discount = 0.15;
            } else if (tickets > 4) {
                discount = 0.10;
            }

            double totalPrice = tickets * price * (1 - discount);
            total += totalPrice;

            System.out.println("Total payment: Rp " + totalPrice);
        }

        System.out.println("\nTotal ticket sales today: Rp " + total);
    }
}
