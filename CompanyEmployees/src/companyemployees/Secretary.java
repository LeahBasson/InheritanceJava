
package companyemployees;


public class Secretary extends Employee{
    public Secretary(){
    
    }
    
    public Secretary(String name){
        super(name);
    }
    
    @Override
    public double getHours(){
        // weekly hours
        double hours = 40;
        return hours;
    }
    
    @Override
    public void work(){
            System.out.println("Secretary is typing, filig, and taking messages.");
    }
    
}// end of class
