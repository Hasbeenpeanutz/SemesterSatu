package jobsheet.jobsheet7;

import java.util.Scanner;

public class ParkingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours;
        String vehicle;
        double total = 0;

        do {
            System.out.print("Enter vehicle type (car/motor, type '0' to stop): ");
            vehicle = sc.nextLine();

            if (vehicle.equals("0")) {
                break;
            }

            System.out.print("Enter parking duration (hours): ");
            hours = sc.nextInt();
            sc.nextLine(); // clear buffer

            double fee = 0;
            if (hours > 5) {
                fee = 12500;
            } else if (vehicle.equalsIgnoreCase("car")) {
                fee = hours * 3000;
            } else if (vehicle.equalsIgnoreCase("motor")) {
                fee = hours * 2000;
            } else {
                System.out.println("Invalid vehicle type!");
                continue;
            }

            System.out.println("Parking fee: Rp " + fee);
            total += fee;

        } while (true);

        System.out.println("\nTotal parking income: Rp " + total);
    }
}
