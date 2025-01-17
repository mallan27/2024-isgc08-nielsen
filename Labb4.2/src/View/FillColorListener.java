package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FillColorListener implements ActionListener {
	GUI t; 
	public FillColorListener(GUI t) {
		this.t= t; 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String color= e.getActionCommand(); 
		switch(color) {
		case "Red":
			t.setFillColor(Color.RED); 
			break;
		case "Blue": 
			t.setFillColor(Color.BLUE);
			break;
		case "Yellow": 
			t.setFillColor(Color.YELLOW);
			break;
		case "Pink": 
			t.setFillColor(Color.PINK);
			break;
		case "Black": 
			t.setFillColor(Color.BLACK);
			break;
		case "Green": 
			t.setFillColor(Color.GREEN);
			break;
		default: 
			break; 
		}
		
	}

}
