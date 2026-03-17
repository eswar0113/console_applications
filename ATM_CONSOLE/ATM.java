import java.util.Scanner;

public class ATM {

    private Scanner sc = new Scanner(System.in);
    private Account account;
    private LoginOperation loginOperation = new LoginOperation();
    private BalanceOperation balanceOperation = new BalanceOperation();
    private DepositOperation depositOperation = new DepositOperation();
    private WithdrawOperation withdrawOperation = new WithdrawOperation();

    public ATM(Account account) {
        this.account = account;
    }

    public void start() {
        System.out.println("==========================");
        System.out.println("     Welcome to ATM       ");
        System.out.println("==========================");

        boolean loggedIn = loginOperation.login(sc, account);

        if (loggedIn == false) {
            System.out.println("Too many wrong attempts. Goodbye!");
            return;
        }

        showMenu();
    }

    public void showMenu() {
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            if (choice == 1) {
                balanceOperation.showBalance(account);

            } else if (choice == 2) {
                depositOperation.deposit(sc, account);

            } else if (choice == 3) {
                withdrawOperation.withdraw(sc, account);

            } else if (choice == 4) {
                System.out.println("Thank you for using ATM. Goodbye!");

            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
