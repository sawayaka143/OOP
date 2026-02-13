package problem_2;

public class BankAccount {
    public enum AccountType {
        DEBIT,
        CREDIT,
        SAVINGS
    }

    public static int totalAccounts = 0;
    public static final String BANK_NAME = "Maze Bank";

    private final int accountNumber;
    private String ownerName;
    private double balance;
    private final AccountType type;

    {
        totalAccounts++;
    }

    public BankAccount(String ownerName, AccountType type, double initialDeposit) {
        this.accountNumber = totalAccounts;
        this.ownerName = ownerName;
        this.type = type;
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void deposit(double amount, String description) {
        this.balance += amount;
        System.out.printf("Deposit description: %s.", description);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public AccountType getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public static void printBankInfo() {
        System.out.println("Bank: " + BANK_NAME);
        System.out.println("Total accounts: " + totalAccounts);
    }
}

