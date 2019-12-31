package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		

		// 1. Create a new Robot
		Robot hi = new Robot();
		// 5. Set your robot's pen down 
		hi.penDown();
		// 3. Set the robot to go at max speed (100)
		hi.setSpeed(100);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		
		
		
		for(int i=0; i<999; i++){
			
			
		hi.turn(1);
			// 7. Change the pen color to random
		hi.setRandomPenColor();
			// 6. Move the robot 5 times the loop counter (5*i)
		hi.move(i);
			// 2. Turn the robot 360/7 degrees to the right
		hi.turn(360/10);
			// 8. Set the pen width to i
		hi.setPenWidth(1);
		}
	}
}
