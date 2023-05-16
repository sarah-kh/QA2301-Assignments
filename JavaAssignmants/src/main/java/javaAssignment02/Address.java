package javaAssignment02;

import java.sql.SQLOutput;

public class Address {
    public static void main(String[] args) {

        String address = "42nd St,Times Square";

        boolean hasStreetName=true;
        boolean hasApartmentNo=false;

        System.out.println("The address is " + address +"\n"
                + "the address has Apartment No " + hasApartmentNo +"\n"
                + "the address has Street Name " + hasStreetName );

    }
}
