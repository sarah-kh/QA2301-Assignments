package javaAssignment02;

public class Advertisement {
    public static void main(String[] args) {

        String title = "iphone";
        String description = "cell phone";
        String targetAudience = "people age 18 and over";

        System.out.println ("Please print the product details");
        System.out.println ("title: " + title);
        System.out.println ("description: " + description);
        System.out.println ("target audiences: " + targetAudience);

        boolean isSponsored= true;
        boolean isFeatured =false;

        System.out.println("this advertisement is featured: " + isFeatured );
        System.out.println ("this advertisement is sponsored: " + isSponsored);

    }
}
