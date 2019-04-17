import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public abstract class Polygon extends Shape{
	public Polygon(Color color, boolean filled) {
		super(color, filled);
	}
	public void draw(Graphics graphics) {
		Graphics2D g2d = (Graphics2D) graphics;
		g2d.setColor(this.getColor());
		int nPoints = location.length;
		for(int i = 0; i < nPoints - 1; i++) {
			g2d.drawLine(location[i].x, location[i].y, location[i+1].x,  location[i+1].y);
		}
	}
}
