

import java.util.Scanner;
import java.text.DecimalFormat;

public class TuitionFeeEnhanced {
	public static void main(String[] args) {
        while (true) {
            //Initializing Imports
            Scanner scan = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("###,###.00");

            //Initializing Data
            String studentName = "";
            int units = 0;
            double price = 0.0, tuitionFee = 0.0, cashPayment = 0.0, firstPenalty = 0.0, secondPenalty = 0.0;
            
            //Input needed data
            System.out.print("\nEnter name of student: ");
            studentName =scan.nextLine();

            System.out.print("Enter number of units enrolled: ");
            units = scan.nextInt();

            System.out.print("Enter price per unit: ");
            price = scan.nextDouble();
            
            //Calculation Process
            tuitionFee = tuitionFee(units, price);

            cashPayment = cashPayment(tuitionFee);
            firstPenalty = firstPenalty(tuitionFee);
            secondPenalty = secondPenalty(tuitionFee);
            
            //Displaying Output
            System.out.println("\nComputed Tuition fee: " + df.format(tuitionFee) + " dollars");
            System.out.println(studentName + ", you could avail the following payment mode: ");

            System.out.println("\nPayment Mode: ");
            System.out.println("Cash Payment: " + df.format(cashPayment) + " dollars");
            System.out.println("2-installment: " + df.format(firstPenalty) + " dollars");
            System.out.println("3-installment: " + df.format(secondPenalty) + " dollars");
        }
	}

    public static double tuitionFee(int units, double price) {
        return units * price;
    }

    public static double cashPayment(double tuitionFee) {
        return tuitionFee - tuitionFee * 0.10;
    }

    public static double firstPenalty(double tuitionFee) {
        return tuitionFee + tuitionFee * 0.05;
    }

    public static double secondPenalty(double tuitionFee) {
        return tuitionFee + tuitionFee * 0.10;
    }
}