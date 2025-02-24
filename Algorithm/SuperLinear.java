package Algorithm;
import java.util.Arrays;

public class SuperLinear {
    public static void main(String[] args) {
        int[] nums = {12, 7, 5, 10, 3};
        
        // Print original array
        System.out.println("Original array: " + Arrays.toString(nums));
        
        // Sort the array
        Arrays.sort(nums);
        
        // Print sorted array
        System.out.println("Sorted array: " + Arrays.toString(nums));
        
        // Print max and min values
        System.out.println("Max: " + nums[nums.length - 1]);
        System.out.println("Min: " + nums[0]);
    }
}

