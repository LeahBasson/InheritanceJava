package usesemployees;

import java.util.Scanner;

public class UsesEmployees {

    public static void main(String[] args) {
        // Read in values
        Scanner kbd = new Scanner(System.in);

        // single employee
        Employee emp1 = new Employee(1234, "Nodla", 35000);
        System.out.println(
                "Single Employee object " + emp1.getSurname() + " earns R " + emp1.
                getSalary());

        System.out.println("---------------------------------------");

        // only Employee
        Employee[] onlyEmployees = new Employee[5];
        onlyEmployees[0] = new Employee(3456, "Allen", 27000);
        onlyEmployees[1] = new Employee(5078, "Prins", 25000);
        onlyEmployees[2] = new Employee(8309, "Davids", 32000);
        System.out.println(
                "Employee in array " + onlyEmployees[1].getSurname() + " earns R" + onlyEmployees[1].
                getSalary());
        System.out.println("---------------------------------------");

        // Array of employees.
        Employee[] employees = new Employee[10];

        employees[0] = new Employee(1830, "Bester", 22000);
        employees[1] = new Employee(3112, "Maraba", 30700);
        employees[2] = new Manager(4065, "Gates", 38750, "Sales", 5000);
        employees[3] = new Employee(7268, "Wengu", 28500);
        int nrEmployees = 4;

        System.out.println("Adding a Manager object to array of Employee...");

        System.out.print("Enter the employee number: ");
        int empNum = kbd.nextInt();

        System.out.print("Enter the employee surname: ");
        String surname = kbd.next();

        System.out.print("Enter the salary: R");
        double salary = kbd.nextDouble();

        System.out.print("Enter the department that the employee manages: ");
        String dept = kbd.next();

        System.out.print("Enter the performance bonus: R");
        double pBonus = kbd.nextDouble();

        System.out.println("---------------------------------------");

        employees[4] = new Manager(empNum, surname, salary, dept, pBonus);
        nrEmployees++;

        System.out.println("List of all in employees array with toString( )");
        System.out.println("---------------------------------------");
        for (int i = 0; i < nrEmployees; i++) {
            System.out.println(employees[i]);
        }
        System.out.println("---------------------------------------");

        System.out.println("List of managers with displayDetails()");
        System.out.println("---------------------------------------");
        for (int i = 0; i < nrEmployees; i++) {
            if (employees[i] instanceof Manager) {
                employees[i].displayDetails();
                System.out.println("---------------------------------------");
            }
        }
        
        // To only display the managers name and bonuses.
        System.out.println("List of manager bonuses");
        System.out.println("---------------------------------------");
        for(int i = 0; i < nrEmployees; i++){
            if(employees[i] instanceof Manager){
                Manager man1 = (Manager) employees[i]; // casting
                System.out.println(man1.getSurname() + " has a bonus of R" + man1.getPerformanceBonus());
            }
        }

    }// end of main

}// end of class
