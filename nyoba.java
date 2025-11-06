
public class nyoba {

    public static void main(String[] args) {
        // String q = JOptionPane.showInputDialog("Masukkan angka: ");
        // JOptionPane.showMessageDialog(myFrame, "ppp");

        // JFrame myFrame = new JFrame("judul frame lo");
        // myFrame.setSize(300, 200);
        // myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // myFrame.setVisible(true);

        // JOptionPane.showMessageDialog(myFrame, "halo dawg ini muncul di tengah frame");
    
        // Bikin frame custom
        // JFrame frame = new JFrame("Custom Dawg Frame");
        // frame.setSize(400, 300);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setLayout(new BorderLayout());

        // // Background panel
        // JPanel panel = new JPanel();
        // panel.setBackground(new Color(40, 40, 40));
        // panel.setLayout(new FlowLayout());

        // // Custom label
        // JLabel label = new JLabel("Welcome dawg 😎");
        // label.setForeground(Color.WHITE);
        // label.setFont(new Font("Poppins", Font.BOLD, 20));
        // panel.add(label);

        // // Custom button
        // JButton btn = new JButton("Klik gw dawg");
        // btn.addActionListener(e -> {
        //     JOptionPane.showMessageDialog(frame, "yo dawg, ini popup custom kamu");
        // });
        // panel.add(btn);

        // frame.add(panel, BorderLayout.CENTER);
        // frame.setVisible(true);

        //Create a program to track students' study time at home. Each day, students enter their daily study hours. The program should calculate and display the total study hours for the week. If a student studies more than 10 hours in a day, the program should ignore the input and ask for re-entering, as it is considered impossible. Note: Loops can be for, while, or do-while. Add break or continue loops if necessary.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int dailyHours, totalHours = 0, days = 7, i =0;

        while (i < days) {
            System.out.print("Enter study hours for day " + (i + 1) + ": ");
            dailyHours = sc.nextInt();

            if (dailyHours < 0 || dailyHours > 10) {
                System.out.println("Invalid input! Please enter a value between 0 and 10.");
                continue;
            }

            totalHours += dailyHours;
            i++;
        }

        System.out.println("Total study hours for the week: " + totalHours);
        

        //Create a flowchart to determine the bonuses received by company employees. Every employee who works more than 8 hours per day will receive a bonus of 20% of their daily salary. The program will prompt for input on the number of hours worked and the employee's daily salary, then calculate the bonus. The program will terminate if the user enters negative hours, and the employee will not be processed. Note: Loops can be for, while, or do-while. Add break or continue statements if necessary.
        // java.util.Scanner sc = new java.util.Scanner(System.in);
        // int workHours;
        // double dailySalary, bonus;
        // while (true) {
        //     System.out.print("Enter work hours (negative to exit): ");
        //     workHours = sc.nextInt();

        //     if (workHours < 0) {
        //         System.out.println("Exiting program.");
        //         break;
        //     }

        //     System.out.print("Enter daily salary: ");
        //     dailySalary = sc.nextDouble();

        //     if (workHours > 8) {
        //         bonus = 0.20 * dailySalary;
        //         System.out.println("Bonus earned: " + bonus);
        //     } else {
        //         System.out.println("No bonus earned.");
        //     }
        // }

    }
}