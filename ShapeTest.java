import java.awt.Color;
import java.awt.Point;

import org.junit.Test;

import junit.framework.Assert;

public class ShapeTest {

	@Test
	public void ShapeTest() {
		Shape s1 = new Circle(new Point(100,100), 25,Color.GREEN, false);
		Assert.assertEquals("Wrong color", Color.GREEN, s1.getColor());
		Assert.assertFalse("Wrong fill", s1.isFilled());
		Assert.assertEquals("Location", new Point[] { new Point(100,100)}.length, s1.getLocation().length);
	}
}
