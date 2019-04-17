import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Oval and the Circle
 * 
 * @author Siebud
 * @version April 16, 2019
 * Lab 10
 */
public class RectangleTest
{
    private Rectangle r1 = new Rectangle(new Point(100,100), 50, 60, Color.GREEN, false);
    private Rectangle r2 = new Rectangle(new Point(200,100), 50, 100, Color.DARK_GRAY, true);
    
    private Square s1 = new Square(new Point(100,400), 50, Color.GREEN, false);
    private Square s2 = new Square(new Point(300,400), 40, Color.MAGENTA, true);
    /**
     * Verify the affects of the constructor for the Oval and Circle
     * The location, the diameter(s), the color, and the filled flag
     */
    @Test
    public void testOvalConstructorPoint()
    {
        // Verify the quantity of points for each shape
        Assert.assertEquals("Quantity of points defining the Rectangle is wrong", 4, r1.getLocation().length);
        Assert.assertEquals("Quantity of points defining the Rectangle is wrong", 4, r2.getLocation().length);
        Assert.assertEquals("Quantity of points defining the Square is wrong", 4, s1.getLocation().length);
        Assert.assertEquals("Quantity of points defining the Square is wrong", 4, s2.getLocation().length);

        // Verify the location for each shape
        Assert.assertEquals("Incorrect location for the Rectangle", new Point(100, 100), r1.getLocation()[0]);
        Assert.assertEquals("Incorrect location for the Rectangle", new Point(200, 100), r2.getLocation()[0]);
        Assert.assertEquals("Incorrect location for the Square", new Point(100, 400), s1.getLocation()[0]);
        Assert.assertEquals("Incorrect location for the Square", new Point(300, 400), s2.getLocation()[0]);

        // Verify the colors for each shape
        Assert.assertEquals("Incorrect color for the Rectangle", Color.GREEN, r1.getColor());
        Assert.assertEquals("Incorrect color for the Rectangle", Color.DARK_GRAY, r2.getColor());
        Assert.assertEquals("Incorrect color for the Square", Color.GREEN, s1.getColor());
        Assert.assertEquals("Incorrect color for the Square", Color.MAGENTA, s2.getColor());
        
        // Verify the appropriate filled flag for each shape
        Assert.assertFalse("Incorrect flag for filled for the Recatangle", r1.isFilled());
        Assert.assertTrue("Incorrect flag for filled for the Rectangle", r2.isFilled());
        Assert.assertFalse("Incorrect flag for filled for the Square", s1.isFilled());
        Assert.assertTrue("Incorrect flag for filled for the Square", s2.isFilled());


        
    }
}
