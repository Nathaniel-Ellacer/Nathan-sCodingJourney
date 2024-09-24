

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Fuel Type
        System.out.print("Enter fuel type: ");
        String fuelType = scanner.nextLine();

        // Prices for 3 days
        System.out.print("Enter price in Day 1: ");
        double priceDay1 = scanner.nextDouble();

        System.out.print("Enter price in Day 2: ");
        double priceDay2 = scanner.nextDouble();

        System.out.print("Enter price in Day 3: ");
        double priceDay3 = scanner.nextDouble();

        double averagePrice = (priceDay1 + priceDay2 + priceDay3) / 3;

        System.out.printf("Average price of %s is %.2f per liter.\n", fuelType, averagePrice);
        scanner.close();
    }
}