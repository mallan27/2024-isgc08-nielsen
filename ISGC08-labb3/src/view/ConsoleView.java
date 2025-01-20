package view;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import controler.Controler;

public class ConsoleView extends View{
private Scanner sc; 
private File file; 
private String text; 
private int val=1; 

	public ConsoleView(Controler c) {
		super(c); 
	}
	
	public void runUI() {
		while(val!=0) {
			System.out.println("1. Skapa ny fil"); 
			System.out.println("2. Läs fil"); 
			System.out.println("0. Avsluta"); 
			sc= new Scanner(System.in);
			val=Integer.parseInt(sc.nextLine());  
			
			if(val==1) {
				c.handleEvent("New");
			} else if(val==2) {
				c.handleEvent("Open");
			} else if (val==0) {
				c.handleEvent("Exit");
			}
				
		}
	}

	@Override
	public File openFile() throws IOException {
		System.out.println("Skriv in filnamn: "); 
		String filename= sc.nextLine(); 
		   file = new File(filename);
	        if (file.exists() && file.isFile()) {
	            return file;
	        } else {
	            System.out.println("Filen finns inte.");
	            return null;
	        }
	}
	
	@Override
	public void showFile(String text) throws IOException {
		System.out.println(text); 
	}

	@Override
	public void newFile() {
		System.out.println("Välj namn på filen: "); 
		String filename= sc.nextLine(); 
		file = new File(filename);
		System.out.println("Ny fil skapad, skriv och klicka sen enter för att spara !"); 
		text=sc.nextLine(); 
		c.handleEvent("Save");
	}

	@Override
	public File save() throws IOException {
		System.out.println("Sparar filen!");
		return file; 
	}
	
	@Override
	public String getText() {
		return text;
	}

}
