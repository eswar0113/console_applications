import java.util.Scanner;

public class LoginOperation {
    public boolean login(Scanner sc, Account account) {
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == account.pin) {
                System.out.println("PIN correct! Welcome, " + account.holderName + "!");
                return true;
            } else {
                attempts--;
                System.out.println("Wrong PIN. Attempts left: " + attempts);
            }
        }

        return false;
    }
}
