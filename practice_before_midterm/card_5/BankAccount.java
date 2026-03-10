package practice_before_midterm.card_5;

public class BankAccount {
  private double balance;
  private String accountNumber;

  public BankAccount(String accountNumber, double initialBalance) {
    this.accountNumber = accountNumber;
    this.balance = initialBalance;
  }

  public void withdraw(double amount) {
    if (amount > balance) {
      throw new InsufficientFundsException("Withdrawal of " + amount + "exceeds balance: " + balance);
    }
    balance -= amount;
  } 
  public void deposit(double amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("Deposit amount cannot be negative.");
    }
    balance += amount;
  }
}
