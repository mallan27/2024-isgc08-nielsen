package Model;
import java.awt.*;
import java.io.*;

import Controler.Controler; 

public class Facade {
 
private Composite c;
private Controler controler;

   public Facade(Controler controler) {
       c = new  Container(); 
       this.controler=controler; 
   }

   public void paintCircle(int x, int y, int width, int height, int lineSize, Color lineColor, Color fillColor) {
	   Composite circle = new Circle(x, y, width, height, lineSize, lineColor, fillColor);
       c.add(circle);
   }

   public void paintRectangle(int x, int y, int width, int height, int lineSize, Color lineColor, Color fillColor) {
       Composite rectangle = new Rectangle(x, y, width, height, lineSize, lineColor, fillColor);
       c.add(rectangle);
   }

   public void paintLine(int x1, int y1, int x2, int y2, int lineSize, Color lineColor, Color fillColor) {
	   Composite line = new Line(x1, y1, x2, y2, lineSize, lineColor, null);
       c.add(line);
   }
   
   public Container newContainer() {
	   return new Container(); 
   }
   
   public void add(Composite shape) {
	    c.add(shape);
	}

	public void remove(Composite shape) {
		c.remove(c);
		c= new Container(); 
	}
	
	public void draw(Graphics g) {
		c.draw(g); 
	}
	public Composite getContainer() {
		return c; 
	}

    public void saveToFile(Composite container, String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(container);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

 
    public Composite loadFromFile(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return (Composite) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    

    public void saveDefaultFile(Composite composite) {
        saveToFile(composite, "drawing.dat");
    }

    public void loadDefaultFile() {
    	add(loadFromFile("drawing.dat")); 
    }
}