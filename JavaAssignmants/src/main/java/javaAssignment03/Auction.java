package javaAssignment03;

public class Auction {

    String item;
    String startTime;
    String endTime;

    public static void main(String[] args) {

        System.out.println ("hello from Auction class1");

        Auction obj = new Auction ();

        obj.item = "cars";
        obj.startTime = "6:00pm";
        obj.endTime = "9:00pm";

        System.out.println ("auction item:" + obj.item);
        System.out.println ("start time:" + obj.startTime);
        System.out.println (" end time:" + obj.endTime);
    }
}
