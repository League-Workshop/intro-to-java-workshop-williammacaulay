package section2;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;



public class FourSquare {
	
	// 2. Create a new Robot
Robot Bob = new Robot();
	void go() {
		// 4. Make the robot move as fast as possible
		new Color(0,255,255);
Bob.setSpeed(1000);
Bob.setPenWidth(5);
Bob.setPenColor(0, 255, 255);
Bob.changeRobot("https://www.models-resource.com/resources/big_icons/11/10137.png");
		// 5. Set the pen width to 5

		// 6. Use a for loop to repeat steps #7 to #8, four times...

			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right

	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		for(int i=0; i<999; i++){
		Bob.turn(1);
		Bob.penDown();
		Bob.move(-1);
		Bob.setRandomPenColor();
		Bob.move(100);
		Bob.move(-100);
			}
	}
	public static void main(String[] args) {
		new FourSquare().go();
	}

}



