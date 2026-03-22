package online.nonamelab;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private final Date dateCreated;
    private String name;
    private final List<Transaction> transactions;

    public Account() {
        this(0, 0.0);
    }

    public Account(int id, double balance) {
        this(null, id, balance);
    }

    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0.0;
        this.dateCreated = new Date();
        this.transactions = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void settName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate / 100;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    protected void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    protected abstract boolean canWithdraw(double amount);

    public boolean withdraw(double amount) {

        if (!canWithdraw(amount)) {
            addTransaction(new Transaction('U', amount, getBalance(), "Can not withdraw, not enough funds in balance"));
            return false;
        }

        balance -= amount;
        addTransaction(new Transaction('W', amount, getBalance(), "Withdraw"));
        return true;
    }

    public void deposit(double amount) {
        balance += amount;
        addTransaction(new Transaction('D', amount, getBalance(), "Deposit"));
    }

    @Override
    public String toString() {

        StringBuilder allTransactions = new StringBuilder();


        if (!transactions.isEmpty()) {
            String operation = "Unknown";
            int i = 1;

            for (Transaction t : transactions) {
                String num = "[" + (i) + "] ";

                if (t.getType() == 'W') {
                    operation = "Withdraw";
                } else if (t.getType() == 'D') {
                    operation = "Deposit";
                }

                allTransactions
                        .append(num)
                        .append(operation)
                        .append(" at ")
                        .append(t.getDate())
                        .append(" Amount: ")
                        .append(t.getAmount())
                        .append("\n")
                        .append("Description: ")
                        .append(t.getDescription())
                        .append("\n");
                i++;

            }
        } else {
            allTransactions.append("There is no transactions");
        }

        return "Account ID: " + getId() + "\n"
                + "Account holder: " + getName() + "\n"
                + "Account was created at: " + getDateCreated() + "\n"
                + "Balance: " + getBalance() + "\n"
                + "Monthly Interest Rate: " + getMonthlyInterestRate() + " %\n"
                + "Monthly Interest: " + getMonthlyInterest() + "\n"
                + "Annual Interest Rate: " + getAnnualInterestRate() + " %\n"
                + "Transactions: \n" +
                allTransactions;

    }
}
