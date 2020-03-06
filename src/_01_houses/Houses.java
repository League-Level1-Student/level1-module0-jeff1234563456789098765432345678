package _01_houses;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot shiv = new Robot();

	public void run() {
		shiv.moveTo(100, 500);
		shiv.setSpeed(30);
		// drawFlatRoof();
		for (int i = 0; i < 3; i++) {
			drawHouse("small", Color.BLUE, 2);
			drawHouse("medium", Color.DARK_GRAY, 0);
			drawHouse("large", Color.cyan, 1);
		}

	}

	void drawHouse(String height, Color buildingColor, int flat) {
		int house;
		if (height.equals("small")) {
			house = 50;

		} else if (height.equals("medium")) {
			house = 100;

		} else {
			house = 150;

		}
		
		shiv.setPenColor(buildingColor);
		shiv.penDown();
	//	shiv.turn(270);
		shiv.move(house);
		if (flat == 1) {
			drawFlatRoof();
		} else {
			drawPointyRoof();
		}
		shiv.move(house);
		shiv.turn(270);
		shiv.setPenColor(0, 255, 17);
		shiv.move(20);
		shiv.turn(270);
		shiv.setPenColor(0, 0, 0);
	}

	void drawPointyRoof() {
		shiv.turn(40);
		shiv.move(20);
		shiv.turn(100);
		shiv.move(20);
		shiv.turn(40);

	}

	void drawFlatRoof() {
		shiv.turn(90);
		shiv.move(20);
		shiv.turn(90);
		// shiv.turn(90);
	}
}
