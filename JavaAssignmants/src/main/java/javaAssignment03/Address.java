package javaAssignment03;

public class Address {
    String streetAddress;
    String city;
    String state;
    String country;
    String postalCode;
    public static void main(String[] args) {

        System.out.println ("hello from address class!");

        Address obj = new Address ();
        obj.streetAddress = "42nd st";
        obj.city ="New York";
        obj.state ="NY";
        obj.country = "USA";
        obj.postalCode = "10001";

        System.out.println ("City Name: " + obj.city);
        System.out.println ("street address:" + obj.streetAddress);
        System.out.println ("city:" + obj.city);
        System.out.println ("country: " + obj.country);
        System.out.println ("postal code:" + obj.postalCode);
    }
}
