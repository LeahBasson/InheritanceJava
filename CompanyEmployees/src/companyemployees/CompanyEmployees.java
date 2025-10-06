package companyemployees;

public class CompanyEmployees {

    public static void main(String[] args) {
        // declare an array of type Employee with a maximum size of 20
        Employee[] employees = new Employee[20];

        // 10 objects to the array
        employees[0] = new Employee("Leah");
        employees[1] = new Manager("Lynn");
        employees[2] = new Manager("Leslie");
        employees[3] = new Employee("Reece");
        employees[4] = new Employee("Tristan");
        employees[5] = new Secretary("Jamin");
        employees[6] = new Employee("Caitlyn");
        employees[7] = new Secretary("Emily");
        employees[8] = new Manager("James");
        employees[9] = new Manager("Linda");
        employees[10] = new Secretary("Keziah");
        int nrEmployees = 10;

        // Display all the objects
        System.out.println("List of all employees:");
        System.out.println("----------------------------");
        for (int i = 0; i < nrEmployees; i++) {
            System.out.println(employees[i]);
        }
        System.out.println("----------------------------");

        // calculate, and then display the avg salary of all employees.   
        Employee employee = new Employee();
        Manager manager = new Manager();

        double total = 0;
        double employeeSalary;
        double managerSalary;
        double secretarySalary;
        double avg = 0;

        for (int i = 0; i < nrEmployees; i++) {
            employeeSalary = employee.getSalary();
            managerSalary = manager.getSalary();
            secretarySalary = employee.getSalary();

            total = employeeSalary + managerSalary + secretarySalary;
            avg = total / 3;
        }

        System.out.println("Average salary of all employees: R" + Math.round(
                avg * 100.0) / 100.0);
        System.out.println("----------------------------");

        // for each employee calculate how their leave will cost the company.
    }// end of main

}// end of class
