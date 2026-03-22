package online.nonamelab;

public class SavingAccount extends Account {

    public SavingAccount() {
        this(null, 0, 0);
    }

    public SavingAccount(int id, double balance)
    {
        this(null, 0, balance);
    }

    public SavingAccount(String name, int id, double balance) {
        super(name, id, balance);
    }

    @Override
    protected boolean canWithdraw(double amount) {
        return amount <= getBalance();
    }

    @Override
    public String toString() {
        return "SavingAccount \n" + super.toString();
    }
}
