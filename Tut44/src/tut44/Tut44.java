
package tut44;


public class Tut44 {

    
    public static void main(String[] args) {
        // (3 for loops, toString for every object)
        // for 3rd loop call miss.
        
        Person[] people = new Person[10];
        
        people[0] = new Person("7859","Martin Brando",1999);
        people[1] = new Person("8144","Natasha Smit",2001);
        people[2] = new Student("7455","Lynn Harrison",1980,789744117,0.0);
        people[3] = new Student("4565","Tristan Thomas",2007,578912047,10500.01);
        people[4] = new Person("7410","Edna Incredible",2000);
        
        int nrPeople = 5;
        
        System.out.println("ALL the people in the array:");
        System.out.println("----------------------------------");
        
        // loop to display all the people.
        for(int i = 0; i < nrPeople; i++){
            System.out.println(people[i]);
        }
        
        System.out.println("----------------------------------");
        System.out.println("List of all the students in the array:");
        System.out.println("----------------------------------");
        
        // loop to display all the students.
        for(int i = 0; i < nrPeople; i++){
            if(people[i] instanceof Student){
                System.out.println(people[i]);
            }
        }
        
        System.out.println("----------------------------------");
        System.out.println("List of all the students that still owe money:");
        System.out.println("----------------------------------");
        
        // loop to display all the students that still owe money.
        for(int i = 0; i < nrPeople; i++){
            if(people[i] instanceof Student){
                Student stud = (Student) people[i]; // casting: allows you to use the methods of Student.
                if(stud.getBalance() > 0){
                    System.out.println(stud.toString());
                }
            }
        }
        
    }// end of main
    
}// end of class
