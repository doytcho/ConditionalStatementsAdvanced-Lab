import java.util.Scanner;

public class L08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double amont = Double.parseDouble(scan.nextLine());
        double price = 0;
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (fruit.equals("banana")) {
                    price = amont * 2.5;
                } else if (fruit.equals("apple")) {
                    price = amont * 1.2;
                } else if (fruit.equals("orange")) {
                    price = amont * 0.85;
                } else if (fruit.equals("grapefruit")) {
                    price = amont * 1.45;
                } else if (fruit.equals("kiwi")) {
                    price = amont * 2.7;
                } else if (fruit.equals("pineapple")) {
                    price = amont * 5.5;
                } else if (fruit.equals("grapes")) {
                    price = amont * 3.85;
                }
                break;
            case "Saturday":
            case "Sunday":
                if (fruit.equals("banana")) {
                    price = amont * 2.7;
                } else if (fruit.equals("apple")) {
                    price = amont * 1.25;
                } else if (fruit.equals("orange")) {
                    price = amont * 0.90;
                } else if (fruit.equals("grapefruit")) {
                    price = amont * 1.60;
                } else if (fruit.equals("kiwi")) {
                    price = amont * 3.0;
                } else if (fruit.equals("pineapple")) {
                    price = amont * 5.6;
                } else if (fruit.equals("grapes")) {
                    price = amont * 4.2;
                }
                break;
        }
        if (price != 0) {

            System.out.printf("%.2f", price);
        } else {
            System.out.println("error");
        }
    }
}
