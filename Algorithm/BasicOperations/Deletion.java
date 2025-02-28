package Algorithm.BasicOperations;

public class Deletion {
    public static void main(String[] args) {
        int[] LA = {1, 3, 5, 7, 8};
        int k = 3, n = 5;

        System.out.println("The original array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.printf("LA[%d] = %d%n", i, LA[i]);
        }

        int j = k;

      
        while (j < n) {
            LA[j - 1] = LA[j];
            j++;
        }

        n = n - 1; 

        System.out.println("The array elements after deletion:");
        for (int i = 0; i < n; i++) {
            System.out.printf("LA[%d] = %d%n", i, LA[i]);
        }
    }
}