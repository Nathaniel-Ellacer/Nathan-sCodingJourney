package ArrayOneDimensional;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Salary
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$#,###.00");

        int numEmp = 0;
        String[] name;
        double[] rate;
        double[] hoursWorked;

        System.out.print("Enter number of employees to process: ");
        numEmp = input.nextInt();

        name = new String[numEmp];
        rate = new double[numEmp];
        hoursWorked = new double[numEmp];

        int indexNum = 0;
        while (indexNum < numEmp)
        {
            System.out.print("\nEnter Employee name: ");
            name[indexNum] = input.next();

            System.out.print("\nEnter rate per hour: ");
            rate[indexNum] = input.nextDouble();

            System.out.print("\nEnter number of hours worked: ");
            hoursWorked[indexNum] = input.nextDouble();

            indexNum++;


            //PRINTING OF HEADERS
            System.out.println("\nSalary Report");
            System.out.println("-----------------");
            System.out.println("Name\tRate per hour\tHours Worked\tSalary\n");

            for(int i = (numEmp - 1); i >= 0; i--)
            {
                System.out.print(name[i] + "\t");
                System.out.print(df.format(rate[i]) + "\t\t");
                System.out.print(hoursWorked[i] + "\t\t");
                System.out.println(df.format(hoursWorked[i] * rate[i]));

            }

        }
    }
}
