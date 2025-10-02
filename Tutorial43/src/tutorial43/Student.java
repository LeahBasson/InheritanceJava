package tutorial43;

public class Student extends Person{
    // attributes

    private long studNr;
    private double balance;

    // constructors
    public Student() {
        studNr = 230146740;
        balance = 6000;
    }

    public Student(String id, String nameSurname, int birthYear, long studNr, double balance) {
        super(id,nameSurname,birthYear);
        this.studNr = studNr;
        this.balance = balance;
    }

    // methods
    public void setStudNr(long studNr) {
        this.studNr = studNr;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getStudNr() {
        return this.studNr;
    }

    public double getBalance() {
        return this.balance;
    }

    public void makePayemnt(double payment) {
        balance -= payment;
    }

    @Override
    public String toString() {
        return super.toString() + "--Student#=" + studNr + "--Balance=" + balance;
    }
    
   
    @Override
    public void displayDetails() {
        System.out.println("ID number: " + super.getId());
        System.out.println("Name: " + super.getNameSurname());
        System.out.println("Born in: " + super.getBirthYear());
        System.out.println("Student number: " + this.studNr);
        System.out.println("Balance: " + this.balance);
    }

}// end of class
