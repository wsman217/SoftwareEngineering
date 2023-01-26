package SmallProject;

import java.util.ArrayList;

public class SavingAccount {

    private double balance;
    private ArrayList<User> users = new ArrayList<>();
    private double interestRate = .25;

    public SavingAccount() {

    }

    public SavingAccount(double balance) {
        this();
        this.balance = balance;
    }

    public SavingAccount(double balance, ArrayList<User> users) {
        this(balance);
        this.users = users;
    }


    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "{Balance: " + balance + ", Users: " + users + "}";
    }
}
