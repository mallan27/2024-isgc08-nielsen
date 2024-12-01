package view;

import controler.Controler;

public class ViewFactory {

	public View create(Controler c, String choice) {
		if (choice.equalsIgnoreCase("Gui")) {
			return new GuiView(c);
		} else if (choice.equalsIgnoreCase("Console")) {
			return new ConsoleView(c);
		}
		return null;

	}

}
