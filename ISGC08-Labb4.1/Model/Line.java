package Model;

import java.awt.*;

public class Line extends ShapeComponent {
	public Line(int x, int y, int xw, int yh, int lineSize, Color fillColor, Color lineColor) {
		super(x, y, xw, yh, lineSize, fillColor, lineColor);
	}

	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(lineColor);
		g2d.setStroke(new BasicStroke(lineSize));
		g.drawLine(x, y, xw, yh);
	}

}
