package jobsheet.jobsheet9_array;

import java.util.Scanner;

public class assignment {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Which question: ");
        int q = inp.nextInt();

        switch (q) {
            case 1:
                question.A();
                break;

            case 2:
                question.B();
                break;

            case 3:
                question.C();
                break;

            default:
                break;

        }
    }

    class question {

        static void A() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of grades: ");
            int n = sc.nextInt();

            int[] grades = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Grade " + (i + 1) + ": ");
                grades[i] = sc.nextInt();
            }

            int total = 0;
            int highest = grades[0];
            int lowest = grades[0];

            for (int g : grades) {
                total += g;
                if (g > highest) {
                    highest = g;
                }
                if (g < lowest) {
                    lowest = g;
                }
            }

            double avg = (double) total / n;

            System.out.println("\n=== Grades Entered ===");
            for (int g : grades) {
                System.out.println(g);
            }

            System.out.println("\nAverage: " + avg);
            System.out.println("Highest: " + highest);
            System.out.println("Lowest: " + lowest);

        }

        static void B() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of orders: ");
            int n = sc.nextInt();
            sc.nextLine();

            String[] names = new String[n];
            int[] prices = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Order name " + (i + 1) + ": ");
                names[i] = sc.nextLine();

                System.out.print("Price: ");
                prices[i] = sc.nextInt();
                sc.nextLine();
            }

            int total = 0;
            for (int p : prices) {
                total += p;
            }

            System.out.println("\n=== List of Orders ===");
            for (int i = 0; i < n; i++) {
                System.out.println(names[i] + " - Rp" + prices[i]);
            }

            System.out.println("\nTotal Cost: Rp" + total);
        }

        static void C() {

            Scanner sc = new Scanner(System.in);

            String[] menu = {
                "Fried Rice", "Fried Noodles", "Toasted Bread",
                "Fried Potatoes", "Teh Tarik", "Cappuccino", "Chocolate Ice"
            };

            System.out.print("Search menu item: ");
            String search = sc.nextLine();

            boolean found = false;

            for (int i = 0; i < menu.length; i++) {
                if (menu[i].equalsIgnoreCase(search)) {
                    System.out.println("Item found: " + menu[i]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Item not found on the menu");
            }

        }
    }
}
