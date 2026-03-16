package online.nonamelab;

import java.time.LocalDate;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return this.balance;
    }

    public int credit(int amount) {
        return balance += amount;
    }

    public int debit(int amount) {
        if(amount <= balance) {
            balance -= amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if(amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        LocalDate date = LocalDate.now();

        int month = date.getMonthValue(); // 1 to 12
        int day = date.getDayOfMonth();
        int year = date.getYear();

        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
