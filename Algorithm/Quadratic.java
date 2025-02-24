package Algorithm;
public class Quadratic {
    public static void main(String[] args) {
        int dimension = 3;
        for (int x = 1; x <= dimension; x++) {
            for (int y = 1; y <= dimension; y++) {
                System.out.print("[" + x + "," + y + "] ");
            }
            System.out.println(); // Print a new line after each row
        }
    }
}
