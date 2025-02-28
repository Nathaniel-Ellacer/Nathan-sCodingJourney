package Algorithm.BasicOperations;

public class Insertion{
    public static void main(String[] args) {
        int[] LA = {1, 3, 5, 7, 8};
        int item = 10, k = 3, n = 5;
        
        System.out.println("The original array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.printf("LA[%d] = %d%n", i, LA[i]);
        }

        n = n + 1;
        
        int[] newLA = new int[n];
        for (int j = 0; j < k; j++) {
            newLA[j] = LA[j];
        }
        
        newLA[k] = item;
          for (int j = k; j < n - 1; j++) {
            newLA[j + 1] = LA[j];
        }

        System.out.println("The array elements after insertion:");
        for (int i = 0; i < n; i++) {
            System.out.printf("LA[%d] = %d%n", i, newLA[i]);
        }
    }
}
