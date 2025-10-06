package pertemuan5;

import java.util.Scanner;

public class teori {
    public static void main(String[] args) {
        Scanner ans = new Scanner (System.in);

        System.out.print("Which question: ");
        int question = ans.nextInt();

        switch (question) {
            case 1:
                soal.A();
                break;
        
            case 2:
            soal.B();
                break;
        }
    }
}

class soal {
    public static void A(){
        Scanner ans = new Scanner (System.in);

        System.out.print("Do you bring your student ID (y/n): ");
        String id = ans.nextLine();

        System.out.print("Do you already registered online? (y/n): ");
        String regis = ans.nextLine();

        if (id.equals("n")) {
            System.out.println("Entry denied");
        }if (regis.equals("n")) {
            System.out.println("Entry denied");
        }else{
            System.out.println("Approved");
            System.out.println(regis);
            System.out.println(id);
        }

    }
        
    
    public static void B(){
        Scanner ans = new Scanner (System.in);

        System.out.print("Which user are you: ");
        String user = ans.nextLine();

        if (user.equals("lecturer")) {
            System.out.println("Wifi access granted (lecturer)");
        } else if (user.equals("student")) {
            System.out.print("How much is your active credits: ");
            int credits = ans.nextInt();

            if (credits >= 12) {
                System.out.println("Wifi access granted (student)");
            } else {
                System.out.println("Access denied, credit less than 12");
            }
        } else {
            System.out.println("Access denied");
        }
    }
    
}
