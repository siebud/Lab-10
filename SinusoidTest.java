import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * DO NOT CHANGE
 * 
 * Tests for the Sinusoid
 * 
 * @author MoSho
 * @version April 11, 2019
 */
public class SinusoidTest 
{
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
