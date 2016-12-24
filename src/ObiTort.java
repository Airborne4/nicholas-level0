import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.TortoiseUtils;

public class ObiTort {
public static void main(String[] args) {
	Tortoise.show();
String question=JOptionPane.showInputDialog("What shape would you like the tortoise to draw? (You can only draw a square, circle, and a triangle) You can also say sides to state another amount of sides!!!!");

if (question.equals("square")) {
	drawSquare();
}

if (question.equals("triangle")) {
	drawTriangle();
}

if (question.equals("circle")) {
	drawCircle();
}
if (question.equals("sides")){
	String Sides=JOptionPane.showInputDialog("State the number of sides");
int sides = Integer.parseInt(Sides);
drawShape(sides);
	

}
}
private static void drawSquare(){
	Tortoise.setSpeed(8);
	for (int i = 0; i < 4; i++) {
		Tortoise.move(50);
		Tortoise.turn(90);
	}
	
}

private static void drawTriangle(){
	for (int i = 0; i < 3; i++) {
		Tortoise.setSpeed(8);
		Tortoise.move(50);
		Tortoise.turn(360/3);
	}
}
private static void drawCircle(){
	for (int i = 0; i < 360; i++) {
		Tortoise.setSpeed(10);
		Tortoise.move(1);
		Tortoise.turn(360/360);
	}
}
private static void drawShape(int numSides){
	Tortoise.setSpeed(8);
	for (int i = 0; i < numSides; i++) {
		
	}
	Tortoise.move(50);
	Tortoise.turn(360/numSides);
}
}
