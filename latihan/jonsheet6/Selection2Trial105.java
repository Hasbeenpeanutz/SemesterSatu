package latihan.jonsheet6;

import java.util.Scanner;

public class Selection2Trial105 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner (System.in);

        System.out.print("Enter year: ");
        int year = input05.nextInt();

        if ((year % 4) == 0 ) {
            System.out.println("Leap Year");
        } else{
            System.out.println("Not a leap year");
        }
    }
}
