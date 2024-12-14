package Model;

import java.awt.*;

public class ShapeComponent implements Composite {
	int x, y, xw, yh, lineSize;
	Color lineColor, fillColor;

	public ShapeComponent(int x, int y, int xw, int yh, int lineSize, Color fillColor, Color lineColor) {
		this.x = x;
		this.y = y;
		this.xw = xw;
		this.yh = yh;
		this.lineColor = lineColor;
		this.fillColor = fillColor;
		this.lineSize = lineSize;
	}

	public void draw(Graphics g) {
	}

	public void add(Composite c) {
	}

	public void remove(Composite c) {
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getXw() {
		return xw;
	}

	public void setXw(int xw) {
		this.xw = xw;
	}

	public int getYh() {
		return yh;
	}

	public void setYh(int yh) {
		this.yh = yh;
	}

	public int getLineSize() {
		return lineSize;
	}

	public void setLineSize(int lineSize) {
		this.lineSize = lineSize;
	}

	public Color getLineColor() {
		return lineColor;
	}

	public void setLineColor(Color lineColor) {
		this.lineColor = lineColor;
	}

	public Color getFillColor() {
		return fillColor;
	}

	public void setFillColor(Color fillColor) {
		this.fillColor = fillColor;
	}

}
