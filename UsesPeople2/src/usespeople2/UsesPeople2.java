package usespeople2;

import java.util.Scanner;

public class UsesPeople2 {

    public static void main(String[] args) {
        // Read in values for person.
        Scanner kbd = new Scanner(System.in);

        Student student1 = new Student();

        System.out.println("Info for second student:");

        String cId;
        String cNameSurname;
        int cBirthYear;
        long cStudNr;
        double cBalance;

        System.out.print("ID number: ");
        cId = kbd.next();

        System.out.print("Name and Surname: ");
        cNameSurname = kbd.next();

        System.out.print("Year born (eg. 1996): ");
        cBirthYear = kbd.nextInt();

        Person person2 = new Person(cId, cNameSurname, cBirthYear);

        System.out.print("Student number: ");
        cStudNr = kbd.nextLong();

        System.out.print("Outstaning balance: R");
        cBalance = kbd.nextDouble();

        Student student2 = new Student(cStudNr, cBalance);

        System.out.println("-----------------------------------------");

        Person person1 = new Person();
        
        student2.setId(cId);
        student2.setNameSurname(cNameSurname);
        student2.setBirthYear(cBirthYear);
        
        System.out.println("Student1 Details:");
        student1.displayDetails();
        
        System.out.println("-----------------------------------------");

        System.out.println("Student2 Details:");
        student2.displayDetails();

    }// end of main

}// end of class
