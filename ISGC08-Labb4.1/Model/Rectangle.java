package Model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Rectangle extends ShapeComponent {
	public Rectangle(int x, int y, int xw, int yh, int lineSize, Color fillColor, Color lineColor) {
		super(x, y, xw, yh, lineSize, fillColor, lineColor);
	}

	public void draw(Graphics g) {

		g.setColor(lineColor);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(lineSize));

		if (fillColor != null) {
			g.setColor(fillColor);
			g.fillRect(x, y, xw, yh);
		}

		g.setColor(lineColor);
		g.drawRect(x, y, xw, yh);
	}

}