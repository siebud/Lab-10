import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;

public class Shape implements Drawable{
	private Point[] location;
	private Color color;
	private boolean filled;
	
	public Shape(Color color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public Color getColor() {
		return color;
	}
	
	public boolean isfilled() {
		return filled;
	}
	
	public Point[] getLocation() {
		return location;
	}
}
