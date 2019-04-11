import java.awt.Color;
import java.awt.Point;

/**
 * This class maintains information for drawing a Circle and extends Oval.
 * 
 * DO NOT CHANGE
 * 
 * @author Monique Shotande
 * @version April 11, 2019
 * Lab 10
 */
public class Circle extends Oval
{

    /**
     * Constructor creating an Oval with equal major and minor radii
     * 
     * @param pointUL Upper left corner of the bounding box
     * @param diameter Diameter of the circle
     * @param color Desired color for the circle
     * @param filled True if the circle should be filled solid
     */
    public Circle(Point pointUL, int diameter, Color color, boolean filled)
    {
        super(pointUL, diameter, diameter, color, filled);
    }

    /**
     * Get the diameter of the circle
     * 
     * @return diameter1 The diameter
     */
    public int getDiameter()
    {
        return getDiameter1();
    }
}
