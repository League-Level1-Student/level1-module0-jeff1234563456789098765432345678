package _01_houses;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot shiv = new Robot();

	public void run() {
		shiv.moveTo(100, 500);
		shiv.setSpeed(30);
		//drawFlatRoof();
			for (int i = 0; i < 3; i++) {
				drawHouse("small", Color.BLUE);
				drawHouse("medium", Color.DARK_GRAY);
				drawHouse("large", Color.cyan);
			}
		
	}
	

	void drawHouse(String height,Color buildingColor) {
		int house;
		if(height.equals("small")) {
			house = 50;
		
		}else if (height.equals("medium")) {
			 house = 100;
			
		}else {
		 house = 150;	
		}
		shiv.setPenColor(buildingColor);
		shiv.penDown();
		shiv.move(house);
		drawFlatRoof();
		shiv.move(house);
		shiv.turn(270);
		shiv.setPenColor(0, 255, 17);
		shiv.move(20);
		shiv.turn(270);
		shiv.setPenColor(0,0,0);
	}
	void drawPointyRoof() {
		//write code for pointy roof here
		
	}
	void drawFlatRoof() {
		shiv.turn(90);
		shiv.move(20);
		shiv.turn(90);
	}
		}
	
	
	
	
