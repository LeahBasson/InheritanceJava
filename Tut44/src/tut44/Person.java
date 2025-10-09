
package tut44;


public class Person {
// attributes
    private String id;
    private String nameSurname;
    private int birthYear;
    
    // constructors
    public Person() {
        id = "677997734";
        nameSurname = "Leah Basson";
        birthYear = 2004;
    }

    public Person(String id, String nameSurname, int birthYear) {
        this.id = id;
        this.nameSurname = nameSurname;
        this.birthYear = birthYear;
    }

    // methods
    public void setId(String id) {
        this.id = id;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getId() {
        return this.id;
    }

    public String getNameSurname() {
        return this.nameSurname;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void displayDetails() {
        System.out.println("ID number: " + this.id);
        System.out.println("Name: " + this.nameSurname);
        System.out.println("Born in: " + this.birthYear);
    }

    @Override
    public String toString() {
        return  "ID=" + id + "--Name=" + nameSurname + "--Born=" + birthYear;
    }
    
}// end of class
