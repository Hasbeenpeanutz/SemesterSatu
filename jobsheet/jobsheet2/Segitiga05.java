package jobsheet.jobsheet2;


import java.util.Scanner;

public class Segitiga05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base, height;
        float area;

        System.out.print("Input base: ");
        base = scanner.nextInt();
        System.out.print("Input height: ");
        height = scanner.nextInt();

        area = base * height /2;
        System.out.println("Area of the triangle " + area);
    }
}
