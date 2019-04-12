import java.awt.Color;
import java.awt.Point;

public class PolyLine extends Polygon {
	public PolyLine(Point pointUL, Point pointUR, int thickness, Color color, boolean filled) {
		super(color, filled);
		location = new Point[] {pointUL, pointUR, new Point(pointUL.x, pointUL.y + thickness),
				new Point(pointUR.x, pointUR.y + thickness)};
	}

}
