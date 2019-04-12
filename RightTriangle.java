import java.awt.Color;
import java.awt.Point;

public class RightTriangle extends Triangle {
	public RightTriangle (Point pointRA, int base, int height, Color color, boolean fill) {
		super(pointRA, color, fill);
		location[1] = new Point(pointRA.x + base, pointRA.y);
		location[2] = new Point(pointRA.x, pointRA.y + height);
	}

}
