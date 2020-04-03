package View;

import Controller.ControllerMain;
import processing.core.PApplet;

public class Main extends PApplet {
	
	ControllerMain controllerM;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("View.Main");

		}
		
		public void settings() {
			size(900,600);
		}
		
		public void setup() {
			controllerM = new ControllerMain(this);
			
		}
		
		public void draw() {
			background(0);
			
			/*for(int i =0; i<controllerM.pelis().size(); i++) {
				controllerM.pelis().get(i).pintar();
			}*/
			
		}
		
		public void keyPressed() {
		
		}

	

}
