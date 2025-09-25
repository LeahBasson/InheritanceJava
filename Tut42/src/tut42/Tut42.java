package tut42;

import java.util.Scanner;

public class Tut42 {

    public static void main(String[] args) {
        // Read in values for person.
        Scanner kbd = new Scanner(System.in);

        // aPerson
        System.out.println("Entering personal info");

        String cId;
        String cNameSurname;
        int cBirthYear;

        System.out.print("ID number: ");
        cId = kbd.next();

        System.out.print("Name and Surname: ");
        cNameSurname = kbd.next();

        System.out.print("Year born (eg.1996): ");
        cBirthYear = kbd.nextInt();

        Person aPerson = new Person(cId, cNameSurname, cBirthYear);

        System.out.println("-----------------------------");
        System.out.println("Details of the person");
        aPerson.displayDetails();
        System.out.println("-----------------------------");

        System.out.println("The person above had now registered to be a student.");
        System.out.println("-----------------------------");

        // aStudent
        Student aStudent = new Student();

        long cStudNr;
        double cBalance;

        System.out.print("Enter new student's number: ");
        cStudNr = kbd.nextLong();

        System.out.print("Enter new student's outstanding balance: ");
        cBalance = kbd.nextDouble();

        aStudent.setStudNr(cStudNr);
        aStudent.setBalance(cBalance);
        System.out.println("-----------------------------");

        System.out.println("Details of the new student");
        aStudent.displayDetails();

    }// end of main

}// end of class
