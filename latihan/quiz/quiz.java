package latihan.quiz;

import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //THESE ARE THE VARIABLE WE KNEW THE VALUE
        double running = 0.05;
        double swimming = 0.04;
        double cycling = 0.03;

        // THESE SECTION IS FOR INPUTING THE VALUE OF THE VARIABLE
        System.out.print("Input duration: ");
        double duration = sc.nextDouble();

        System.out.print("Input body weight: ");
        double body_weight = sc.nextDouble();

        System.out.print("Input average_speed: ");
        double average_speed = sc.nextDouble();

        System.out.print("Input altitude: ");
        double altitude = sc.nextDouble();

        //THESE SECTION ARE FOR THE PROCESS
        double calories_running = (duration * running * body_weight) + (average_speed * 0.5) + (altitude * 0.01);
        double calories_swimming = (duration * swimming * body_weight) + (average_speed * 0.5) + (altitude * 0.01);
        double calories_cycling = (duration * cycling * body_weight) + (average_speed * 0.5) + (altitude * 0.01);

        double total_calories = calories_running + calories_swimming + calories_cycling;
        double average_calories_perminute = total_calories / duration;

        //THESE ARE THE OUTPUT
        System.out.println("======================= OUTPUT ==========================");
        System.out.println("Duration: " + duration + "Minute");
        System.out.println("Body weight: " + body_weight + "kg");
        System.out.println("Average speed: " + average_speed + "km/h");
        System.out.println("Altitude: " + altitude);
        System.out.println("\n======= Calories Burned From All Activities =========\n");
        System.out.println("Running: " + calories_running);
        System.out.println("Swimming: " + calories_swimming);
        System.out.println("Cycling: " + calories_cycling);
        System.out.println("\n------------------------------------------------------\n");
        System.out.println("Total calories: " + total_calories);
        System.out.println("Average calories burned perminutes: " + average_calories_perminute);
    }
}
