package javaAssignment03;

import com.sun.tools.javac.tree.DCTree;

import javax.print.Doc;

public class Doctor {

    String name;
    String specialization;
    String contactInfo;

    public static void main(String[] args) {

        Doctor obj = new Doctor ();

        obj.name ="Dr. Wang";
        obj.specialization = "Research Management";
        obj.contactInfo = "wang@hotmail.com";

        System.out.println ("name:" + obj.name);
        System.out.println ("specialization:" + obj.specialization);
        System.out.println ("contact:" + obj.specialization);
    }
}
