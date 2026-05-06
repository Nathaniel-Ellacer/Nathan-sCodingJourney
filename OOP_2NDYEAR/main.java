import java.util.Scanner;
import java.util.InputMismatchException;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeCalculator calculator = new GradeCalculator();
        double[] grades = new double[5];

        try {
            // Accepts 5 grades from user input
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter grade " + (i + 1) + ": ");
                grades[i] = scanner.nextDouble();
            }

            // Attempt to calculate average; may throw InvalidGradeException
            double average = calculator.calculateAverage(grades);
            System.out.println("Average grade: " + average);

        } catch (InvalidGradeException e) {
            // Catches custom exception for out-of-range values
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            // Catches standard exception for non-numeric input
            System.out.println("Error: Invalid input. Please enter numeric values only.");
        } finally {
            // Requirement: Always display "Process complete"
            System.out.println("Process complete.");
            scanner.close();
        }
    }
}