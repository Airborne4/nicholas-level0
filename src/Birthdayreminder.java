import javax.swing.JOptionPane;

public class Birthdayreminder {
	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String littlebrothersBirthday = "January 24th";
		String brothersBirthday = "August 10th";
		String myBirthday = "August 10";

		// 2. Find out which birthday the user wants and and store their
		// response in a variable
		String answer = JOptionPane
				.showInputDialog("Would you like to know my brother's, little broher's, or my birthday?");
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, "Let me think about my " + answer + " birthday");
		// 4. if user asked for "mom"
		if (answer.equals("little brother")) {
			JOptionPane.showMessageDialog(null, littlebrothersBirthday);
		}
		// print mom's birthday
		// 5. if user asked for "dad"
		else if (answer.equals("brothers")) {
			JOptionPane.showMessageDialog(null, brothersBirthday);
		}
		// print dad's birthday
		// 6. if user asked for your name
		else if (answer.equals("yours")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		} else {
			JOptionPane.showMessageDialog(null, "Sorry, I can't remember that person's birthday!");
		}
	}

}
