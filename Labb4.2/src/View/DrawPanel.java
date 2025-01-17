package View;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JPanel;

import Model.Facade;

public class DrawPanel extends JPanel {
    private Point startPoint; 
    private Point endPoint;
    private DrawFacade df; 

    public DrawPanel(DrawFacade df) {
        this.setBackground(Color.WHITE);
        this.setSize(500, 500);
        this.df=df; 
        
        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                startPoint = e.getPoint();
            }

            public void mouseReleased(MouseEvent e) {
                endPoint = e.getPoint(); 
                df.setPoints(startPoint, endPoint);
                repaint(); 
            }
        });  
    }

    
    public Point getStartPoint() {
    	return startPoint; 
    }
    
    public Point getEndPoint() {
    	return endPoint; 
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        df.drawShapes(g);
    }
    
    public void clear() {
    	df.deleteShape(); 
    	repaint(); 
    }
    
    
    
}