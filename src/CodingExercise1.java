import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		// 3. ask the user what color they would like the Robot to draw

		// 4. use an if/else statement to set the pen color that the user
		// requested (minimum of 2 colors)

		// 2. set the pen width to 10

		// 1. make the Robot draw a shape
		Robot b = new Robot();
		b.penDown();
		b.setPenWidth(10);
		String pencolor = JOptionPane.showInputDialog("Would you like to set the pen color to blue or yellow?");
		if (pencolor.equals("blue")) {
			b.setPenColor(0, 0, 255);
		} else {
			b.setPenColor(255, 0, 0);
		}

		b.setSpeed(10);
		for (int i = 0; i < 4; i++) {
			b.move(100);
			b.turn(90);
		}

	}
}