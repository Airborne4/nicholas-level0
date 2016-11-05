import org.jointheleague.graphical.robot.Robot;


public class RobotSquare {
	public static void main(String[] args) throws Exception {
		// 1. Make a new Robot
Robot b = new Robot();

		// 3. Put the robot's pen down
b.penDown();
b.setRandomPenColor();
		// 6. Make the robot move as fast as possible
b.setSpeed(10);

		// 5. Do everything below here 4 times
for (int move = 0; move < 4; move++) {
	

		// 		2. Move your robot 200 pixels
b.penDown();
	b.move(200);
 
		// 		4. Turn the robot 90 degrees to the right (90 degrees)
b.turn(90);
b.penUp();
b.penDown();
b.setRandomPenColor();
b.penUp();
b.penDown();
b.setRandomPenColor();
b.penUp();
b.penDown();
b.setRandomPenColor();b.penUp();
b.penDown();
b.setRandomPenColor();

}
	}
}
