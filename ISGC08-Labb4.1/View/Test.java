package View;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import Model.Facade;

public class Test extends JPanel {

	JFrame frame;
	Facade f;

	public Test() {
		frame = new JFrame("Draw");
		f = new Facade();
		frame.add(this);
		frame.setSize(500, 500);
		frame.setVisible(true);
		drawSave();
		getDrawings();
	}

	public void drawSave() {
		f.paintLine(400, 100, 470, 170, 4, Color.ORANGE, Color.RED);
		f.paintCircle(150, 0, 300, 70, 2, Color.YELLOW, Color.CYAN);
		f.paintRectangle(10, 14, 70, 70, 3, Color.RED, Color.GREEN);
		f.saveDefaultFile(f.getContainer());
	}

	public void getDrawings() {
		f.add(f.loadDefaultFile());
		f.paintCircle(150, 100, 300, 70, 2, Color.BLACK, Color.CYAN);
		f.paintRectangle(200, 140, 190, 45, 7, Color.RED, Color.GREEN);
		repaint();
	}

	public void paintComponent(Graphics g) {
		f.draw(g);
	}

	public static void main(String[] args) {
		new Test();

	}

}
