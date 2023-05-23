package javaAssignment03;

public class Book {
    String title;
    String Author;
    String ISBN;

    public static void main(String[] args) {
        System.out.println ("hello from Book class!");

        Book obj = new Book ();

        obj.title = "The Lord of the Rings";
        obj.Author = "J.R.R. Tolkien";
        obj.ISBN = "8845292614";


        System.out.println ("the title of the book: " + obj.title );
        System.out.println ("the author of the book: " + obj.Author);
        System.out.println ("the ISBN no of the book: " + obj.ISBN);
    }
}
