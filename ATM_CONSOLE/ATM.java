import java.util.Scanner;

public class ATM {

    private Account account;
    private Scanner sc = new Scanner(System.in);

    public ATM(Account account) {
        this.account = account;
    }

    public void start() {
        System.out.println("==========================");
        System.out.println("     Welcome to ATM       ");
        System.out.println("==========================");

        if (!authenticate()) {
            System.out.println("Too many wrong attempts. Card blocked. Goodbye!");
            return;
        }

        System.out.println("Hello, " + account.getHolderName() + "!");
        menu();
    }

    private boolean authenticate() {
        int attempts = 3;
        while (attempts > 0) {
            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();
            if (account.checkPin(enteredPin)) {
                System.out.println("PIN verified successfully.");
                return true;
            } else {
                attempts--;
                System.out.println("Wrong PIN. Attempts remaining: " + attempts);
            }
        }
        return false;
    }

    private void menu() {
        boolean running = true;
        while (running) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    changePin();
                    break;
                case 5:
                    running = false;
                    System.out.println("Thank you for using ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void checkBalance() {
        System.out.printf("Your current balance is: Rs %.2f%n", account.getBalance());
    }

    private void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        if (account.deposit(amount)) {
            System.out.printf("Rs %.2f deposited successfully.%n", amount);
            System.out.printf("Updated balance: Rs %.2f%n", account.getBalance());
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    private void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount > account.getBalance()) {
            System.out.println("Insufficient balance.");
        } else if (account.withdraw(amount)) {
            System.out.printf("Rs %.2f dispensed. Please collect your cash.%n", amount);
            System.out.printf("Remaining balance: Rs %.2f%n", account.getBalance());
        } else {
            System.out.println("Invalid amount. Withdrawal failed.");
        }
    }

    private void changePin() {
        System.out.print("Enter current PIN: ");
        int current = sc.nextInt();
        System.out.print("Enter new PIN: ");
        int newPin = sc.nextInt();
        System.out.print("Confirm new PIN: ");
        int confirmPin = sc.nextInt();

        if (newPin != confirmPin) {
            System.out.println("PINs do not match. PIN not changed.");
            return;
        }
        if (account.changePin(current, newPin)) {
            System.out.println("PIN changed successfully.");
        } else {
            System.out.println("Incorrect current PIN. PIN not changed.");
        }
    }
}
