package Model;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;

public interface Composite extends Serializable {
	
	public void draw(Graphics g); 
	public void add(Composite c); 
	public void remove(Composite c); 
	
	public int getX();
	public int getY(); 
	public int getXw(); 
	public int getYh();
	public int getLineSize();
	public Color getLineColor();
	public Color getFillColor();


}
