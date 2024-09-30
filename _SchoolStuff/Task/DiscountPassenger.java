
import java.text.DecimalFormat;
import java.util.Scanner;

public class DiscountPassenger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.##");

        char fareCode;
        double fare;
        double discount;
        double discountPercentage;
        double businessCharge;
        double newFare;

        businessCharge = 0.0;
        discountPercentage = 0.0;

        System.out.print("Enter fare: ");
        fare = input.nextDouble();

        System.out.print("Passenger type [O: Ordinary, S: Student, C: Senior Citizen]: ");
        fareCode = Character.toUpperCase(input.next().charAt(0));

        System.out.print("Travelling in business class? [Y/N]: ");
        char businessClass = Character.toUpperCase(input.next().charAt(0));

        switch (businessClass) {
            case 'Y':
                switch (fareCode) {
                    case 'O':
                        businessCharge = 1000;
                        break;

                    case 'S':
                        businessCharge = 700;
                        break;

                    case 'C':
                        businessCharge = 500;
                        break;
                }
                break;
            case 'N':
                businessCharge = 0.0;
                break;
            default:
                System.out.println("Invalid input");
        }

        switch (fareCode) {
            case 'O':
                discountPercentage = 0.0;
                break;

            case 'S':
                discountPercentage = 0.05;
                break;

            case 'C':
                discountPercentage = 0.10;
                break;

            default:
                System.out.println("Invalid passenger type.");
        }

        discount = fare * discountPercentage;
        newFare = fare - discount + businessCharge;

        System.out.println("\nDiscount: " + df.format(discount) + "\nBusiness class charge: " + df.format(businessCharge) + "\nNew fare: " + df.format(newFare));
    }
}