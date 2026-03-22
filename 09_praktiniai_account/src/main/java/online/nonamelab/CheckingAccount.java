package online.nonamelab;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount() {
        this(0,0,5000);
    }

    public CheckingAccount(double initialBalance, double overdraftLimit) {
        this(0, initialBalance, 5000);
    }

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public CheckingAccount(String name, int id, double balance, double overdraftLimit) {
        super(name, id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(int limit) {
        this.overdraftLimit = limit;
    }

    @Override
    protected boolean canWithdraw(double amount) {
        return amount <= getBalance() + overdraftLimit;
    }

    @Override
    public String toString() {
        return "CheckingAccount \n" + super.toString();
    }
}
