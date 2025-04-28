public class BubbleSort {

    public static void bubbleSort(int[] scores) {
        int n = scores.length;
        System.out.println("Initial scores: " + arrayToString(scores));

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

            System.out.println("Pass " + (i + 1) + ": " + arrayToString(scores) + " (" + swaps + " swaps)");

            // If no swaps were made, the list is sorted
            if (swaps == 0) {
                break;
            }
        }

        System.out.println("Final sorted scores: " + arrayToString(scores)+ "\n");
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] testScores1 = {75, 83, 90, 65, 88};
        int[] testScores2 = {56, 92, 71, 85, 60, 99};

        bubbleSort(testScores1);
        bubbleSort(testScores2);
    }
}