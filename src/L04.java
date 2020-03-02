import java.util.Scanner;

public class L04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stock = scan.nextLine();
        String city = scan.nextLine();
        double amont = Double.parseDouble(scan.nextLine());
        double price = 0;
        switch (stock) {
            case "coffee":
                if (city.equals("Sofia")) {
                    price = amont * 0.5;
                } else if (city.equals("Plovdiv")) {
                    price = amont * 0.4;
                } else if (city.equals("Varna")){
                    price = amont * 0.45;
                }
                break;
            case "water":
                if (city.equals("Sofia")) {
                    price = amont * 0.8;
                } else if (city.equals("Plovdiv")) {
                    price = amont * 0.7;
                } else {
                    price = amont * 0.7;
                }
                break;
            case "beer":
                if (city.equals("Sofia")) {
                    price = amont * 1.2;
                } else if (city.equals("Plovdiv")) {
                    price = amont * 1.15;
                } else {
                    price = amont * 1.1;
                }
                break;
            case "sweets":
                if (city.equals("Sofia")) {
                    price = amont * 1.45;
                } else if (city.equals("Plovdiv")) {
                    price = amont * 1.3;
                } else {
                    price = amont * 1.35;
                }
                break;
            case "peanuts":
                if (city.equals("Sofia")) {
                    price = amont * 1.6;
                } else if (city.equals("Plovdiv")) {
                    price = amont * 1.5;
                } else {
                    price = amont * 1.55;
                }
                break;
        }
        System.out.printf("%f",price);
    }
}
