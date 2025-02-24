package Algorithm;
public class SquareCubeActivity2 {

    // Time Complexity: O(1) - Constant time operation (multiplication)

    public static void main(String[] args) {

        int sumOfSquares = 0;
        int sumOfCubes = 0;

        System.out.println("Number\tSquared\tCubed");

        for (int evenNum = 2; evenNum <= 10; evenNum += 2) {

            int squareValue = calculateSquared(evenNum);
            int cubeValue = calculateCubed(evenNum);

            sumOfSquares += squareValue;
            sumOfCubes += cubeValue;

            System.out.println(evenNum + "\t" + squareValue + "\t" + cubeValue);
        }

        System.out.println("Total\t" + sumOfSquares + "\t" + sumOfCubes);
    }

    private static int calculateSquared(int number) {
        return number * number;
    }

    private static int calculateCubed(int number) {
        return number * number * number;
    }
}