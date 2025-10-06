
package companyemployees;


public class Manager extends Employee{
    // constructors
    public Manager(){
    }
    
    public Manager(String name){
        super(name);
    }
    
    @Override
    public int getLeaveDays(){
        // annual leave days
        int leaveDays = 18;
        return leaveDays;
    }
    
    @Override
    public double getSalary(){
        // annual salary
        return super.getSalary() + 20000;
    }
    
    @Override
    public void leaveApplication(){
        System.out.println("Manager applies for leave online and gets CEO approval.");
    }
    
    @Override
    public void work(){
        System.out.println("Manager is managing their department.");
    }
    
}// end of class
