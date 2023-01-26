package SmallProject;

import org.omg.CORBA.BAD_CONTEXT;

import java.util.ArrayList;

public class CheckingAccount {

    private double balance;
    private ArrayList<User> users = new ArrayList<>();

    public CheckingAccount() {
    }

    public CheckingAccount(double balance) {
        this();
        this.balance = balance;
    }

    public CheckingAccount(double balance, ArrayList<User> users) {
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
