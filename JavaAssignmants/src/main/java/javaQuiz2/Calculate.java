package javaQuiz2;

public class Calculate {
    int a;
    int b;
    public void sum(){
        System.out.println ("the sum of 2 numbers: " + (a+b));}
    public void multiplication(){
        System.out.println ("the multiplication of 2 numbers:" + (a*b));
    }
    public void subtraction(){
        System.out.println ("the subtraction of 2 numbers:" + (a-b));
    }
    public void division(){
        System.out.println ("the division of 2 numbers:" + (a/b));
    }
    public static void main(String[] args) {

        Calculate number = new Calculate ();

        number.a = 16;
        number.b = 4;

        number.sum ();
        number.subtraction ();
        number.multiplication ();
        number.division ();

    }
}
