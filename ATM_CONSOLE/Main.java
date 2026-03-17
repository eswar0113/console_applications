public class Main {
    public static void main(String[] args) {
        Account account = new Account("John Doe", 1234, 5000.00);
        ATM atm = new ATM(account);
        atm.start();
    }
}
