package practice_before_midterm.card_5;

public class Main {
  public static void main(String[] args) {
    BankAccount account = new BankAccount("ABC123", 400);
    try {
      account.withdraw(700);
    } catch (InsufficientFundsException e) {
      System.err.println("Error" + e.getMessage());
    }
  }
}
