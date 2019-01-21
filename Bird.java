
/**
 * Write a description of class Bird here.
 *
 * @author Joven Peralta
 * @version January 17, 2019
 */
public class Bird
{
    // instance variables - replace the example below with your own
    private Circle wing0;
    private Circle wing1;
    private Circle sky0;
    private Circle sky1;

    /**
     * Constructor for objects of class Bird
     */
    public Bird(int x, int y)
    {
        // initialise instance variables
        wing0 = new Circle();
        wing1 = new Circle();
        sky0 = new Circle();
        sky1 = new Circle();
        
        drawBird(x, y);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void drawBird(int x, int y)
    {
        // put your code here
        wing0.makeVisible();
        wing0.changeColor("black");
        wing0.changeSize(20);
        wing0.moveHorizontal(0);
        wing0.moveVertical(50);
        wing0.moveHorizontal(x);
        wing0.moveVertical(y);
        
        wing1.makeVisible();
        wing1.changeColor("black");
        wing1.changeSize(20);
        wing1.moveHorizontal(18);
        wing1.moveVertical(50);
        wing1.moveHorizontal(x);
        wing1.moveVertical(y);
        
        sky0.makeVisible();
        sky0.changeColor("blue");
        sky0.changeSize(20);
        sky0.moveHorizontal(0);
        sky0.moveVertical(52);
        sky0.moveHorizontal(x);
        sky0.moveVertical(y);
        
        sky1.makeVisible();
        sky1.changeColor("blue");
        sky1.changeSize(20);
        sky1.moveHorizontal(18);
        sky1.moveVertical(52);
        sky1.moveHorizontal(x);
        sky1.moveVertical(y);
    }
}
