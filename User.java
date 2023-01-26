package SmallProject;

import java.util.ArrayList;
import java.util.Arrays;

public class User {

    private ArrayList<Account> accounts = new ArrayList<>();
    private final int id;
    private final String firstName, lastName;

    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addAccounts(Account... accountsToAdd) {
        accounts.addAll(Arrays.asList(accountsToAdd));
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}
