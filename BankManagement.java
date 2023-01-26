package SmallProject;

import java.util.Scanner;

public class BankManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean hasProgramEnded = false;

        User user = new User(0, "Test", "User");
        System.out.print("Logged in as " + user.getFirstName() + " " + user.getLastName());

        while (!hasProgramEnded) {
            if (!user.getAccounts().isEmpty()) {
                System.out.print("Which account would you like to access: ");
                for (int i = 0; i < user.getAccounts().size(); i++) {
                    Account account = user.getAccounts().get(i);
                    System.out.println((i + 1) + " - " + account.getAccountName());
                }
                String input = scanner.nextLine();
                try {
                    int inputInteger = Integer.parseInt(input);
                    Account selectedAccount = user.getAccounts().get(inputInteger - 1);
                    System.out.println("Account selected is: " + selectedAccount.getAccountName());

                    boolean selectDifferentAccount = false;

                    while (!selectDifferentAccount) {
                        System.out.print("Select different account (Y/n): ");

                        String nextLine = scanner.nextLine();
                        if (nextLine.equalsIgnoreCase("y") || nextLine.equalsIgnoreCase("yes")) {
                            selectDifferentAccount = true;
                        }

                        System.out.print("Manage checking or savings account (checking/saving): ");
                        String checkingSavingInput = scanner.nextLine();
                        boolean isChecking = checkingSavingInput.equalsIgnoreCase("checking");
                        boolean exitBalanceManagement = false;

                        while (!exitBalanceManagement) {
                            if (isChecking) {
                                System.out.println("1 - Check balance" +
                                        "\n2 - Deposit" +
                                        "\n3 - Withdraw" +
                                        "\n4 - Exit balance management.");
                                int balanceManagementInput = scanner.nextInt();

                                switch (balanceManagementInput) {
                                    case 1:
                                        System.out.println("Account balance is: " + selectedAccount.getCheckingAccount().getBalance());
                                        break;
                                    case 2:
                                        System.out.print("How much would you like to deposit: ");
                                        double depositAmount = scanner.nextDouble();
                                        selectedAccount.getCheckingAccount().deposit(depositAmount);
                                        break;
                                    case 3:
                                        System.out.print("How much would you like to withdraw: ");
                                        double withdrawAmount = scanner.nextDouble();
                                        selectedAccount.getCheckingAccount().deposit(withdrawAmount);
                                        break;
                                    case 4:
                                        exitBalanceManagement = true;
                                        break;
                                }
                            } else {
                                //TODO add more options?
                                System.out.println("1 - Check balance" +
                                        "\n2 - Deposit" +
                                        "\n3 - Withdraw" +
                                        "\n4 - Exit balance management.");
                                int balanceManagementInput = scanner.nextInt();

                                switch (balanceManagementInput) {
                                    case 1:
                                        System.out.println("Account balance is: " + selectedAccount.getCheckingAccount().getBalance());
                                        break;
                                    case 2:
                                        System.out.print("How much would you like to deposit: ");
                                        double depositAmount = scanner.nextDouble();
                                        selectedAccount.getCheckingAccount().deposit(depositAmount);
                                        break;
                                    case 3:
                                        System.out.print("How much would you like to withdraw: ");
                                        double withdrawAmount = scanner.nextDouble();
                                        selectedAccount.getCheckingAccount().deposit(withdrawAmount);
                                        break;
                                    case 4:
                                        exitBalanceManagement = true;
                                        break;
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    if (input.equalsIgnoreCase("exit")) {
                        hasProgramEnded = true;
                        System.out.println("Goodbye!");
                    }
                }
            } else {
                System.out.print("You have no accounts would you like to create one (Y/n): ");
                String nextLine = scanner.nextLine();
                if (nextLine.equalsIgnoreCase("y") || nextLine.equalsIgnoreCase("yes")) {
                    System.out.println("Enter the account name: ");
                    String accountName = scanner.nextLine();

                    user.addAccounts(new Account(user, new CheckingAccount(), new SavingAccount(), accountName));

                    System.out.println("Account created.");
                } else if (nextLine.equalsIgnoreCase("exit")) {
                    hasProgramEnded = true;
                    System.out.println("Goodbye!");
                }
            }
        }
    }
}
