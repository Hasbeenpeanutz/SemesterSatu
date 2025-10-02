package latihan.jobsheet3;

import java.util.Scanner;

public class EmployeeSalary05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int basicSalary;
        double bonus, totalSalary;
        double transportAllowance = 600000;
        double mealAllowance = 400000;

        System.out.print("Basic salary: Rp");
        basicSalary = sc.nextInt();

        bonus = 0.05 * basicSalary;

        totalSalary = basicSalary + transportAllowance + mealAllowance + bonus - (0.1 * basicSalary);
        System.out.println("Your monthly bonus is Rp. " + bonus);
        System.out.println("The total salary received is Rp. " + (int) totalSalary);
        System.out.println("Transport Allowance : Rp " + transportAllowance);
        System.out.println("Meal Allowance      : Rp " + mealAllowance);
        System.out.println("Performance Bonus   : Rp " + bonus);
        System.out.println("Total Salary        : Rp " + totalSalary);

    }
}
