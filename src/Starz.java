import org.teachingextensions.logo.Tortoise;

public class Starz {
	public static void main(String[] args) {
		
		// 1. Set the X position of the Tortoise so that it starts on the left. You also
		// need to show the Tortoise to see the result of this line.
		int currentX = 0;
		Tortoise.setSpeed(10);
		Tortoise.setX(currentX);
		Tortoise.show();
		
		// 2. Make the Tortoise draw a star shape. Hint: 144.
	
		for (int i = 0; i < 13; i ++) {
			for (int j = 0; j < 5; j++) {
				Tortoise.move(30);
				Tortoise.turn(144);
			}
			currentX += 50;
			Tortoise.setX(currentX);
		}
		
		// 3. Set the size of the star to 30.
		

		/** THE CHALLENGE: **/
		/*
		 * Make the Tortoise draw a line of stars like this: http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
