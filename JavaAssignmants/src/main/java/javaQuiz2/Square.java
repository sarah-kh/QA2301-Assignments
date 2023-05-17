package javaQuiz2;

public class Square {

    float length;
    float width;
    public void calculateArea(){
        System.out.println ("the area of the Square: " + (length*width));
    }
    public static void main(String[] args) {
       Square value = new Square ();

        value.width = 4.0F;
        value.length = 4.0F;

        value.calculateArea ();

    }

}
