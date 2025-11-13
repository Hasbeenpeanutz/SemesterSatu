package jobsheet.jobsheet9;

import java.util.Scanner;

public class assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which question: ");
        int q = sc.nextInt();

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

    public class question {

        public static void A() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter N: ");
            int N = sc.nextInt();

            for (int i = 1; i <= N; i++) {
                for (int s = 0; s < N - i; s++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }

        public static void B() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter N (min 5): ");
            int N = sc.nextInt();

            for (int i = N; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void C() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter N (min 3): ");
            int N = sc.nextInt();

            for (int i = 1; i <= N; i++) {
                if (i == 1 || i == N) {
                    for (int j = 1; j <= N; j++) {
                        System.out.print(N);
                        if (j < N) {
                            System.out.print(" ");
                        }
                    }

                } else {
                    System.out.print(N);
                    System.out.print(" ");
                    for (int j = 2; j <= N - 1; j++) {
                        System.out.print("  ");
                    }
                    System.out.print(N);
                }
                
                System.out.println();
            }
        }
    }
}
