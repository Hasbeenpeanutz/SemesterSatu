package jobsheet.jobsheet3;

import java.util.Scanner;

public class CalculateTotalPayment05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int price;
        double discountAmount, totalPayment;
        double discount = 0.15;

        price = sc.nextInt();
        discountAmount = discount * price;

        totalPayment = price - discountAmount;

        System.out.println("The total amount you have to pay is Rp. " + totalPayment);
    }
}
