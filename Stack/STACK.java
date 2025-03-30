package Stack;

import java.util.Scanner;

public class STACK {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInputStack;

        while (true) {
            System.out.print("INPUT STACK VALUE: ");
            userInputStack = scanner.nextInt();

            while (true) {
                System.out.println("MENU");
                System.out.println("1. PUSH");
                System.out.println("2. POP");
                System.out.println("3. TOP");
                System.out.println("4. SIZE");
                System.out.println("5. EMPTY");
                System.out.println("6. DISPLAY STACK");
                System.out.println("7. EXIT");

                System.out.print("Enter option [1..7]: ");
                int MENU = scanner.nextInt();

                switch (MENU) {
                    case 1:
                        System.out.println("Sum of digits: " + SumDigits(userInputStack));
                        break;
                    case 2:
                        System.out.println("Reversed number: " + ReverseNumber(userInputStack));
                        break;
                    case 3:
                        System.out.print("Display all the prime numbers from 2 to n (n is the user's input). Given n: ");
                        int n = scanner.nextInt();
                        displayPrimes(n);
                        break;
                    case 4:
                        System.out.println(userInputStack + (isPalindrome(userInputStack) ? " is a palindrome." : " is not a palindrome."));
                        break;
                    case 5:
                        System.out.println(userInputStack + " is " + (isEven(userInputStack) ? "even." : "odd."));
                        break;
                    case 6:
                        System.out.println("Displaying Stack Content:");
                        return;
                    case 7:
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
