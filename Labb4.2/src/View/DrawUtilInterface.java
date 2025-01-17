package View;
import java.awt.Graphics;
import java.io.Serializable;
import Model.ShapeComponent;

public interface DrawUtilInterface extends Serializable{

	
public void drawCircle(ShapeComponent sc, Graphics g); 
public void drawRectangle(ShapeComponent sc, Graphics g);
public void drawLine (ShapeComponent sc, Graphics g); 
}