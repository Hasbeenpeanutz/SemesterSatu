package jobsheet.midExam;

import java.util.Scanner;

public class exam {

    public static void main(String[] args) {
        //LATIHAN
        Scanner ans = new Scanner(System.in);

        System.out.print("Which question d'you want to answer(1/2): ");
        int q = ans.nextInt();

        switch (q) {
            case 1:
                question.q1();
                break;
            case 2:
                question.q2();
                break;

            default:
                break;
        }
    }
}

class question {

    public static void q1() {
        Scanner ans = new Scanner(System.in);

        String orderTime, drinkTemperature;
        double discount, basePrice, price;

        System.out.print("Enter time (morning/afternoon/evening): ");
        orderTime = ans.nextLine();

        if (orderTime.equals("morning")) {
            System.out.print("Enter drink temperature (hot/cold): ");
            drinkTemperature = ans.nextLine();

            if (drinkTemperature.equals("hot")) {
                discount = 0.10;
                basePrice = 15000;
                price = basePrice * discount;

                System.out.println("Base basePrice: " + basePrice);
                System.out.println("Discount: 10% (" + price + ")");
                System.out.println("Total payment: " + (basePrice - price));

            } else if (drinkTemperature.equals("cold")) {
                discount = 0.0;
                basePrice = 18000;
                price = basePrice * discount;

                System.out.println("Base basePrice: " + basePrice);
                System.out.println("Discount: 0% (" + price + ")");
                System.out.println("Total payment: " + (basePrice - price));
            } else {
                System.out.println("Invalid input. Make sure the temperature = (hot/cold)");
            }

        } else if (orderTime.equals("afternoon")) {
            discount = 0.05;

            System.out.print("Enter drink temperature (hot/cold): ");
            drinkTemperature = ans.nextLine();

            if (drinkTemperature.equals("hot")) {
                basePrice = 20000;
                price = basePrice * discount;

                System.out.println("Base basePrice: " + basePrice);
                System.out.println("Discount: 5% (" + price + ")");
                System.out.println("Total payment: " + (basePrice - price));

            } else if (drinkTemperature.equals("cold")) {
                basePrice = 22000;
                price = basePrice * discount;

                System.out.println("Base basePrice: " + basePrice);
                System.out.println("Discount: 5% (" + price + ")");
                System.out.println("Total payment: " + (basePrice - price));
            } else {
                System.out.println("Invalid input. Make sure the temperature = (hot/cold)");
            }

        } else if (orderTime.equals("evening")) {
            System.out.print("Enter drink temperature (hot/cold): ");
            drinkTemperature = ans.nextLine();

            if (drinkTemperature.equals("hot")) {
                discount = 0;
                basePrice = 17000;
                price = basePrice * discount;

                System.out.println("Base basePrice: " + basePrice);
                System.out.println("Discount: 0% (" + price + ")");
                System.out.println("Total payment: " + (basePrice - price));

            } else if (drinkTemperature.equals("cold")) {
                discount = 0.15;
                basePrice = 19000;
                price = basePrice * discount;

                System.out.println("Base basePrice: " + basePrice);
                System.out.println("Discount: 15% (" + price + ")");
                System.out.println("Total payment: " + (basePrice - price));

            } else {
                System.out.println("Invalid input. Make sure the temperature = (hot/cold)");
            }

        } else {
            System.out.println("Invalid input. Please make sure time = (morning/afternoon/evening)");
        }

    }

    public static void q2() {
        Scanner ans = new Scanner(System.in);

        String day;
        int viewerAge;
        double discount, basePrice, price, surcharge;

        System.out.print("Enter day type (weekdays/weekends): ");
        day = ans.nextLine();

        if (day.equals("weekdays")) {
            basePrice = 40000;

            System.out.print("Enter viewer age: ");
            viewerAge = ans.nextInt();

            if (viewerAge <= 12) {
                discount = 0.50;
                price = basePrice * discount;

                System.out.println("Base price: " + basePrice);
                System.out.println("Discount: 50% (" + price);
                System.out.println("Final ticket price: " + (basePrice - price));

            } else if (viewerAge >= 13 && viewerAge <= 59) {
                discount = 0.0;
                price = basePrice * discount;

                System.out.println("Base price: " + basePrice);
                System.out.println("Discount: 0% (" + price);
                System.out.println("Final ticket price: " + (basePrice - price));

            } else if (viewerAge >= 60) {
                discount = 0.30;
                price = basePrice * discount;

                System.out.println("Base price: " + basePrice);
                System.out.println("Discount: 30% (" + price);
                System.out.println("Final ticket price: " + (basePrice - price));

            }

        } else if (day.equals("weekends")) {
            basePrice = 50000;

            System.out.print("Enter viewer age: ");
            viewerAge = ans.nextInt();

            if (viewerAge <= 12) {
                discount = 0.30;
                price = basePrice * discount;

                System.out.println("Base price: " + basePrice);
                System.out.println("Discount: 30% (" + price + ")");
                System.out.println("Final ticket price: " + (basePrice - price));

            } else if (viewerAge >= 13 && viewerAge <= 59) {
                discount = 0.0;

                if (viewerAge >= 18 && viewerAge <= 25) {
                    surcharge = 0.05;
                    price = basePrice * surcharge;

                    System.out.println("Base price: " + basePrice);
                    System.out.println("Discount: 0% (" + price + ")");
                    System.out.println("Final ticket price: " + (basePrice + price));

                }

            } else if (viewerAge >= 60) {
                discount = 0.10;
                price = basePrice * discount;

                System.out.println("Base price: " + basePrice);
                System.out.println("Discount: 10% (" + price + ")");
                System.out.println("Final ticket price: " + (basePrice - price));

            }

        }

    }

}
