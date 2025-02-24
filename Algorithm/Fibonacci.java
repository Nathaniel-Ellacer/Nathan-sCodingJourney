package Algorithm;
public class Fibonacci
{
    public static void main(String[] args) {

        int numcount = 15; 

        int b = 0, f = 1;

        System.out.print("Fibonacci Sequence: " + b + ", " + f);

        for (int c = 2; c < numcount; c++) {

            int next = b + f;

            System.out.print(", " + next);

            b = f;

            f = next;

        }

        System.out.println();

    }
}
    

