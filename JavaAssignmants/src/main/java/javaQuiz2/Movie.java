package javaQuiz2;

public class Movie {
    String title;
    String studio;
    String  rating;
    public void movieInfo(){
        System.out.println ("The movie info are given below ");
        System.out.println ("title of the movie: " + title);
        System.out.println ("production house: " + studio);
        System.out.println ("rating of the movie: " + rating);
    }
    public static void main(String[] args) {
        Movie movie = new Movie ();

        movie.title="Avatar";
        movie.studio="20th Century Studios";
        movie.rating="PG-13";

        movie.movieInfo ();
    }
}

