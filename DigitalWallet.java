public class DigitalWallet {
    private String accountHolder;
    private double balance;
    private final String pinCode;

    public DigitalWallet(String accountHolder, double initialBalance, String pinCode) {
        this.accountHolder = accountHolder;

        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }

        this.pinCode = pinCode;
    }

    public boolean withdraw(double amount, String enteredPin) {
        if (enteredPin.equals(pinCode) && amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }

        return false;
    }
}