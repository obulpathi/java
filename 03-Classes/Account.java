public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double credit(double amount) {
        balance = balance + amount;

        return balance;
    }

    public double debit(double amount) {
        balance = balance - amount;

        return balance;
    }
}
