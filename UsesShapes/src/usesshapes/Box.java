
package usesshapes;


public class Box extends Rectangle{
    // atributes
    private int height;
    
    //constructor

    public Box(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }
    
    public int getHeight(){
        return this.height;
    }
    
    public int volume(){
        return super.getLength() * super.getWidth()* height;
    }
}// end of class
