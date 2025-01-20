package view;

import controler.Controler;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

public class GUIView extends View implements ActionListener {
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
	private File fil;
	private String text; 

	public GUIView(Controler c) {
		super(c);
	}

	public void runUI() {
		frame = new JFrame("notes");
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

	@Override
	public void actionPerformed(ActionEvent e) {

		c.handleEvent(e.getActionCommand());

	}

	@Override
	public File openFile() throws IOException {
		JFileChooser fc = new JFileChooser();
		fc.showOpenDialog(new JFrame());
		fil = fc.getSelectedFile();
		return fil;
	}

	@Override
	public void showFile(String txt) throws IOException {
		text=txt; 
		textarea.setText(text);
	}

	@Override
	public File saveAs() throws IOException {
		JFileChooser fc = new JFileChooser();
		fc.showSaveDialog(new JFrame());
		fil = fc.getSelectedFile();
		return fil;
	}

	@Override
	public File save() throws IOException {
		if (fil == null) {
			JFileChooser fc = new JFileChooser();
			fc.showSaveDialog(new JFrame());
			fil = fc.getSelectedFile();
		}
		return fil;

	}

	@Override
	public void newFile() {
		if (fil != null) {
			c.handleEvent("Save");
		}
		textarea.setText("");
		fil = new File("nameless.txt");
	}

	public String getText() {
		return textarea.getText();
	}

}
