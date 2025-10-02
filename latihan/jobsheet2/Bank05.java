package latihan.jobsheet2;

import java.util.Scanner;

public class Bank05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int init_sav_amount, sav_period;
        double final_sav_amount = 0.02, interest, interest_percent = 0.02;

        System.out.print("Input your initial savings amount: ");
        init_sav_amount = scanner.nextInt();
        System.out.print("Input your saving period: ");
        sav_period = scanner.nextInt();

        interest = sav_period * interest_percent * init_sav_amount;
        final_sav_amount = init_sav_amount + interest;

        System.out.println("Interst: " + interest);
        System.out.println("Final saving amount: " + final_sav_amount);
    }
}
