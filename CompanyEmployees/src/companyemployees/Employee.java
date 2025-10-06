
package companyemployees;


public class Employee {
    // attribute
    private String name;
    
    // constructors
    public Employee(){
    
    }
    
    public Employee(String name){
        this.name = name;
    }

    // methods
    @Override
    public String toString() {
        return "Employee{" + "name: " + name + '}';
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getSalary(){
        // annual salary
        double salary = 45000;
        return salary;
    }
    
    public double getHours(){
        // weekly hours
        double hours = 36.6;
        return hours;
    }
    
    public int getLeaveDays(){
        // annual leave days
        int leaveDays = 15;
        return leaveDays;
    }
    
    public void leaveApplication(){
        System.out.println("Employee applies for leave online.");
    }
    
    public void work(){
        System.out.println("Employee is working.");
    }
    
}// end of class
