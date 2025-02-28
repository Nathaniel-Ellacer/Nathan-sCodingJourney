package Algorithm.BasicOperations;

public class Update {
    public static void main(String[] args) {
        int[] LA = {1, 3, 5, 7, 8};
        int k = 3, n = 5, item = 10;

        System.out.println("The original array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.printf("LA[%d] = %d%n", i, LA[i]);
        }

        LA[k - 1] = item;

        System.out.println("The array elements after updation:");
        for (int i = 0; i < n; i++) {
            System.out.printf("LA[%d] = %d%n", i, LA[i]);
        }
    }
}