package jobsheet.jobsheet9_array;


import java.util.Scanner;

public class linearSearch05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // input array
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        boolean found = false;

        // linear search
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Key found at index: " + i);
                found = true;
            }
        }

    }
}
