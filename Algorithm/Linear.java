package Algorithm;
class Linear {

    static int search(int[] array, int length, int target) {
        for (int i = 0; i < length; i++) {
            if (array[i] == target)
                return i;
        }

        // return -1 if the element is not found
        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };
        int length = array.length;
        
        int target = 25; // Changed target value

        int index = search(array, length, target);
        
        if (index == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element found at position " + index);
    }
}