package Algorithm.BasicOperations;

public class Search {
        public static void main(String[] args) {
            int[] LA = {1, 3, 5, 7, 8};
            int item = 5; 
            int n = 5;
            int j = 0;
    
            System.out.println("The original array elements are:");
            for (int i = 0; i < n; i++) {
                System.out.printf("LA[%d] = %d%n", i, LA[i]);
            }
    
            while (j < n) {
                if (LA[j] == item) {
                    break;
                }
                j++;
            }
    
            if (j < n) 
            {
                System.out.printf("Found element %d at position %d%n", item, j + 1);
            } 
            else 
            {
                System.out.printf("Element %d not found in the array.%n", item);
            }
        }
    }