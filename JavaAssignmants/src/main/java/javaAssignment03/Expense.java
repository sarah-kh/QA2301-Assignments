package javaAssignment03;

public class Expense {
    String Date;
    double amount;
    String category;
    public static void main(String[] args) {

        Expense obj = new Expense ();

         obj.Date ="05/23/2023";
         obj.amount = 500.00;
         obj.category = "car payment";

        System.out.println ("payment date:" + obj.Date);
        System.out.println ("payment amount:" + obj.amount);
        System.out.println ("payment category:" + obj.category);
    }
}
