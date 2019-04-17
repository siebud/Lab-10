import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;


public class TestMaster 
{

		//Rectangle
		private Rectangle r1 = new Rectangle(new Point(100,100), 50, 60, Color.GREEN, false);
	    private Rectangle r2 = new Rectangle(new Point(200,100), 50, 100, Color.DARK_GRAY, true);
	    
	    private Square tr1 = new Square(new Point(100,400), 50, Color.GREEN, false);
	    private Square tr2 = new Square(new Point(300,400), 40, Color.MAGENTA, true);
	    /**
	     * Verify the affects of the constructor for the Oval and Circle
	     * The location, the diameter(s), the color, and the filled flag
	     */
	    @Test
	    public void testRectangleConstructorPoint()
	    {
	        // Verify the quantity of points for each shape
	        Assert.assertEquals("Quantity of points defining the Rectangle is wrong", 4, r1.getLocation().length);
	        Assert.assertEquals("Quantity of points defining the Rectangle is wrong", 4, r2.getLocation().length);
	        Assert.assertEquals("Quantity of points defining the Square is wrong", 4, tr1.getLocation().length);
	        Assert.assertEquals("Quantity of points defining the Square is wrong", 4, tr2.getLocation().length);

	        // Verify the location for each shape
	        Assert.assertEquals("Incorrect location for the Rectangle", new Point(100, 100), r1.getLocation()[0]);
	        Assert.assertEquals("Incorrect location for the Rectangle", new Point(200, 100), r2.getLocation()[0]);
	        Assert.assertEquals("Incorrect location for the Square", new Point(100, 400), tr1.getLocation()[0]);
	        Assert.assertEquals("Incorrect location for the Square", new Point(300, 400), tr2.getLocation()[0]);

	        // Verify the colors for each shape
	        Assert.assertEquals("Incorrect color for the Rectangle", Color.GREEN, r1.getColor());
	        Assert.assertEquals("Incorrect color for the Rectangle", Color.DARK_GRAY, r2.getColor());
	        Assert.assertEquals("Incorrect color for the Square", Color.GREEN, tr1.getColor());
	        Assert.assertEquals("Incorrect color for the Square", Color.MAGENTA, tr2.getColor());
	        
	        // Verify the appropriate filled flag for each shape
	        Assert.assertFalse("Incorrect flag for filled for the Recatangle", r1.isFilled());
	        Assert.assertTrue("Incorrect flag for filled for the Rectangle", r2.isFilled());
	        Assert.assertFalse("Incorrect flag for filled for the Square", tr1.isFilled());
	        Assert.assertTrue("Incorrect flag for filled for the Square", tr2.isFilled());
	    }

	       
	
	//Triangle
	@Test
	public void TriangleTest() {
		Triangle i1 = new IsoscelesTriangle(new Point(100,100), 10, 20, Color.BLUE, true);
		Triangle i2 = new IsoscelesTriangle(new Point(100,200), 30, 50, Color.GREEN, false);
		Triangle r1 = new RightTriangle(new Point(200,100), 30, 30, Color.GRAY, true);
		Triangle r2 = new RightTriangle(new Point(200,200), 55, 73, Color.BLACK, false);
		
		Assert.assertEquals("Wrong color", Color.BLUE, i1.getColor());
		Assert.assertTrue("Wrong fill", i1.isFilled());
		Assert.assertEquals("Location", 3, i1.getLocation().length);
		
		Assert.assertEquals("Wrong color", Color.GREEN, i2.getColor());
		Assert.assertFalse("Wrong fill", i2.isFilled());
		Assert.assertEquals("Location", 3, i2.getLocation().length);
	
		Assert.assertEquals("Wrong color", Color.GRAY, r1.getColor());
		Assert.assertTrue("Wrong fill", r1.isFilled());
		Assert.assertEquals("Location", 3, r1.getLocation().length);
		
		Assert.assertEquals("Wrong color", Color.BLACK, r2.getColor());
		Assert.assertFalse("Wrong fill", r2.isFilled());
		Assert.assertEquals("Location", 3, r2.getLocation().length);
	}
	
	//Shape
	@Test
	public void ShapeTest() {
		Shape s1 = new Circle(new Point(100,100), 25,Color.GREEN, false);
		Assert.assertEquals("Wrong color", Color.GREEN, s1.getColor());
		Assert.assertFalse("Wrong fill", s1.isFilled());
		Assert.assertEquals("Location", new Point[] { new Point(100,100)}.length, s1.getLocation().length);
	}
	
	
	//PolyLine
	 private static PolyLine pl1 = new PolyLine(new Point(100, 100), new Point(150, 150), 50, Color.BLACK, true);
	    private static Point pl1UL = new Point(100, 100);
	    private static Point pl1LL = new Point(100, 150);
	    private static Point pl1UR = new Point(150, 150);
	    private static Point pl1LR = new Point(150, 200);
	    private static PolyLine pl2 = new PolyLine(new Point(50, 70), new Point(100, 100), -25, Color.CYAN, false);
	    private static Point pl2UL = new Point(50, 70);
	    private static Point pl2LL = new Point(50, 45); 
	    private static Point pl2UR = new Point(100, 100);
	    private static Point pl2LR = new Point(100, 75);

	    /**
	     * plectangle construction
	     */
	    @Test
	    public void testPolyLineConstructorPointsArrayLength()
	    {
	        Point[] pts = pl1.getLocation();
	        Assert.assertEquals(4, pts.length);
	    }
	    
	    /**
	     * plectangle construction: points
	     */
	    @Test
	    public void testPolyLineConstructorCalculatedPoints()
	    {
	        Point[] pts1 = pl1.getLocation();
	        Assert.assertTrue("Expected point not appearing in PolyLine. Make sure that the points determine the base line "
	                + "and that the thickness determines the parallel line (ad to y).",
	                ShapeUtils.pointInSet(pts1, pl1UL));
	        Assert.assertTrue("Expected point not appearing in PolyLine. Make sure that the points determine the base line "
	                + "and that the thickness determines the parallel line (ad to y).",
	                ShapeUtils.pointInSet(pts1, pl1LL));
	        Assert.assertTrue("Expected point not appearing in PolyLine. Make sure that the points determine the base line "
	                + "and that the thickness determines the parallel line (ad to y).",
	                ShapeUtils.pointInSet(pts1, pl1LR));
	        Assert.assertTrue("Expected point not appearing in PolyLine. Make sure that the points determine the base line "
	                + "and that the thickness determines the parallel line (ad to y).",
	                ShapeUtils.pointInSet(pts1, pl1UR));
	        
	        Point[] pts2 = pl2.getLocation();
	        Assert.assertTrue("Expected point not appearing in PolyLine. Make sure that the points determine the base line "
	                + "and that the thickness determines the parallel line (ad to y).",
	                ShapeUtils.pointInSet(pts2, pl2UL));
	        Assert.assertTrue("Expected point not appearing in PolyLine. Make sure that the points determine the base line "
	                + "and that the thickness determines the parallel line (ad to y).",
	                ShapeUtils.pointInSet(pts2, pl2LL));
	        Assert.assertTrue("Expected point not appearing in PolyLine. Make sure that the points determine the base line "
	                + "and that the thickness determines the parallel line (ad to y).",
	                ShapeUtils.pointInSet(pts2, pl2LR));
	        Assert.assertTrue("Expected point not appearing in PolyLine. Make sure that the points determine the base line "
	                + "and that the thickness determines the parallel line (ad to y).",
	                ShapeUtils.pointInSet(pts2, pl2UR));
	    }
	    
	    /**
	     * Unfilled constructor
	     */
	    @Test
	    public void testPolyLineConstructorUnfilled()
	    {
	        Assert.assertFalse("PolyLine fill incorrect.", pl2.isFilled());
	    }
	    
	    /**
	     * Filled constructor
	     */
	    @Test
	    public void testPolyLineConstructorFilled()
	    {
	        Assert.assertTrue("PolyLine fill incorrect.", pl1.isFilled());
	    }
	    
	    /**
	     * Color constructor
	     */
	    @Test
	    public void testPolyLineConstructorColor()
	    {
	        Color clr1 = pl1.getColor();
	        Color clr2 = pl2.getColor();
	        Assert.assertEquals("PolyLine color incorrect.", Color.BLACK, clr1);
	        Assert.assertEquals("PolyLine color incorrect.", Color.CYAN, clr2);
	    }
	
	//Rectangle
	 private Oval o1 = new Oval(new Point(100, 100), 50, 100, Color.BLACK, true);
	    private Oval o2 = new Oval(new Point(100, 100), 75, 50, Color.CYAN, false);
	    
	    private Circle c1 = new Circle(new Point(200, 300), 60, Color.BLUE, true);
	    private Circle c2 = new Circle(new Point(200, 300), 75, Color.RED, false);

	    /**
	     * Verify the affects of the constructor for the Oval and Circle
	     * The location, the diameter(s), the color, and the filled flag
	     */
	    @Test
	    public void testOvalConstructorPoint()
	    {
	        // Verify the quantity of points for each shape
	        Assert.assertEquals("Quantity of points defining the Oval is more than 1", 1, o1.getLocation().length);
	        Assert.assertEquals("Quantity of points defining the Oval is more than 1", 1, o2.getLocation().length);
	        Assert.assertEquals("Quantity of points defining the Circle is more than 1", 1, c1.getLocation().length);
	        Assert.assertEquals("Quantity of points defining the Circle is more than 1", 1, c2.getLocation().length);

	        // Verify the location for each shape
	        Assert.assertEquals("Incorrect location for the Oval", new Point(100, 100), o1.getLocation()[0]);
	        Assert.assertEquals("Incorrect location for the Oval", new Point(100, 100), o2.getLocation()[0]);
	        Assert.assertEquals("Incorrect location for the Circle", new Point(200, 300), c1.getLocation()[0]);
	        Assert.assertEquals("Incorrect location for the Circle", new Point(200, 300), c2.getLocation()[0]);

	        // Verify the colors for each shape
	        Assert.assertEquals("Incorrect color for the Oval", Color.BLACK, o1.getColor());
	        Assert.assertEquals("Incorrect color for the Oval", Color.CYAN, o2.getColor());
	        Assert.assertEquals("Incorrect color for the Circle", Color.BLUE, c1.getColor());
	        Assert.assertEquals("Incorrect color for the Circle", Color.RED, c2.getColor());
	        
	        // Verify the appropriate filled flag for each shape
	        Assert.assertTrue("Incorrect flag for filled for the Oval", o1.isFilled());
	        Assert.assertFalse("Incorrect flag for filled for the Oval", o2.isFilled());
	        Assert.assertTrue("Incorrect flag for filled for the Circle", c1.isFilled());
	        Assert.assertFalse("Incorrect flag for filled for the Circle", c2.isFilled());
	        
	        // Verify the diameter(s) are correctly set
	        Assert.assertEquals("Incorrect diameter1 for the Oval", 50, o1.getDiameter1());
	        Assert.assertEquals("Incorrect diameter2 for the Oval", 100, o1.getDiameter2());
	        Assert.assertEquals("Incorrect diameter1 for the Circle", 75, o2.getDiameter1());
	        Assert.assertEquals("Incorrect diameter2 for the Circle", 50, o2.getDiameter2());

	        Assert.assertEquals("Incorrect diameter for the Cirlce", 60, c1.getDiameter());
	        Assert.assertEquals("Incorrect diameter1 for the Circle", 60, c1.getDiameter1());
	        Assert.assertEquals("Incorrect diameter2 for the Circle", 60, c1.getDiameter2());
	        
	        Assert.assertEquals("Incorrect diameter for the Circle", 75, c2.getDiameter());
	        Assert.assertEquals("Incorrect diameter1 for the Circle", 75, c2.getDiameter1());
	        Assert.assertEquals("Incorrect diameter2 for the Circle", 75, c2.getDiameter2());
	    }
		//Diamond
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

	
	//Sinusoid
    Sinusoid s0 = new Sinusoid(Color.MAGENTA, new Point(5, 400), 2, 1, 40);
    Sinusoid s1 = new Sinusoid(Color.ORANGE, new Point(5, 400), 1, 1, 30);
    Sinusoid s2 = new Sinusoid(Color.GREEN, new Point(5, 400), 1, 2, 20);
    Sinusoid s3 = new Sinusoid(Color.RED, new Point(5, 520), 2, 4, 10);

	/**
	 * Test method for {@link Sinusoid#Sinusoid(java.awt.Color, java.awt.Point, int, int, int)}.
	 */
	@Test
	public void testSinusoid() 
	{
		Assert.assertNotNull("Sinusoid was null", s0);
		Assert.assertNotNull("Sinusoid was null", s1);
		Assert.assertNotNull("Sinusoid was null", s2);
		Assert.assertNotNull("Sinusoid was null", s3);
	}

	/**
	 * Test method for {@link Shape#getColor()}.
	 */
	@Test
	public void testGetColor() 
	{
		Assert.assertEquals("Sinusoid color incorrect", Color.MAGENTA, s0.getColor());
		Assert.assertEquals("Sinusoid color incorrect", Color.ORANGE, s1.getColor());
		Assert.assertEquals("Sinusoid color incorrect", Color.GREEN, s2.getColor());
		Assert.assertEquals("Sinusoid color incorrect", Color.RED, s3.getColor());
	}

	/**
	 * Test method for {@link Shape#isFilled()}.
	 */
	@Test
	public void testIsFilled() 
	{
		Assert.assertFalse("Sinusoid fill incorrect", s0.isFilled());
		Assert.assertFalse("Sinusoid fill incorrect", s1.isFilled());
		Assert.assertFalse("Sinusoid fill incorrect", s2.isFilled());
		Assert.assertFalse("Sinusoid fill incorrect", s3.isFilled());
	}

	/**
	 * Test method for {@link Shape#getLocation()}.
	 */
	@Test
	public void testGetLocation() 
	{
        Assert.assertTrue(checkPoints(s0, 5, 400, 2, 1, 40));
        Assert.assertTrue(checkPoints(s1, 5, 400, 1, 1, 30));
        Assert.assertTrue(checkPoints(s2, 5, 400, 1, 2, 20));
        Assert.assertTrue(checkPoints(s3, 5, 520, 2, 4, 10));
        Assert.assertFalse(checkPoints(s3, 4, 520, 2, 4, 10));
	}
	
	/**
	 * Helper method to check points on a sinusoid
	 * @param sin The sin wave
	 * @param x0 start x point of sin wave
	 * @param y0 start y point of sin wave
	 * @param len Number of periods for the duration of the signal
	 * @param frq Freq of the signal (cycles per period)
	 * @param amp Height of the signal
	 * @return true if all the correct points are within the signal
	 */
	public boolean checkPoints(Sinusoid sin, int x0, int y0, int len, int frq, int amp)
	{
		boolean res = true;
		int sf = Sinusoid.samplerate;
		
		Point[] pts = sin.getLocation();
		int npts = pts.length;
		if (npts != sf * frq * len) return false;
		
		if (!ShapeUtils.pointInSet(pts, new Point(x0,y0))) return false; 
		
		
		int dx = (int) (1. * sf / frq);
		double angFreq = 2 * Math.PI * frq;
		int samplePrdLen = sf * frq;
		for (int i = 0; i < pts.length; i++)
		{
			double t = 1. * i / samplePrdLen;
			double rad = angFreq * t;
			
			int y1 = y0 + (int) (amp * Math.sin(rad));
			int x1 = x0 + i * dx;

			res = res && ShapeUtils.pointInSet(pts, new Point(x1, y1));
		}
		
		return res;
	}

}
