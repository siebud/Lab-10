import java.awt.Color;

import org.junit.Test;

import junit.framework.Assert;

public class ShapeTest {

	@Test
	public void ShapeTest() {
		Shape s1 = new Shape(Color.GREEN, false);
		Assert.assertEquals("Wrong color", Color.GREEN, s1.getColor());
		Assert.assertFalse("Wrong fill", s1.isfilled());
		Assert.assertEquals("Location",  null, s1.getLocation());
	}
}
