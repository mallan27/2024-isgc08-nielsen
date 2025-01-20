package view;
import java.io.*;

import controler.Controler;

public abstract class View {
	Controler c; 
	
	public View(Controler c) {
		this.c=c; 
	}
	public abstract void runUI();
	public abstract File openFile() throws IOException; 
	public File saveAs() throws IOException {
		return null;
	}
	public abstract void showFile(String text) throws IOException;
	public abstract File save() throws IOException;
	public abstract String getText();
	public abstract void newFile();

}