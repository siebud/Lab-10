import java.awt.Color;
import java.awt.Point;

/**
 * This class maintains information for drawing a Diamond and extends Polygon.
 * 
 * DO NOT CHANGE
 *  
 * @author MoSho edited Dr. Fagg's 2016 code
 * @version April 11, 2019
 * Lab 10
 */
public class Diamond extends Polygon
{

    /**
     * Constructor for Diamond shape
     * 
     * @param leftCorner Point for the left most vertex of the shape
     * @param edgeLength int length of the edges 
     * @param color Color of the shape.
     * @param filled Boolean value determining whether the shape is filled.
     */
    public Diamond(Point leftCorner, int edgeLength, Color color, boolean filled)
    {
        super(color, filled);
        location = new Point[4];
        
        // Compute distance along a single axis
        int delta = (int) (edgeLength / Math.sqrt(2));
        
        // Assemble the 4 points
        location[0] = leftCorner;
        location[1] = new Point(leftCorner.x + delta, leftCorner.y + delta);
        location[2] = new Point(leftCorner.x + 2 * delta, leftCorner.y);
        location[3] = new Point(leftCorner.x + delta, leftCorner.y - delta);
    }
}
