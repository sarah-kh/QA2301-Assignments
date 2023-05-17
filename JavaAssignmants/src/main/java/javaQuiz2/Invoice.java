package javaQuiz2;

public class Invoice {
    String itemNumber;
    String description;
    int quantity;
    double pricePerItem;

    public void printDetails() {
        System.out.println ("The product details are given below");
        System.out.println ("itemNumber: " + itemNumber);
        System.out.println ("description: " + description);
        System.out.println ("quantity: " + quantity);
        System.out.println ("price per item: " + pricePerItem);
    }
    public void getInvoiceAmount(){
        System.out.println ("invoice amount: " + (quantity*pricePerItem));
    }
    public static void main(String[] args) {

        Invoice item = new Invoice ();

        item.itemNumber ="b79";
        item.description= "hammer";
        item.quantity = (3);
        item.pricePerItem = 8.99;

        item.printDetails ();
        item.getInvoiceAmount ();

    }
}
