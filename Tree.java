
/**
 * Creates an instance of a Tree.
 *
 * @author J. Peralta
 * @version January 15, 2019
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Triangle leaves0;
    private Triangle leaves1;
    private Triangle leaves2;
    private Square trunk;

    /**
     * Constructor for objects of class Tree
     * 
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public Tree(int x, int y)
    {
        // initialise instance variables
        leaves0 = new Triangle();
        leaves1 = new Triangle();
        leaves2 = new Triangle();
        trunk = new Square();
        // actually draw the tree
        drawTree(x, y);
    }

    /**
     * Draws the tree
     *
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public void drawTree(int x, int y)
    {
        trunk.makeVisible();
        trunk.changeColor("black");
        trunk.moveHorizontal(-25);
        trunk.moveVertical(430);
        trunk.moveHorizontal(x);
        trunk.moveVertical(y);

        leaves0.makeVisible();
        leaves0.changeSize(55, 130);
        leaves0.changeColor("green");
        leaves0.moveHorizontal(0);
        leaves0.moveVertical(415);
        leaves0.moveHorizontal(x);
        leaves0.moveVertical(y);
        
        leaves1.makeVisible();
        leaves1.changeSize(55, 130);
        leaves1.changeColor("green");
        leaves1.moveHorizontal(0);
        leaves1.moveVertical(375);
        leaves1.moveHorizontal(x);
        leaves1.moveVertical(y);
       
        leaves2.makeVisible();
        leaves2.changeSize(55, 130);
        leaves2.changeColor("green");
        leaves2.moveHorizontal(0);
        leaves2.moveVertical(335);
        leaves2.moveHorizontal(x);
        leaves2.moveVertical(y);
    }
    
}