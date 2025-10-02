package latihan.jobsheet2;

public class contohVariabel05 {
    public static void main(String[] args) {

        String hobby = "Doomscroll";
        boolean smart = true;
        char gender = 'P';
        byte age = 19;
        double gpa = 3.7, height = 1.59;

        System.out.println("My hobby is: " + hobby);
        System.out.println("Are you smart " + smart);
        System.out.println("Jenis kelamin: " + gender);
        System.out.println("My current age is:  " + age);
        System.out.println(String.format("My GPA is %s, and my height is %s metters", gpa, height));
    }
}
