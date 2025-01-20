package controler;
import java.io.IOException;
import java.util.Scanner;
import model.TextEditor;
import view.View;
import view.ViewFactory;
public class Controler {
	private TextEditor te;
	private View view; 
	private ViewFactory vf;  
	
	
	public Controler (String answer) {
		te= new TextEditor(this); 
		vf= new ViewFactory(); 
		this.view=vf.create(answer, this);  
		view.runUI(); 
	}
	

	public void handleEvent(String command) {
		switch(command) {
		case "Open": 
			try {
				te.openFile(view.openFile());
			} catch (Exception e) {
				e.printStackTrace();
			} 
			break; 
		case "Save":
			try {
				te.saveFile(view.save()); 
			}catch (IOException e1) {
				e1.printStackTrace();
			}
			break; 
		case "Save As":
		try {
			te.saveAsFile(view.saveAs()); 
		}catch (IOException e1) {
			e1.printStackTrace();
		}
		break; 
		case "New":
			view.newFile();
			break; 
		case "Exit": 
			System.exit(1);
			break; 
		
	}
	}
	
	public void setFile(String text) {
		try {
			view.showFile(text);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	
	
	public String getTextContent() {
		return view.getText(); 
	}
	
	public static void main( String [] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("GUI/Console?"); 
		String answer= sc.nextLine(); 
		new Controler(answer);

	}
}
