package controler;

import model.TextEditor;
import view.View;
import java.io.IOException;
import java.util.Scanner;

import view.ViewFactory;

public class Controler {
	private TextEditor te;
	private View view;
	private ViewFactory vf;

	public Controler(String val) {
		te = new TextEditor();
		vf = new ViewFactory();
		this.view = vf.create(this, val);
		this.view.runUI();
	}

	public void handleEvent(String command) {
		switch (command) {
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
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			break;
		case "Save As":
			try {
				view.saveAs(te.saveAsFile());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			break;
		case "New":

			try {
				view.newFile(te.newFile());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			break;
		case "Exit":
			System.exit(1);
			break;

		}
	}

	public static void main(String[] args) {
		System.out.println("Välj gränssnitt: GUI/Console");
		Scanner sc = new Scanner(System.in);
		String val = sc.nextLine();
		new Controler(val);

	}

}
