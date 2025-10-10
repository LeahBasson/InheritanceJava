
package runaliens;


public class Creature {
    private int eyes;
    private int arms;
    private int legs;
    
    public Creature(){
        this.eyes = 2;
        this.arms = 2;
        this.legs = 2;
    }
    
    public Creature(int eyes, int arms, int legs){
        this.eyes = eyes;
        this.arms = arms;
        this.legs = legs;
    }
    
    public int getEyes(){
        return this.eyes;
    }
    
    public void setEyes(int eyes){
        this.eyes = eyes;
    }
    
    public int getArms(){
        return this.arms;
    }
    
    public void setArms(int arms){
        this.arms = arms;
    }

    public int getLegs(){
        return this.legs;
    }
    
    public void setLegs(int legs){
        this.legs = legs;
    }

    @Override
    public String toString(){
       String crString = "<Eyes=" + this.eyes + "><Arms=" + this.arms + "><Legs=" + this.legs + ">";
       return crString;
    }    

    public void speak(){
        System.out.println("I don't know what language to speak");
    }
    
    public void move(){
        System.out.println("Do I have legs to move?");
    }     
}// end of class
