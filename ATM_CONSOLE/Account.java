public class Account {

    private int pin;
    private double balance;
    private String holderName;

    public Account(String holderName, int pin, double balance) {
        this.holderName = holderName;
        this.pin = pin;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public boolean checkPin(int enteredPin) {
        return this.pin == enteredPin;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public boolean changePin(int oldPin, int newPin) {
        if (!checkPin(oldPin)) {
            return false;
        }
        this.pin = newPin;
        return true;
    }
}
