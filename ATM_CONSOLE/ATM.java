import java.util.Scanner;

public class ATM {

    Scanner sc = new Scanner(System.in);

    String holderName = "John Doe";
    int pin = 1234;
    double balance = 5000;

    public void start() {
        System.out.println("==========================");
        System.out.println("     Welcome to ATM       ");
        System.out.println("==========================");

        boolean loggedIn = false;
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == pin) {
                loggedIn = true;
                System.out.println("PIN correct! Welcome, " + holderName + "!");
                break;
            } else {
                attempts--;
                System.out.println("Wrong PIN. Attempts left: " + attempts);
            }
        }

        if (loggedIn == false) {
            System.out.println("Too many wrong attempts. Goodbye!");
            return;
        }

        showMenu();
    }

    public void showMenu() {
        int choice = 0;

        while (choice != 5) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Your balance is: Rs " + balance);

            } else if (choice == 2) {
                System.out.print("Enter deposit amount: ");
                double amount = sc.nextDouble();
                if (amount <= 0) {
                    System.out.println("Amount must be greater than zero.");
                } else {
                    balance = balance + amount;
                    System.out.println("Deposited Rs " + amount);
                    System.out.println("New balance: Rs " + balance);
                }

            } else if (choice == 3) {
                System.out.print("Enter withdraw amount: ");
                double amount = sc.nextDouble();
                if (amount > balance) {
                    System.out.println("Insufficient balance!");
                } else if (amount <= 0) {
                    System.out.println("Amount must be greater than zero.");
                } else {
                    balance = balance - amount;
                    System.out.println("Withdrawn Rs " + amount);
                    System.out.println("Remaining balance: Rs " + balance);
                }

            } else if (choice == 4) {
                System.out.print("Enter current PIN: ");
                int currentPin = sc.nextInt();
                if (currentPin != pin) {
                    System.out.println("Wrong PIN!");
                } else {
                    System.out.print("Enter new PIN: ");
                    pin = sc.nextInt();
                    System.out.println("PIN changed successfully!");
                }

            } else if (choice == 5) {
                System.out.println("Thank you for using ATM. Goodbye!");

            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
