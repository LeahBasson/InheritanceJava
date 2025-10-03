
package usesemployees;


public class Manager extends Employee{
    private String dept;
    private double performanceBonus;
    
    public Manager(){
        super();
        this.dept = "====";
        this.performanceBonus = 0.01;
    }
    
    public Manager(int empNr, String surname, double salary, String dept, double performanceBonus){
        super(empNr,surname,salary);
        this.dept = dept;
        this.performanceBonus = performanceBonus;
    }
    
    public void setDept(String debt){
        this.dept = dept;
    }
    
    public void setPerformanceBonus(double performanceBonus){
        this.performanceBonus = performanceBonus;
    }
    
    public String getDept(){
        return this.dept;
    }
    
    public double getPerformanceBonus(){
        return this.performanceBonus;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Manager of: " + dept + ", Performance Bonus: R" + performanceBonus;
    }
    
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Manager of: " + this.dept);
        System.out.println("Performance Bonus: " + this.performanceBonus);
        double totalSalary = super.getSalary() + getPerformanceBonus();
        System.out.println("==========================================");
        System.out.println("Total Salary: R" + totalSalary);
    }
        
}// end of class
