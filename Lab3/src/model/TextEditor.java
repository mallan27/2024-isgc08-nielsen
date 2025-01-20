package model;
import java.io.*; 

import controler.Controler;

public class TextEditor {
	private Controler c; 
	
	public TextEditor(Controler c) {
		this.c=c; 
	}
	
	public void openFile(File f) throws Exception {
		String line=""; 
		try (BufferedReader bf = new BufferedReader(new FileReader(f))) {
			String text;
			while ((text = bf.readLine()) != null) {
				line= text; 
			}
		}
		c.setFile(line);
		 
	}

	public void saveFile(File f) throws IOException {
		try (BufferedWriter bw=new BufferedWriter(new FileWriter(f))){
			bw.write(c.getTextContent());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void saveAsFile(File f) throws IOException {
		try (BufferedWriter bw=new BufferedWriter(new FileWriter(f))){
			bw.write(c.getTextContent());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

