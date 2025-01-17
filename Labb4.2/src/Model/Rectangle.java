package Model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Rectangle extends ShapeComponent{
	public Rectangle (int x, int y, int xw, int yh,int lineSize,Color fillColor, Color lineColor) {
		super(x,y,xw,yh,lineSize,fillColor,lineColor); 
	}

	public void draw(Graphics g) {
	dc.drawRectangle(this, g);		
	}
	
}