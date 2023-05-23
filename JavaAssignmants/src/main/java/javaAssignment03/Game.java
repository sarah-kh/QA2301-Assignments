package javaAssignment03;

public class Game {
    String name;
    String genre;
    String releaseDate;

    public static void main(String[] args) {

        Game obj = new Game ();

        obj.name = "Call of Duty";
        obj.genre = "shooter";
        obj.releaseDate = "2003";

        System.out.println ("Game:" + obj.name);
        System.out.println ("Genre:" + obj.genre);
        System.out.println ("Release Date:" + obj.releaseDate);
    }
}
