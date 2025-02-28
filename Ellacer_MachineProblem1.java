import java.util.Scanner;

public class Ellacer_MachineProblem1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInputInteger;

        while (true) {
            System.out.print("INPUT INTEGER VALUE: ");
            userInputInteger = scanner.nextInt();

            while (true) {
                System.out.println("OPTIONS");
                System.out.println("1. Sum of digits");
                System.out.println("2. Reverse the number");
                System.out.println("3. Display all the prime numbers from 2 to n");
                System.out.println("4. Palindrome Checking");
                System.out.println("5. Odd or even number");
                System.out.println("6. Exit");

                System.out.print("Enter option [1..6]: ");
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Sum of digits: " + SumDigits(userInputInteger));
                        break;
                    case 2:
                        System.out.println("Reverse the number: " + ReverseNumber(userInputInteger));
                        break;
                    case 3:
                        System.out.print("Display all the prime numbers from 2 to n (n is the user's input). Given n: ");
                        int n = scanner.nextInt();
                        displayPrimes(n);
                        break;
                    case 4:
                        System.out.println(userInputInteger + (isPalindrome(userInputInteger) ? " is a palindrome." : " is not a palindrome."));
                        break;
                    case 5:
                        System.out.println(userInputInteger + " is " + (isEven(userInputInteger) ? "even." : "odd."));
                        break;
                    case 6:
                        System.out.println("Terminating the program - Ellacer, Nathaniel Ashley E.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }

    private static int SumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    
    private static int ReverseNumber(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }

    private static void displayPrimes(int n) {
        if (n < 2) {
            System.out.println("There are no prime numbers less than 2.");
            return;
        }

        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        System.out.print("Prime numbers up to " + n + ": ");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static boolean isPalindrome(int number) {
        return number == ReverseNumber(number);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}