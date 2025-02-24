package FirstWeek;


public class Recursion3 {
    
    public static void main(String [] args)
    {
        int result = sum(10);
        System.out.println(result);
    }

    public static int sum(int no)
    {
        if (no > 0)
        {
            return no + sum(no - 1);
        }
        else
        {
            return 0;
        }

    }
}
