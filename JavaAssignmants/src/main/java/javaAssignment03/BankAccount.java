package javaAssignment03;

public class BankAccount {

    String accountNumber;
    double balance;
    String owner;

    public static void main(String[] args) {
        System.out.println ("hello form Bank Account class!");

        BankAccount obj = new BankAccount ();
        obj.accountNumber= "2354";
        obj.balance = 1000.00;
        obj.owner= "John";

        System.out.println ("Account Number:" + obj.accountNumber );
        System.out.println ("Balance:" + obj.balance);
        System.out.println ("Owner:" + obj.owner);
    }
}
