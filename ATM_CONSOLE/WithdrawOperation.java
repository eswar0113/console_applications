import java.util.Scanner;

public class WithdrawOperation {
    public void withdraw(Scanner sc, Account account) {
        System.out.print("Enter withdraw amount: ");
        double amount = sc.nextDouble();

        if (amount > account.balance) {
            System.out.println("Insufficient balance!");
        } else if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
        } else {
            account.balance = account.balance - amount;
            System.out.println("Withdrawn Rs " + amount);
            System.out.println("Remaining balance: Rs " + account.balance);
        }
    }
}
