import java.awt.Color;
import java.awt.Point;

/**
 * Abstract class representing a triangle
 * 
 * DO NOT CHANGE
 * 
 * @author MoSho
 * @version April 11, 2019
 */
public abstract class Triangle extends Polygon 
{

	/**
	 * Constructor a triangle
	 * 
	 * @param pointLB A point on the base on the triangle
	 * @param color Of the shape
	 * @param filled True if shape is filled when drawn
	 */
	public Triangle(Point pointLB, Color color, boolean filled) 
	{
		super(color, filled);
        
        location = new Point[3];
        
        // Define lower base point
        location[0] = pointLB; // lower base point
	}

}
