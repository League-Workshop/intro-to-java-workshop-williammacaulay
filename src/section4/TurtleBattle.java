package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class TurtleBattle {
	// 1. Put all of the game code inside the main method (below) 
	public static void main(String[] args) {
		
		ImageIcon turtle = new ImageIcon("turtle.png");		
		
		JOptionPane.showMessageDialog(null, "Defeat the turtle for food!", "Turtle Battle", 0, turtle);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
		int playerHealth = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragonHealth = 400;
		// 4. Create a variable to hold the damage the player's attack does each round
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int maxDragonDamage = 30;
		
		int dragonDamage = 0;
		
		Random rand = new Random();
		
		
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		
		// 9. If they typed in "yell":
		dragonDamage = rand.nextInt(maxDragonDamage+1);
		JOptionPane.showMessageDialog(null,"The turtle attacks with a water blast!");
		playerHealth=playerHealth-dragonDamage;
		JOptionPane.showMessageDialog(null, "You are on "+playerHealth+" health!");
		
		String attack = JOptionPane.showInputDialog(null,"Attacks available: water gun(1) sword(2) heal(3)");
		
		if(attack.equals("1")) {
			JOptionPane.showMessageDialog(null, "The water dampened the turtle's attack.");
			maxDragonDamage = maxDragonDamage-5;
			dragonHealth = dragonHealth-40;
		}
		if(attack.equals("2")) {
			JOptionPane.showMessageDialog(null, "The turtle was sucessfully damaged.");
			dragonHealth = dragonHealth-80;
		}
			JOptionPane.showMessageDialog(null, "The turtle is on "+dragonHealth+" health!");
			
			if(attack.equals("3")) {
				JOptionPane.showMessageDialog(null, "You sucessfully healed yourself.");
				playerHealth = playerHealth+10;
			JOptionPane.showMessageDialog(null, "You are on "+playerHealth+" health!");
			}
			
		
		
		}
		//-- Find a random number between 0 and 10 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable 
			
		// 10. If they typed in "kick":
		
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable
			
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		
		// 12. Subtract this number from the player's health
		
		
		
		// 13. If the user's health is less than or equal to 0
		
			//-- Tell the user that they lost
			
		
		// 14. Else if the dragon's health is less than or equal to 0
		
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
		if(playerHealth<=(0)) {
		JOptionPane.showMessageDialog(null, "You died, and the turtle ate your corpse.");
		}
		if(dragonHealth<=(0)) {
		JOptionPane.showMessageDialog(null, "You killed the turtle and ate it's corpse.");
			}
		}
	}