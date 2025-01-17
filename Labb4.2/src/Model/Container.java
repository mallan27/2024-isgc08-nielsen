package Model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Container implements Composite {
	List<Composite> shapes;
	
	public Container () {
		shapes= new ArrayList<Composite>(); 
	}

	@Override
	public void draw(Graphics g) {
		for(Composite c: shapes) {
			c.draw(g);
		}
	}

	@Override
	public void add(Composite c) {
		shapes.add(c); 
	}

	@Override
	public void remove(Composite c) {
		shapes.remove(c); 
	} 
	
	public Composite getContainer (){
		return this; 
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getXw() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getYh() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLineSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Color getLineColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getFillColor() {
		// TODO Auto-generated method stub
		return null;
	}

}