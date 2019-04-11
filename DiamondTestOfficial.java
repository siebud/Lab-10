import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Diamond
 * 
 * DO NOT CHANGE
 * 
 * @author Monique Shotande
 * @version April 11, 2019
 * Lab 10
 */
public class DiamondTestOfficial
{
    // Setup
    private static Diamond d1 = new Diamond(new Point(100, 100), 50, Color.BLACK, true);
    private static int delta1 = (int) (50 / Math.sqrt(2));
    private static Point left1 = new Point(100, 100);
    private static Point upper1 = new Point((100 + delta1), (100 - delta1));
    private static Point lower1 = new Point((100 + delta1), (100 + delta1));
    private static Point right1 = new Point((100 + 2 * delta1), 100);
    private static Diamond d2 = new Diamond(new Point(100, 100), 100, Color.CYAN, false);
    private static int delta2 = (int) (100 / Math.sqrt(2));
    private static Point left2 = new Point(100, 100);
    private static Point upper2 = new Point((100 + delta2), (100 - delta2));
    private static Point lower2 = new Point((100 + delta2), (100 + delta2));
    private static Point right2 = new Point((100 + 2 * delta2), 100);

    /**
     * Verify the points defining the diamond are determined correctly
     * The vertex locations, edge length, color, and fill flag
     */
    @Test
    public void testDiamondConstructorComputedPoints()
    {
        Point[] pts1 = d1.getLocation();
        Assert.assertEquals(4, pts1.length);
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, left1));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, lower1, 1));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, right1));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, upper1, 1));
        
        Point[] pts2 = d2.getLocation();
        Assert.assertEquals(4, pts2.length);
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, left2));
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, lower2, 1));
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, right2));
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, upper2, 1));
    }
    
    /**
     * Verify the diamond is appropriately filled or not
     */
    @Test
    public void testDiamondConstructorFilled()
    {
        Assert.assertTrue(d1.isFilled());
        Assert.assertFalse(d2.isFilled());
    }
    
    /**
     * Verify the diamond has been alloted the appropriate color
     */
    @Test
    public void testDiamondConstructorColor()
    {
        Color clr1 = d1.getColor();
        Color clr2 = d2.getColor();
        Assert.assertEquals(Color.BLACK, clr1);
        Assert.assertEquals(Color.CYAN, clr2);
    }

}
