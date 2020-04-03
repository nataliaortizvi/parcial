package Controller;

import java.util.LinkedList;

import Model.Item;
import Model.Logic;
import processing.core.PApplet;

public class ControllerMain {
	Logic logica;
	
	public ControllerMain(PApplet app) {
		this.logica = new Logic(app);
	
}
	public LinkedList<Item> pelis(){
		return logica.getItems();
		}
	
	public void sortList(char i) {
		logica.sortList(i);
	}
	
	
	

}
