package Algorithm;
public class Factorial {
    public static int computeFactorial(int value) {
        int result = 1;
        for (int j = 2; j <= value; j++) {
            result *= j;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 6; // Changed number
        System.out.println("Factorial of " + number + " is " + computeFactorial(number));
    }
}