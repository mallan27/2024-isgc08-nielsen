package model;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class TextEditor {
	private File fil;

	public File openFile() {
		JFileChooser fc = new JFileChooser();
		fc.showOpenDialog(new JFrame());
		fil = fc.getSelectedFile();
		return fil;

	}

	public File saveFile() {
		if (fil == null) {
			JFileChooser fc = new JFileChooser();
			fc.showSaveDialog(new JFrame());
			fil = fc.getSelectedFile();
		}
		return fil;
	}

	public File saveAsFile() {
		JFileChooser fc = new JFileChooser();
		fc.showSaveDialog(new JFrame());
		fil = fc.getSelectedFile();
		return fil;
	}

	public File newFile()throws FileNotFoundException {
		if (fil != null) {
			JFileChooser fc = new JFileChooser();
			fc.showSaveDialog(new JFrame());
			fil = fc.getSelectedFile();
		} else {
			fil=new File(""); 
			
		}
		return fil; 
	}

}

