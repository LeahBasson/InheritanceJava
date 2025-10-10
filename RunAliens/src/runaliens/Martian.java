
package runaliens;


public class Martian extends Creature{
   private int heads;
    
    public Martian(){
        super();
        this.heads = 1;
    }
    
    public Martian(int eyes, int arms, int legs, int heads){
        super(eyes, arms, legs);
        this.heads = heads;
    }
    
    public int getHeads(){
        return heads;
    }
    
    public void setHeads(int heads){
        this.heads = heads;
    }

    @Override
    public String toString(){
        String marString = super.toString() + "<Heads=" + this.heads + ">";
        return marString;
    }
    
    @Override
    public void speak(){
        System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
    }
    
    @Override
    public void move(){
        System.out.println("I am moving my little Martian legs as fast as I can");
    }    
    
    public int totalAppendages(){
        int total = getArms() + getLegs() + this.heads;
        return total;
    } 
}// end of class
