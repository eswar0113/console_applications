import java.util.Scanner;

public class DepositOperation {
    public void deposit(Scanner sc, Account account) {
        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
        } else {
            account.balance = account.balance + amount;
            System.out.println("Deposited Rs " + amount);
            System.out.println("New balance: Rs " + account.balance);
        }
    }
}
