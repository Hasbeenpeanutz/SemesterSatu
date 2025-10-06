package jobsheet.jobsheet2;


import java.util.Scanner;

public class assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose the question(1 or 2): ");
        int ans = sc.nextInt();

        switch (ans) {
            case 1:
                question_input.number1();
                break;

            case 2:
                question_input.number2();
                break;
        }

    }
}

class question_input {

    public static void number1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Basic sallary: Rp");
        int wages = sc.nextInt();
        System.out.print("Monthly child allowance: Rp");
        int allowance = sc.nextInt();
        System.out.print("How many child: ");
        int kid = sc.nextInt();
        double pension_fund = wages * 0.05;

        System.out.println("\n=== Net Calculation of Mrs. Desi's salary ===");
        System.out.println("Basic sallary\t\t: Rp" + wages);
        System.out.println("Pension fund\t\t: Rp" + allowance);
        System.out.println("Monthly child allowance\t: Rp" + pension_fund + "/kid");
        System.out.println("Child\t\t: " + kid);
        System.out.println("Net\t\t: Rp" + (wages - (allowance * kid) + pension_fund));

    }

    public static void number2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input lenght of the field: ");
        double pLap = sc.nextDouble();
        System.out.print("Input wide of the field: ");
        double lLap = sc.nextDouble();
        System.out.print("Enter a square length: ");
        double p = sc.nextDouble();
        System.out.print("Enter the diameter of the circle: ");
        double d = sc.nextDouble();

        double r = d / 2.0;
        double circle_area = 3.14 * r * r;
        double square_area = p * p;
        double rectangular_area = pLap * lLap;
        double finale = rectangular_area - (circle_area + square_area);

        System.out.println("\n=== Sir Jaka's land area calculation ===");
        System.out.println("Surface area \t: " + square_area + " m2");
        System.out.println("Total pool area : " + (square_area + circle_area) + " m2");
        System.out.println("Grassland \t: " + finale + " m2");
    }

}

class question {
    public static void number1() {

        System.out.print("Basic sallary: Rp");
        int wages = 3000000;
        System.out.print("Monthly child allowance: Rp");
        int allowance = 150000;
        System.out.print("How many child: ");
        int kid = 3;
        double pension_fund = wages * 0.05;

        System.out.println("\n=== Net Calculation of Mrs. Desi's salary ===");
        System.out.println("Basic sallary\t\t: Rp" + wages);
        System.out.println("Pension fund\t\t: Rp" + allowance);
        System.out.println("Monthly child allowance\t: Rp" + pension_fund + "/kid");
        System.out.println("Child\t\t: " + kid);
        System.out.println("Net\t\t: Rp" + (wages - (allowance * kid) + pension_fund));

    }

    public static void number2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input lenght of the field: ");
        double pLap = 100;
        System.out.print("Input wide of the field: ");
        double lLap = 50;
        System.out.print("Enter a square length: ");
        double p = 2;
        System.out.print("Enter the diameter of the circle: ");
        double d = 2;

        double r = d / 2.0;
        double circle_area = 3.14 * r * r;
        double square_area = p * p;
        double rectangular_area = pLap * lLap;
        double finale = rectangular_area - (circle_area + square_area);

        System.out.println("\n=== Sir Jaka's land area calculation ===");
        System.out.println("Surface area \t: " + square_area + " m2");
        System.out.println("Total pool area : " + (square_area + circle_area) + " m2");
        System.out.println("Grassland \t: " + finale + " m2");
    }
    
}
