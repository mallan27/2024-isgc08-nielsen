package view;

import controler.Controler;


public class ViewFactory {
	public View sy; 
	
	
	public View create(String view, Controler c) {
		if (view.equalsIgnoreCase("Gui")) {
			sy=new GUIView(c);
		  return sy; 
		}else if(view.equalsIgnoreCase("Console")) {
		return new ConsoleView(c);
		}
		return null;
	}
}
