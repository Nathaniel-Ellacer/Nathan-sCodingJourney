package Algorithm;

public class Fibonacci2 {

    public static void main(String[] args) {

        int Num = 15;
        int[] FiboAr = new int[Num];

        FiboAr[0] = 0;

        if (Num > 1) {
            FiboAr[1] = 1;
        }

        for (int x = 2; x < Num; x++) {
            FiboAr[x] = FiboAr[x - 1] + FiboAr[x - 2];
        }

        System.out.println("Fibonacci Sequence: ");

        for (int Expr : FiboAr) // : meaning For-each Code to execute for each element
        { 
            System.out.print(Expr + " ");
        }
    }
}