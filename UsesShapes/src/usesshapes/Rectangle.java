
package usesshapes;


public class Rectangle {
    // attributes
    int length;
    private int width;
    
    // constructor
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    
    // methods
    
    public int getLength(){
        return this.length;
    }
    
    public int getWidth(){
        return this.width;
    }
    
    public int area(){
        return length * width;
    }
    
}// end of class
