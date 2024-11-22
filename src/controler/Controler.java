package controler;
import model.TextEditor;
import view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
public class Controler {
	private TextEditor te;
	private View view; 
	
	public Controler () {
		te= new TextEditor(); 
		view=new View(this); 
	}
	

	public void handleEvent(String command) {
		switch(command) {
		case "Open": 
			try {
				view.showFile(te.openFile()); 
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			break; 
		case "Save":
			try {
				view.save(te.saveFile()); 
			}catch (IOException e1) {
				e1.printStackTrace();
			}
			break; 
		case "Save As":
		try {
			view.saveAs(te.saveAsFile()); 
		}catch (IOException e1) {
			e1.printStackTrace();
		}
		break; 
		case "New":
			 
			try {
				view.newFile(te.newFile());
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break; 
		case "Exit": 
			System.exit(1);
			break; 
		
	}
	}
	
	public static void main( String [] args) {
		new Controler();

	}
	
}
