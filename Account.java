package SmallProject;

public class Account {

    private final User accountHolder;
    private CheckingAccount checkingAccount;
    private SavingAccount savingAccount;
    private final String accountName;

    public Account(User accountHolder, CheckingAccount checkingAccount, SavingAccount savingAccount, String accountName) {
        this.accountHolder = accountHolder;
        this.checkingAccount = checkingAccount;
        this.savingAccount = savingAccount;
        this.accountName = accountName;
    }

    @Override
    public String toString() {
        return "{AccountHolder: " + accountHolder + ", CheckingAccount: " + checkingAccount + ", SavingAccount: " + savingAccount + "}";
    }

    public String getAccountName() {
        return accountName;
    }

    public CheckingAccount getCheckingAccount() {
        return checkingAccount;
    }

    public SavingAccount getSavingAccount() {
        return savingAccount;
    }
}
