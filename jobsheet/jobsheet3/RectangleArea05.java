package jobsheet.jobsheet3;

import java.util.Scanner;

public class RectangleArea05 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int length, width, area;

        length = input.nextInt();
        width = input.nextInt();
        area = length * width;

        System.out.println("The area of the rectangle is " + area);

        input.close();
    }
}
