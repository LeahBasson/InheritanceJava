package usesshapes;

public class UsesShapes {

    public static void main(String[] args) {

        Rectangle rect = new Rectangle(5, 6);
        System.out.println("Rectangle area: " + rect.area());
        
        Box cube = new Box(2,2,2);
        System.out.println("Box area: " + cube.volume());

    }// end of main

}// end of class
