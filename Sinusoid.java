import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 * FINISH THIS. Follow the TODOs. 
 * 
 * Class to represent and define how a sinusoid is drawn
 * 
 * @author MoSho
 * @author _______________
 * @version April 11, 2019
 */
public class Sinusoid extends Shape 
{
	/** Number of pixels within one cycle relative to the frequency */
	public static final int samplerate = 20;
	
	/** The number of complete periods to draw for the sinusoid */
	private int duration;
	
	/** Frequency of the sinusoid in Hz (number of cycles in one period) */
	private int frequency;
	
	/** Height of the sinusoid */
	private int amplitude;
	
	/**
	 * Creates a sinusoid curve
	 * General formula: y = a * sin(2*PI*freq * t) 
	 * 
	 * Helpful links: 
	 * 		http://hyperphysics.phy-astr.gsu.edu/hbase/Waves/funhar.html
	 * 		https://www.ck12.org/book/CK-12-Precalculus-Concepts/section/5.5/
	 * 
	 * @param color Color for the curve
	 * @param start Position in the image to start the curve
	 * @param length The number of periods to draw for the curve (Notes: 1 period = 2*PI / freq)
	 * @param freq The number of cycles per single period (Notes: freq = 2*PI / period)
	 * @param height The amplitude of the curve
	 */
	public Sinusoid(Color color, Point start, int length, int freq, int height) 
	{
		super(color, false);
		duration = length;
		frequency = freq;
		amplitude = height;
		
		// Set up point computation
		int nPoints = samplerate * frequency; // points per single cycle
		int timeFrame = duration * nPoints;  // total number of points for the duration of the signal
		
		location = new Point[timeFrame];
		location[0] = start;

		// Set the wave offsets for x and y as teh starting point of the sinusoid
		int x0 = location[0].x;
		int y0 = location[0].y; 
		
		// Change in the x position
		int dx = (int) (1. * samplerate / frequency);
		// Angular frequency
		double angFreq = 2 * Math.PI * frequency;
		
		// Compute points
		for (int i = 0; i < timeFrame; i++)
		{
			// position in the time domain of the sinusoid
			double t = 1. * i / nPoints;
			// convert time to radians
			double rad = angFreq * t;
			
			// TODO: calculate next x,y point
			//y = yOffset + amplitude * sin(radians)
			//x = xOffset + i * dx;
			int xNext = ... // TODO:
			int yNext = ... // TODO:
			
			// TODO: create a point and store it into the locations list
		}
	}

	/* (non-Javadoc)
	 * @see Drawable#draw(java.awt.Graphics)
	 * 
	 * The stroke width of the signal is set to 5.
	 * Uses a sequence of line segments to draw a sinusoidal wave
	 */
	@Override
	public void draw(Graphics graphics) 
	{
        // Set the color and stroke
		Graphics2D g2d = (Graphics2D) graphics;
		g2d.setColor(this.getColor());
		g2d.setStroke(new BasicStroke(5));
        
        int nPoints = location.length;
        
        // TODO: Draw a sequence of connected line segments to render a sinusoid

	}

}
