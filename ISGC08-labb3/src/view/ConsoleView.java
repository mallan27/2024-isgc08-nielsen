package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import controler.Controler;

public class ConsoleView extends View {

	private Controler c;
	private Scanner sc;
	private BufferedReader in;

	public ConsoleView(Controler c) {
		this.c = c;
	}

	public void runUI() {
		System.out.println("1. Läs fil");
		System.out.println("2. Skapa ny fil");
		sc = new Scanner(System.in);
		int val = Integer.parseInt(sc.nextLine());
		if (val == 1) {
			System.out.println("Skriv filnamn: ");
			String filename = sc.nextLine();
			try {
				openFile(filename);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		} else if (val == 2) {
			System.out.println("Skriv filnamn: ");
			String filename = sc.nextLine();
			File file = new File(filename);
			try {
				newFile(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void openFile(String s) throws FileNotFoundException {
		File file = new File(s);
		try {
			showFile(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void showFile(File f) throws IOException {
		try {
			in = new BufferedReader(new FileReader(f));
			String line = "";
			while ((line = in.readLine()) != null) {
				System.out.println(line + "\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void newFile(File f) throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(f))) {
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void saveAs(File f) throws IOException {

	}

	@Override
	public void save(File f) throws IOException {

	}
}
