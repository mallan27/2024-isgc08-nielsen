package View;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;


public class GUI implements ActionListener{
	
	  private JFrame frame; 
      private DrawPanel drawPanel; 
      private JPanel drawMenu;
      private JButton circle;
      private JButton rectangle; 
      private JButton line; 
      private JMenuBar menu; 
      private JMenu color;
      private JMenuItem red;
      private JMenuItem blue; 
      private JMenuItem pink;
      private JMenuItem yellow; 
      private JMenuItem black;
      private JMenuItem green; 
      private JTextField linesize; 
      private JLabel linelabel;
      private String form; 
      private DrawFacade df; 
      private FillColorListener fl; 
      private Color fillColor; 
      private LineColorListener lc;
      private Color lineColor; 
      private JButton clearButton; 
      
	public GUI(DrawFacade df) {
		frame=new JFrame("Draweri"); 
		frame.addWindowListener((WindowListener) new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                df.save(); 
                System.exit(1);
            }
        });
		drawPanel = new DrawPanel(df);
		drawMenu=new JPanel(); 
		line= new JButton("Line"); 
		circle= new JButton ("Circle"); 
		rectangle= new JButton ("Rectangle"); 
		rectangle.addActionListener(this);
		circle.addActionListener(this);
		line.addActionListener(this);
		drawMenu.add(line); 
		drawMenu.add(circle);
		drawMenu.add(rectangle); 
		fl= new FillColorListener(this); 
		menu= new JMenuBar(); 
		color= new JMenu("Fillcolor"); 
		red= new JMenuItem("Red"); 
		blue= new JMenuItem("Blue"); 
		pink= new JMenuItem("Pink"); 
		yellow= new JMenuItem("Yellow"); 
		green= new JMenuItem("Green"); 
		black= new JMenuItem("Black");
		pink.addActionListener(fl);
		yellow.addActionListener(fl); 
		green.addActionListener(fl);
		black.addActionListener(fl);
		red.addActionListener(fl);
		blue.addActionListener(fl);
		color.add(red); 
		color.add(blue); 
		color.add(pink); 
		color.add(yellow); 
		color.add(black); 
		color.add(green); 
		menu.add(color); 
		color= new JMenu("LineColor"); 
		lc= new LineColorListener(this); 
		red= new JMenuItem("Red"); 
		blue= new JMenuItem("Blue"); 
		pink= new JMenuItem("Pink"); 
		yellow= new JMenuItem("Yellow"); 
		green= new JMenuItem("Green"); 
		black= new JMenuItem("Black");
		pink.addActionListener(lc);
		yellow.addActionListener(lc); 
		green.addActionListener(lc);
		black.addActionListener(lc);
		red.addActionListener(lc);
		blue.addActionListener(lc);
		color.add(red); 
		color.add(blue); 
		color.add(pink); 
		color.add(yellow); 
		color.add(black); 
		color.add(green); 
		menu.add(color); 
		linelabel= new JLabel("Line size: "); 
		linesize= new JTextField("1", 2); 
		menu.add(linelabel); 
		menu.add(linesize); 
		drawMenu.add(menu); 
		frame.add(drawMenu, BorderLayout.NORTH); 
		frame.add(drawPanel, BorderLayout.CENTER);
		frame.setSize(800,600); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		clearButton = new JButton("Clear");
		clearButton.addActionListener(this);
        frame.add(clearButton, BorderLayout.SOUTH); 
        form="Rectangle"; 
        
	}
	
	
	public String getForm() {
		return form;
	}
	
	public Point getStartPoint() {
		return drawPanel.getStartPoint(); 
	}
	
	public Point getEndPoint() {
		return drawPanel.getEndPoint(); 
	}

	public Color getFillColor() {
		return fillColor; 
	}

	public void setFillColor(Color col) {
		fillColor=col; 
		
	}
	
	public Color getLineColor() {
		return lineColor; 
	}

	public void setLineColor(Color col) {
		lineColor=col; 
		
	}
	
	public String getLineSize() {
		return linesize.getText(); 
	}
	

	
	@Override
	public void actionPerformed(ActionEvent e) {
	if (e.getActionCommand().equals("Rectangle")) {
			form="Rectangle"; 
		} else if (e.getActionCommand().equals("Circle")) {
			form="Circle"; 
		} else 	if (e.getActionCommand().equals("Line")) {
			form="Line"; 
		}else 	if (e.getActionCommand().equals("Clear")) {
			drawPanel.clear();
		}
		
	}

}