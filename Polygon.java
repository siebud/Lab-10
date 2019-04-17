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
		int[] xs = new int[nPoints];
		int[] ys = new int[nPoints];
		
		for(int i = 0; i < nPoints; i++) {
			xs[i] = location[i].x;
			ys[i] = location[i].y;
		}
		if(isFilled()) {
			g2d.fillPolygon(xs, ys, nPoints);
		}
		else
			g2d.drawPolygon(xs, ys, nPoints);
	}
}
