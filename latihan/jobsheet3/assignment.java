package latihan.jobsheet3;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Choose question (1 or 2): ");
        int ans = input.nextInt();

        switch (ans) {
            case 1:
                question.q1();
                break;

            case 2:
                question.q2();
                break;
        }
        
    }
}

class question {

    public static void q1(){

        Scanner input = new Scanner (System.in);

        System.out.print("Motorcycle price: Rp");
        double price = input.nextDouble();

        System.out.print("Down payment: Rp");
        double downPayment = input.nextDouble();

        System.out.print("Installment period (months): ");
        int months = input.nextInt();

        double remaining = price - downPayment;
        double monthlyInterest = 0.01 * remaining;
        double principalInstallment = remaining / months;
        double monthlyInstallment = principalInstallment + monthlyInterest;

        System.out.println("---------------------------------------");
        System.out.println("Monthly installment = Rp" + monthlyInstallment);
    }

    public static void q2(){

        Scanner input = new Scanner(System.in);

        System.out.print("Distance Malang - Surabaya (km): ");
        int distance = input.nextInt();

        double fuel = distance / 2;
        double cost = fuel * 10000;

        System.out.println("2km = 1 liter of fuel.");
        System.out.println("Fuel price: 10,000/liter");
        System.out.println("Distance: " + distance);
        System.out.println("---------------------------------");
        System.out.println("Fuel cost: Rp" + cost);
    }

    
}
