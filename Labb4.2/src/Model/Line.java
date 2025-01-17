package Model;

import java.awt.*; 

public class Line extends ShapeComponent{
	public Line (int x, int y, int xw, int yh,int lineSize,Color fillColor, Color lineColor) {
		super(x,y,xw,yh,lineSize,fillColor,lineColor); 
	}

	public void draw(Graphics g) {
	dc.drawLine(this, g);
	}
	
}
