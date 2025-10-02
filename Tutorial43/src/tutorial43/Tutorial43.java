package tutorial43;

import java.util.Scanner;

public class Tutorial43 {

    public static void main(String[] args) {
        // read in values.
        Scanner kbd = new Scanner(System.in);

        // instantiate a Student object with the default constructor.
        Student student1 = new Student();

        System.out.println("Info for second student");

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

        System.out.print("Student number: ");
        cStudNr = kbd.nextLong();

        System.out.print("Outstaning balance: R");
        cBalance = kbd.nextDouble();

        Student student2 = new Student(cId, cNameSurname, cBirthYear, cStudNr, cBalance);

        System.out.println("-----------------------------------------");

        System.out.println("Student1 Details");
        //student1.displayDetails();
        System.out.println(student1);

        System.out.println("-----------------------------------------");

        System.out.println("Student2 Details");
        //student2.displayDetails();
        System.out.println(student2);

        System.out.println("-----------------------------------------");

        if (student1.getBirthYear() > student2.getBirthYear()) {
            System.out.println(student2.getNameSurname() + " is older, being born in " + student2.getBirthYear());
        } else {
            System.out.println(student1.getNameSurname() + " is older, being born in " + student1.getBirthYear());
        }

        if (student1.getBalance() > student2.getBalance()) {
            System.out.println(student1.getNameSurname() + " owes more " + student2.getNameSurname());
        } else{
            System.out.println(student2.getNameSurname() + " owes more than " + student1.getNameSurname());
        }

    }// end of main

}// end of class
