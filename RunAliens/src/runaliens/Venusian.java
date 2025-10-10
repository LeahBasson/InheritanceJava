
package runaliens;


public class Venusian extends Creature{
    private boolean fireBreathing;
    
    public Venusian(){
        super();
        this.fireBreathing = false;
    }
    
    public Venusian(int eyes, int arms, int legs, boolean fireBreathing){
        super(eyes, arms, legs);
        this.fireBreathing = fireBreathing;
    }
    
    public boolean getFireBreathing(){
        return this.fireBreathing;
    }
    
    public void setFireBreathing(boolean fireBreathing){
        this.fireBreathing = fireBreathing;
    }
    
    @Override
    public String toString(){
        String venString = super.toString();
        if (this.fireBreathing)
            venString = venString + "<Breathes fire-watch out!>";
        else
            venString = venString + "<Quite safe>";
        return venString;
    }
    
    @Override
    public void speak(){
        System.out.println("vvvvvvvvvvvvvvvvv");
    }
    
    @Override
    public void move(){
        System.out.println("I am gliding towards you.");
    }
}// end of class
