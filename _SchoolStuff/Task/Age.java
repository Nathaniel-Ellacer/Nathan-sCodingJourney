import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        
        System.out.print("Enter birth year: ");
        int birthyear = scanner.nextInt();

        
        int age = year - birthyear;

        // Display the result
        System.out.println(name + ", your age in " + year + " is " + age + ".");

        scanner.close();
    }
}