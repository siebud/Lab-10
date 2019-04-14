import javax.swing.JFrame;

public class DrawFrame extends JFrame{
	private static DrawPanel drawPanel;
	public DrawFrame(String title) {	
		drawPanel = new DrawPanel();
		setTitle("title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(100,100);
		setLocationRelativeTo(null);
		add(drawPanel);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new DrawFrame(null);
	}

}
