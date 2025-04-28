package ConstructorMethod;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ATMacc accountMarcus = new ATMacc("Marcus Laurence", 500.00, "1234");
        ATMacc accountJames = new ATMacc("James Bond", 1000.00, "5678");

        ATMacc currentAccount = null;

        boolean isActive = true;
        while (isActive) {
            System.out.println("\nSelect an account \n1: Marcus Laurence \n2: James Bond");
            System.out.println("Input Account:");
            int selection = input.nextInt();
            input.nextLine();

            if (selection == 1) {
                currentAccount = accountMarcus;
            } else if (selection == 2) {
                currentAccount = accountJames;
            } else {
                System.out.println("Invalid Account.");
                continue;
            }

            System.out.print("Enter PIN: ");
            String pinInput = input.nextLine();

            if (!currentAccount.authenticatePin(pinInput)) {
                System.out.println("Incorrect PIN!");
                continue;
            }

            boolean sessionActive = true;
            while (sessionActive) {
                System.out.println("\n------ ATM Menu -----");
                System.out.println("1. Deposit Money");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Check Balance");
                System.out.println("4. Transaction History");
                System.out.println("5. Change PIN");
                System.out.println("6. Exit Account");
                System.out.println("7. Exit System");
                System.out.print("Enter choice: ");

                int userChoice = input.nextInt();
                input.nextLine();

                switch (userChoice) {
                    case 1: 
                        System.out.print("Enter amount to deposit: $");
                        double depositAmount = input.nextDouble();
                        input.nextLine();
                        System.out.print("Confirm PIN: ");
                        String depositPin = input.nextLine();

                        if (currentAccount.deposit(depositAmount, depositPin)) {
                            System.out.println("Deposit successful!");
                        } else {
                            System.out.println("Deposit failed. Incorrect PIN.");
                        }
                        break;
                    case 2: 
                        System.out.print("Enter amount to withdraw: $");
                        double withdrawAmount = input.nextDouble();
                        input.nextLine();
                        System.out.print("Confirm PIN: ");
                        String withdrawPin = input.nextLine();

                        if (currentAccount.withdraw(withdrawAmount, withdrawPin)) {
                            System.out.println("Withdrawal successful!");
                        } else {
                            System.out.println("Withdrawal failed. Incorrect PIN or insufficient funds.");
                        }
                        break;
                    case 3: 
                        currentAccount.checkBalance();
                        break;
                    case 4: 
                        currentAccount.displayTransactionHistory();
                        break;
                    case 5: 
                        System.out.print("Enter old PIN: ");
                        String oldPin = input.nextLine();
                        System.out.print("Enter new PIN: ");
                        String newPin = input.nextLine();

                        if (currentAccount.changePin(oldPin, newPin)) {
                            System.out.println("PIN changed successfully!");
                        } else {
                            System.out.println("PIN change invalid. Incorrect old PIN.");
                        }
                        break;
                    case 6: 
                        sessionActive = false;
                        System.out.println("Exiting account...");
                        break;
                    case 7: 
                        sessionActive = false;
                        isActive = false;
                        System.out.println("BYE....");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        }

        input.close();
    }
}