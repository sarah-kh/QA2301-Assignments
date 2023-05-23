package javaAssignment03;

public class Charity {

    String name;
    String mission;
    double donation;

    public static void main(String[] args) {

        Charity obj = new Charity ();

        obj.name ="Bill&Melinda Gates Foundation";
        obj.mission = "non-profit";
        obj.donation = 1000.00;

        System.out.println ("name of the charity foundation: " + obj.name);
        System.out.println ("misson: " + obj.mission);
        System.out.println ("donations: " + obj.donation);
    }
}
