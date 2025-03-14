package Algorithm;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("1. SumOfNumbers");
            System.out.println("2. MaxAndMin");
            System.out.println("3. RemoveDuplicates");
            System.out.println("4. Exit");

            System.out.println("Enter option [1..4]: ");
            option = scanner.nextInt();

            switch (option) {
                case 1: sumOfNumbers(scanner); break;
                case 2: findMaxAndMin(scanner); break;
                case 3: removeDuplicates(scanner); break;
                case 4: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid option! Choose 1 to 4.");
            }
        } while (option != 4);

        scanner.close();
    }

    private static void sumOfNumbers(Scanner scanner) {
        System.out.print("Input array size: ");
        int size = scanner.nextInt();
        int sum = 0;

        System.out.print("Input " + size + " values: ");
        for (int i = 0; i < size; i++) {
            sum += scanner.nextInt();
        }
        System.out.println("Sum: " + sum);
    }

    private static void findMaxAndMin(Scanner scanner) {
        System.out.print("Input array size: ");
        int size = scanner.nextInt();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        System.out.print("Input " + size + " values: ");
        for (int i = 0; i < size; i++) {
            int num = scanner.nextInt();
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Max: " + max + ", Min: " + min);
    }

    private static void removeDuplicates(Scanner scanner) {
        System.out.print("Input array size: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.print("Input " + size + " values: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Distinct values: ");
        for (int i = 0; i < size; i++) {
            boolean isDistinct = true;

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }
}