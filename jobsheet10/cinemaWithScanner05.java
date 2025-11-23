import java.util.Scanner;

public class cinemaWithScanner05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] audience = new String[4][2];

        int menu = 0;

        while (true) {
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Choose menu (1-3): ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.print("Enter audience name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter row number (1-4): ");
                    int row = sc.nextInt();
                    System.out.print("Enter column number (1-2): ");
                    int col = sc.nextInt();
                    sc.nextLine();

                    if (row < 1 || row > 4 || col < 1 || col > 2) {
                        System.out.println("Row/column number is not available.");
                    } else if (audience[row - 1][col - 1] != null) {
                        System.out.println("This seat is already taken by " + audience[row - 1][col - 1]);
                        System.out.println("Please choose another seat!");
                    } else {
                        audience[row - 1][col - 1] = name;
                        System.out.println("Audience data saved successfully.");
                    }

                    System.out.print("Input another audience? (y/n): ");
                    String next = sc.nextLine();
                    if (next.equals("n")) {
                        break;
                    }
                }

            } else if (menu == 2) {
                System.out.println("\n=== Audience Seat List ===");
                int empty = 0, filled = 0;

                for (int i = 0; i < audience.length; i++) {
                    for (int j = 0; j < audience[i].length; j++) {
                        if (audience[i][j] == null) {
                            System.out.print("***\t");
                            empty++;
                        } else {
                            System.out.print(audience[i][j] + "\t");
                            filled++;
                        }
                    }
                    System.out.println();
                }

                System.out.println("\nFilled seats: " + filled);
                System.out.println("Empty seats: " + empty);

            } else if (menu == 3) {
                System.out.println("Program finished.");
                break;
            } else {
                System.out.println("Menu not available, please choose between 1–3.");
            }
        }
    }
}
