package Controler;
import java.awt.Graphics;
import Model.Facade;
import View.DrawFacade;

public class Controler {
	private DrawFacade v; 
	private Facade f; 
	public Controler() {
		f= new Facade(this); 
		v= new DrawFacade(this); 
	}
	
	public void handleEvent(String form) {
		switch(form) {
		case "Circle": 
			f.paintCircle(v.getX(), v.getY(), v.getW(), v.getH(), v.getLineSize(), v.getFillColor(), v.getLineColor()); 
			break;
		case "Rectangle": 
			f.paintRectangle(v.getX(), v.getY(), v.getW(), v.getH(), v.getLineSize(), v.getFillColor(), v.getLineColor()); 
			break; 
		case "Line": 
			f.paintLine(v.getX(), v.getY(), v.getW(), v.getH(), v.getLineSize(), v.getFillColor(), v.getLineColor());
			break; 
		}
	}
	
    public void drawShapes(Graphics g) {
        f.draw(g);
    }
    
    public void deleteShape() {
    	f.remove(f.getContainer());
    }
    
    public void save() {
    	f.saveDefaultFile(f.getContainer()); 
    }
    
  public void load() {
	  f.loadDefaultFile();
  }
	
	public static void main(String[] args) {
	    new Controler(); 

		}

}


