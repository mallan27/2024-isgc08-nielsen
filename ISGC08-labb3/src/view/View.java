package view;
import java.io.File;
import java.io.IOException;

public abstract class View {
	public abstract void runUI(); 
	public abstract void showFile(File f) throws IOException; 
	public abstract void saveAs(File f) throws IOException; 
	public abstract void save(File f) throws IOException; 
	public abstract void newFile(File f) throws IOException; 

}