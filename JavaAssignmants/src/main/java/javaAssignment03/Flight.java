package javaAssignment03;

public class Flight {
    String flightNumber;
    String departureTime;
    String arrivalTime;

    public static void main(String[] args) {

        Flight obj = new Flight ();

        obj.flightNumber ="E732";
        obj.departureTime ="11.00pm";
        obj.arrivalTime = "8:00am";

        System.out.println ("Flight number:" + obj.flightNumber);
        System.out.println ("Departure time:" + obj.departureTime);
        System.out.println ("Arrival time:" +obj.arrivalTime);
    }
}
