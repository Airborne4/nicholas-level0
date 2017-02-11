import javax.swing.JOptionPane;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

import jdk.internal.dynalink.beans.StaticClass;

public class SpiralMaker {

	public static void main(String[] args) {
		
		// 3. Make a variable to hold the number of sides and set it to 0
		int sides=0;
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		String answer=JOptionPane.showInputDialog("Which speeral would u like m8?");
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		if (answer.equals("square")) {
			sides = 4;
			drawShape(sides);
		}
		if (answer.equals("pentagon")) {
			sides = 5;
			drawShape(sides);
		}
		if (answer.equals("google")) {
			sides = 3;
		drawShape(sides);
		}
		
		
		
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
	
		
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUOkn
		
		// 2. Change your code to turn the square spiral into a triangle spiral
  
	}
    static void drawShape(int sides){
		for (int i = 0; i< 80; i++) {
		Tortoise.setSpeed(10);
		Tortoise.setPenColor(PenColors.getRandomColor());
			Tortoise.penDown();
			Tortoise.move(i*4);
			Tortoise.turn(360/sides);
		}
		
			
}
}

