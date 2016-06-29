package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot Alex = new Robot();
for (int i = 4; i < 999999999; i++) {
Alex.setPenColor(Color.YELLOW);
Alex.penDown();
Alex.move(100);	
Alex.turn(90);
}

	
	
	
	
	
	
	
	
	
	
	
	
	}
}