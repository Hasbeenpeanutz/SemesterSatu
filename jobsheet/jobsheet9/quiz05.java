package jobsheet.jobsheet9;

import java.util.Random;
import java.util.Scanner;

public class quiz05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String again;

        do {
            int randomNum = rand.nextInt(10) + 1;
            int guess;

            System.out.println("Guess the number (1-10)!");

            do {
                System.out.print("Your guess: ");
                guess = input.nextInt();

                if (guess > randomNum)
                    System.out.println("Too high!");
                else if (guess < randomNum)
                    System.out.println("Too low!");
                else
                    System.out.println("Correct!");

            } while (guess != randomNum);

            System.out.print("Play again? (y/n): ");
            again = input.next();

        } while (again.equalsIgnoreCase("y"));

        System.out.println("Game ended.");
    }
}
