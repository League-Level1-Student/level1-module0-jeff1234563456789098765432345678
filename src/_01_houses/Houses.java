package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot shiv = new Robot();

	public void run() {
		
		shiv.moveTo(100, 500);
		shiv.setSpeed(30);
			for (int i = 0; i < 10; i++) {
				drawHouse("small");
				drawHouse("medium");
				drawHouse("large");
			}
	}

	void drawHouse(String height) {
		shiv.penDown();
		shiv.move(100);
		shiv.turn(90);
		shiv.move(20);
		shiv.turn(90);
		shiv.move(100);
		shiv.turn(270);
		shiv.setPenColor(0, 255, 17);
		shiv.move(20);
		shiv.turn(270);
		shiv.setPenColor(0,0,0);
	}
	
	
	}
