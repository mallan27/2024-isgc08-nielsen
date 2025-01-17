package View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import Controler.Controler;

public class DrawFacade {
	private GUI t; 
	private Controler c; 
	private int x,y,w,h; 
	public DrawFacade(Controler c) {
		this.c= c;   
		load(); 
		t= new GUI(this); 
		
	}
	
	public Point getStartPoint() {
		return t.getStartPoint(); 
	}
	
	public Point getEndPoint() {
		return t.getEndPoint(); 
	}
	
	public String getForm() {
		return t.getForm(); 
	}
	
	   public void setPoints(Point startPoint, Point endPoint) {
	        if (startPoint != null && endPoint != null) {
	            x = Math.min(getStartPoint().x, getEndPoint().x);
	            y = Math.min(getStartPoint().y, getEndPoint().y);
	            w = Math.abs(getStartPoint().x - getEndPoint().x);
	            h = Math.abs(getStartPoint().y - getEndPoint().y);
	            c.handleEvent(getForm());
	        }
	    }
	   
	   public int getX() {
		   return x;
	   }
	   
	   public int getY() {
		   return y;
	   }
	   
	   public int getW() {
		   return w; 
	   }
	   
	   public int getH() {
		   return h; 
	   }
	   
	   public Color getFillColor() {
		   return t.getFillColor(); 
	   }
	   
	   public Color getLineColor() {
		   return t.getLineColor(); 
	   }
	   
	   public int getLineSize() {
		   return Integer.parseInt(t.getLineSize()); 
	   }
	   
	   public void drawShapes(Graphics g) {
	        c.drawShapes(g);
	    }
	   
	  public void deleteShape() {
		   c.deleteShape(); 
	   }
	   
	   public void save() {
		   c.save(); 
	   }
	   
	   public void load() {
		   c.load(); 

	   }
	  


}
