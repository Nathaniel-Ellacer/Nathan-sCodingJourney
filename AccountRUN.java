import java.util.Scanner;
import java.text.DecimalFormat;
import Activity.Account;
public class AccountRUN {
    private double balance;

    public AccountRUN(double initialBalance) {
        this.balance = initialBalance;
    }

    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Subtracting " + amount);
        } 
        else {
            System.out.println("Debit amount exceeded balance.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$###,###.00");
        AccountRUN[] accounts = {new AccountRUN(300.00), new AccountRUN(1000.53)};

        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Account " + (i + 1) + " balance: " + df.format(accounts[i].balance));
        }

        for (int i = 0; i < accounts.length; i++) {
            System.out.print("\nEnter withdrawal for Account " + (i + 1) + ": ");

            accounts[i].debit(scanner.nextDouble());
            System.out.println("Account " + (i + 1) + " balance: " + df.format(accounts[i].balance));
            
        }
        scanner.close();
    }
}