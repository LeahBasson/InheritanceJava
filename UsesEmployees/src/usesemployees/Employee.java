
package usesemployees;


public class Employee {
    // attributes
    private int empNr;
    private String surname;
    private double salary;
    
    // constructors
    public Employee(){
        empNr= 5555;
        surname= "XXXXX"; 
        salary = 0.01;
    }
    
    public Employee(int empNr, String surname, double salary){
        this.empNr = empNr;
        this.surname = surname;
        this.salary = salary;
    }
    
    // methods
    public void setEmpNr(int empNr){
        this.empNr = empNr;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public int getEmpNr(){
        return this.empNr;
    }
    
    public String getSurname(){
        return this.surname;
    }
    
    public double getSalary(){
        return this.salary;
    }

    @Override
    public String toString() {
        return "Emp#:" + empNr + ", Surname: " + surname + ", Salary: R" + salary;
    }
    
    public void displayDetails(){
        System.out.println("Employee number: " + this.empNr);
        System.out.println("Surname: " + this.surname);
        System.out.println("Salary: " + this.salary);
    }
    
}// end of class
