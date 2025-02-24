package Algorithm;
public class Cubic {
    public static void main(String[] args) {
        int limit = 2; // Changed limit
        for (int a = 1; a <= limit; a++) {
            for (int b = 1; b <= limit; b++) {
                for (int c = 1; c <= limit; c++) {
                    System.out.println(a + ";" + b + ";" + c); // Changed separator
                }
            }
        }
    }
}
