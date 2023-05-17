package javaQuiz2;

public class Author {
    String firstName;
    String lastName;
    public void printInfo(){
        System.out.println("Author's full name is " + firstName + " " + lastName);
    }
    public static void main(String[] args) {

        Author a = new Author ();

        a.firstName ="John";
        a.lastName = "Keats";

        a.printInfo ();
    }
}
