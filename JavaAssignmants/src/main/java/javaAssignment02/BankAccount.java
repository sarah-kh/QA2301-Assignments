package javaAssignment02;

public class BankAccount {
    public static void main(String[] args) {

        String accountNumber = "6279";
        double balance = 5000.00;
        String owner = "John";

        System.out.println ("the bank account number: " + accountNumber);
        System.out.println ("the account balance: " + balance);
        System.out.println ("the owner of the account: " + owner);

        boolean isActive = true;
        boolean isClosed = false;

        System.out.println ("the account is active: " + isActive);
        System.out.println ("the account is closed:" + isClosed);

    }
}
