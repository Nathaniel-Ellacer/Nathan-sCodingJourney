package ConstructorMethod;

public class ATMacc {
    private String holderName;
    private double accountBalance;
    private String pin;
    private Transaction[] transactionList;
    private int transactionCount;

    public ATMacc(String holderName, double initialBalance, String pin) {
        this.holderName = holderName;
        this.accountBalance = initialBalance;
        this.pin = pin;
        this.transactionList = new Transaction[100]; 
        this.transactionCount = 0;
    }

    public boolean deposit(double amount, String enteredPin) {
        if (authenticatePin(enteredPin)) {
            this.accountBalance += amount;
            addTransaction("Deposit", amount);
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount, String enteredPin) {
        if (authenticatePin(enteredPin)) {
            if (amount <= this.accountBalance) {
                this.accountBalance -= amount;
                addTransaction("Withdrawal", amount);
                return true;
            } else {
                System.out.println("Insufficient funds!");
                return false;
            }
        }
        return false;
    }

    public void checkBalance() {
        System.out.println("Current balance: $" + this.accountBalance);
    }

    private void addTransaction(String type, double amount) {
        if (transactionCount < transactionList.length) {
            transactionList[transactionCount++] = new Transaction(type, amount);
        } else {

            System.arraycopy(transactionList, 1, transactionList, 0, transactionList.length - 1);
            transactionList[transactionList.length - 1] = new Transaction(type, amount);
        }
    }

    public void displayTransactionHistory() {
        System.out.println("Transaction History (Last 10 transactions):");
        if (transactionCount == 0) {
            System.out.println("No transactions found.");
            return;
        }
        for (int i = 0; i < transactionCount; i++) {
            System.out.println(transactionList[i]);
        }
    }

    public boolean changePin(String oldPin, String newPin) {
        if (this.pin.equals(oldPin)) {
            this.pin = newPin;
            return true;
        }
        return false;
    }

    public boolean authenticatePin(String enteredPin) {
        return this.pin.equals(enteredPin);
    }

    public class Transaction {
        private String type;
        private double amount;
        private String date;

        public Transaction(String type, double amount) {
            this.type = type;
            this.amount = amount;
            this.date = java.time.LocalDateTime.now().toString();
        }

        public String toString() {
            return date + " | " + type + " | $" + amount;
        }
    }
}