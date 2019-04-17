import java.awt.Color;
import java.awt.Point;

public class IsoscelesTriangle extends Triangle{
	public IsoscelesTriangle(Point pointLB, int base, int height, Color color, boolean fill) {
		super(pointLB, color, fill);
		location[1] = new Point(pointLB.x - base, pointLB.y - height);
		location[2] = new Point(pointLB.x + base, pointLB.y - height);
	}

}
