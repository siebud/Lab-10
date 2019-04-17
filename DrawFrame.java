import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

public class DrawFrame extends JFrame{
	private static DrawPanel drawPanel;
	public DrawFrame(String title) {
		
		drawPanel = new DrawPanel();
		
		setTitle(title);
		add(drawPanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,700);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new DrawFrame("Picture");
		//head
		drawPanel.addShape(new Oval(new Point(200,50), 180,150,Color.YELLOW, true));
		//body
		drawPanel.addShape(new Oval(new Point(180, 135), 220, 300, Color.YELLOW, true));
		//cheeks
		drawPanel.addShape(new Circle(new Point(225,110), 30,Color.RED, true));
		drawPanel.addShape(new Circle(new Point(325,110), 30,Color.RED, true));
		//mouth
		drawPanel.addShape(new IsoscelesTriangle(new Point(285, 150), -13 ,25,Color.BLACK, true));
		//eyes
		drawPanel.addShape(new Circle(new Point(250,90), 20,Color.BLACK, true));
		drawPanel.addShape(new Circle(new Point(300,90), 20,Color.BLACK, true));
		//mouth
		drawPanel.addShape(new Sinusoid(Color.BLACK, new Point(270,160), 33, 20, 5));
		//arms
		drawPanel.addShape(new Rectangle( new Point(210,200), 40, 100, Color.LIGHT_GRAY, false));
		drawPanel.addShape(new Rectangle( new Point(325,200), 40, 100, Color.LIGHT_GRAY, false));
		//feet
		drawPanel.addShape(new RightTriangle( new Point (250, 440), -50, -40, Color.YELLOW, true));
		drawPanel.addShape(new RightTriangle( new Point (360, 440), -50, -40, Color.YELLOW, true));
		//tail
		drawPanel.addShape(new PolyLine(new Point(390,250), new Point(500,100), 100, Color.YELLOW, true));
		//ears
		drawPanel.addShape(new Oval(new Point(235,0), 30,60, Color.YELLOW, true));
		drawPanel.addShape(new Oval(new Point(300,0), 30,60, Color.YELLOW, true));
		//backpack
		drawPanel.addShape(new Square(new Point(300, 500), 110, Color.DARK_GRAY, true));
		drawPanel.addShape(new Square(new Point(335, 520), 40, Color.LIGHT_GRAY, false));
		drawPanel.addShape(new Rectangle(new Point(310, 500), 10, 110, Color.LIGHT_GRAY, false));
		drawPanel.addShape(new Rectangle(new Point(390, 500), 10, 110, Color.LIGHT_GRAY, false));
		//PokeBall
		drawPanel.addShape(new Circle(new Point(100, 500), 100, Color.BLACK, false));
		drawPanel.addShape(new IsoscelesTriangle(new Point(150, 600), 50, 50, Color.WHITE, true));
		drawPanel.addShape(new IsoscelesTriangle(new Point(150, 500), -50, -50, Color.RED, true));
		drawPanel.addShape(new Rectangle(new Point(100,545), 100, 10, Color.BLACK, true));
		drawPanel.addShape(new Diamond(new Point(140, 550), 20, Color.WHITE, true));
		drawPanel.addShape(new Diamond(new Point(140, 550), 20, Color.BLACK, false));

	}

}
