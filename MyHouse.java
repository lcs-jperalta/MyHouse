
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
    private Square sky;
    private Square door1;
    private Square door2;
    private Tree tree1;
    private Tree tree2;
    private Tree tree3;
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
        sky = new Square();
        door1 = new Square();
        door2 = new Square();
        
        // actually invoke the method drawHouse
        drawHouse();
        
        tree1 = new Tree(0, 0);
        tree2 = new Tree(300, -50);
        tree3 = new Tree(140, 40);
    }

    /**
     * Draw the house
     */
    public void drawHouse()
    {
        
        // Draw sky
        sky.moveVertical(-800);
        sky.moveHorizontal(-100);
        sky.changeSize(1000);
        sky.changeColor("blue");
        sky.makeVisible();
        
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
        roof.changeColor("yellow");
        roof.makeVisible();
        
        // Draw door
        door1.moveHorizontal(80);
        door1.moveVertical(200);
        door1.changeSize(50);
        door1.changeColor("black");
        door1.makeVisible();
        
        door2.moveHorizontal(80);
        door2.moveVertical(150);
        door2.changeSize(50);
        door2.changeColor("black");
        door2.makeVisible();
    }
}
