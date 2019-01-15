
/**
 * This class draws a house using individual shapes
 *
 * @author Joven Peralta
 * @version January 11, 2019
 */
public class MyHouse
{
    // instance variables - replace the example below with your own
    // ACCESS MODIFIER TYPE NAME
    private Circle sun;
    private Triangle roof;
    private Square base;

    /**
     * Constructor for objects of class MyHouse
     * The job of a constructor is to initialize all the instance variables.
     */
    public MyHouse()
    {
        // initialise instance variables
        sun = new Circle();
        roof = new Triangle();
        base = new Square();
    }

    /**
     * Draw the house
     */
    public void drawCircle()
    {
        // Put the sun in position
        sun.moveHorizontal(175);
        sun.moveVertical(-175);
        sun.changeSize(200);
        sun.changeColor("yellow");
        sun.makeVisible();
        
        // Draw base
        base.moveHorizontal(10);
        base.moveVertical(100);
        base.changeSize(150);
        base.changeColor("red");
        base.makeVisible();
        
        // Draw roof
        roof.moveHorizontal(95);
        roof.moveVertical(40);
        roof.changeSize(100, 175);
        roof.changeColor("blue");
        roof.makeVisible();
        
        // Draw door
        base.changeColor("blue");
    }
}
