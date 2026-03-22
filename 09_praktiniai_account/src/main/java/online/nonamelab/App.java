package online.nonamelab;

import java.util.Date;

public class App {
    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount("David", 1122, 20000, 5000);
        checkingAccount.setAnnualInterestRate(4.5);
        checkingAccount.withdraw(2000);
        checkingAccount.deposit(100);
        checkingAccount.deposit(100);
        checkingAccount.deposit(100);
        checkingAccount.deposit(100);
        checkingAccount.deposit(100);
        checkingAccount.withdraw(200);
        System.out.println(checkingAccount);

        SavingAccount savingAccount = new SavingAccount("Jonas", 4444, 3000);
        savingAccount.setAnnualInterestRate(4.5);
        savingAccount.withdraw(25000);
        savingAccount.deposit(20000);
        savingAccount.deposit(2000);
        savingAccount.withdraw(25000);
        System.out.println(savingAccount);


    }
}