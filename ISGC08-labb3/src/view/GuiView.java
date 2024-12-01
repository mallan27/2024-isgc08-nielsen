package view;

import controler.Controler;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

public class GuiView extends View implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JFrame frame;
	private JMenuBar menubar;
	private JMenu menu;
	private JMenuItem open;
	private JMenuItem save;
	private JMenuItem saveAs;
	private JMenuItem newText;
	private JMenuItem exit;
	private JTextArea textarea;
	private BufferedReader in;
	private Controler c;

	public GuiView(Controler c) {
		this.c = c;
	}

	public void runUI() {
		frame = new JFrame("Notes");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(500, 600);
		panel = new JPanel(new BorderLayout());
		menubar = new JMenuBar();
		menu = new JMenu("Menu");
		open = new JMenuItem("Open");
		save = new JMenuItem("Save");
		saveAs = new JMenuItem("Save As");
		newText = new JMenuItem("New");
		exit = new JMenuItem("Exit");
		open.addActionListener(this);
		save.addActionListener(this);
		saveAs.addActionListener(this);
		newText.addActionListener(this);
		exit.addActionListener(this);
		menu.add(open);
		menu.add(save);
		menu.add(saveAs);
		menu.add(newText);
		menu.add(exit);
		menubar.add(menu);
		panel.add(menubar, BorderLayout.NORTH);
		textarea = new JTextArea(50, 50);
		panel.add(textarea, BorderLayout.CENTER);
		frame.add(panel);
		frame.setVisible(true);
	}

	public void showFile(File f) throws IOException {
		textarea.setText("");
		try {
			in = new BufferedReader(new FileReader(f));
			String line = "";
			while ((line = in.readLine()) != null) {
				textarea.append(line + "\n");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void saveAs(File f) throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(f))) {
			writer.write(textarea.getText());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void save(File f) throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(f))) {
			writer.write(textarea.getText());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void newFile(File f) throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(f))) {
			writer.write(textarea.getText());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		textarea.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		c.handleEvent(e.getActionCommand());

	}

}
