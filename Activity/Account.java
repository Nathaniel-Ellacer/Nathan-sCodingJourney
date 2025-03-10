package Activity;


    public class Account {
        
 double balance;
 
    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("subtracting " + amount + " from account balance");
        } else {
            System.out.println("Debit amount exceeded account balance.");
        }
    }
 }