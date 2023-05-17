package javaQuiz2;

public class Rectangle {

    float length;
    float width;
     public void calculateArea(){
         System.out.println ("the area of the rectangle: " + (length*width));
     }
    public static void main(String[] args) {
        Rectangle value = new Rectangle ();

        value.width = 3.0F;
        value.length = 7.5F;

        value.calculateArea ();


    }
}
