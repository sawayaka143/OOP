package problem_2;

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(
                "Rip Van Winkle",
                BankAccount.AccountType.DEBIT,
                1000
        );

        acc1.deposit(500);
        acc1.deposit(200, "Freelance payment");
        acc1.withdraw(300);

        System.out.println("Balance: " + acc1.getBalance());
        System.out.println("Account number: " + acc1.getAccountNumber());
        System.out.println("Type: " + acc1.getType());

        BankAccount.printBankInfo();
    }
}