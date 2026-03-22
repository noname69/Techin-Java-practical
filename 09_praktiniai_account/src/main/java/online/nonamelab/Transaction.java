package online.nonamelab;


import java.util.Date;

public class Transaction {
    private final Date date;
    private final char type;

    private final double amount;
    private final double balance;
    private final String description;

    public Transaction(char type, double amount, double balance, String description) {

        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.date = new Date();
        if(type != 'D' && type != 'W') {
            this.type = 'U';        }
        else {
            this.type = type;
        }
    }

    public Date getDate() {
        return date;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }


    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }


}
