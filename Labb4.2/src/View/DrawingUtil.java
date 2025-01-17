package View;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

import Model.ShapeComponent;

public class DrawingUtil implements DrawUtilInterface {

	@Override
	public void drawCircle(ShapeComponent sc, Graphics g) {
		   g.setColor(sc.getLineColor());
	        Graphics2D g2d = (Graphics2D) g;
	        g2d.setStroke(new BasicStroke(sc.getLineSize()));
	        if (sc.getFillColor() != null) {
	            g.setColor(sc.getFillColor());
	            g.fillOval(sc.getX(), sc.getY(), sc.getXw(), sc.getYh());
	        }

	        g.setColor(sc.getLineColor());
		g.drawOval(sc.getX(), sc.getY(), sc.getXw(), sc.getYh());
		
	}

	@Override
	public void drawRectangle(ShapeComponent sc, Graphics g) {
		   g.setColor(sc.getLineColor());
	        Graphics2D g2d = (Graphics2D) g;
	        g2d.setStroke(new BasicStroke(sc.getLineSize()));

	        if (sc.getFillColor() != null) {
	            g.setColor(sc.getFillColor());
	            g.fillRect(sc.getX(), sc.getY(), sc.getXw(), sc.getYh());
	        }

	        g.setColor(sc.getLineColor());
		g.drawRect(sc.getX(), sc.getY(), sc.getXw(), sc.getYh());
	}

	@Override
	public void drawLine(ShapeComponent sc, Graphics g) {
		 Graphics2D g2d = (Graphics2D) g;
	        g2d.setColor(sc.getLineColor());
	        g2d.setStroke(new BasicStroke(sc.getLineSize()));
		g.drawLine(sc.getX(), sc.getY(), sc.getXw(), sc.getYh());
		
	}

}
