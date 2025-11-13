package jobsheet.jobsheet8.looping2;

public class groupAssignment {

    public static void main(String[] args) {
        // question.patternA();
        question.patternB();
        // question.patternC();
        // question.assignment();
    }

    public class question {

        static void patternA() {
            int n = 10;
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        static void patternB() {
            int n = 10;
            for (int i = 1; i <= n; i++) {
                for (int s = 1; s <= n - i; s++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }

        static void patternC() {
            char alphabet = 'a';
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print(alphabet);
                    alphabet++;
                }
                System.out.println();
            }

        }

        static void assignment() {
            for (int n = 1; n <= 5; n++) {  
                int sum = 0;

                for (int i = 1; i <= n; i++) {
                    sum += i * i;
                     
                }

                System.out.println("n = " + n + " > sum of squares = " + sum);
            }

        }

    }

}
