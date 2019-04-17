import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Polygon{
	public Rectangle(Point pointUL, int width, int height, Color color, boolean filled) {
		super(color, filled);
		location = new Point[4]; 
		location[0] = pointUL;
		location[1] = new Point(pointUL.x + width, pointUL.y);
		location[2] = new Point(pointUL.x +width, pointUL.y + height);
		location[3] = new Point(pointUL.x, pointUL.y + height);
	}

}
