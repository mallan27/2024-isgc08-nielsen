package Model;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends ShapeComponent {
	public Circle(int x, int y, int xw, int yh, int lineSize, Color fillColor, Color lineColor) {
		super(x, y, xw, yh, lineSize, fillColor, lineColor);
	}

	public void draw(Graphics g) {
		dc.drawCircle(this, g);
	}

}
