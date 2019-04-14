import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.ArrayList;

public class DrawPanel extends JPanel {
	private ArrayList<Shape> shapeList = new ArrayList<Shape>();
	public void addShape(Shape shape) {
		//shapeList = new ArrayList<Shape>();
		shapeList.add(shape);
	}
	protected void paintComponent(Graphics graphics) {
		//draw(graphics);
	}

}
