import java.util.Arrays;

public class BubbleSortExample {

    public static void bubbleSort(int[] scores) {
        int n = scores.length;
        System.out.println("Initial scores: " + Arrays.toString(scores));

        for (int i = 0; i < n; i++) {
            int swaps = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (scores[j] < scores[j + 1]) { 
                   
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                    swaps++;
                }
            }
            System.out.printf("Pass %d: %s (%d swaps)%n", i + 1, Arrays.toString(scores), swaps);
            
            if (swaps == 0) {
                break;
            }
        }

        System.out.println("Final sorted scores: " + Arrays.toString(scores));
    }

    public static void main(String[] args) {
        // Test cases
        int[][] testScores = {
            {75, 83, 90, 65, 88},
            {50, 45, 60, 70, 55},
            {100, 99, 98, 97, 96},
            {30, 20, 10, 40, 50}
        };

        for (int[] scores : testScores) {
            bubbleSort(scores);
            System.out.println();
        }
    }
}