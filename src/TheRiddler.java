import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer = JOptionPane.showInputDialog("I have keys but no locks, what am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the
		// score by one
		if (answer.equals("keyboard")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Sorry, the correct answer is Keyboard! You said " +answer);

		}

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
String answer2 = JOptionPane.showInputDialog("I can only live where there is light, but I die if the light shines on me. What am I?");
if(answer2.equals("shadow")){
	JOptionPane.showMessageDialog(null, "Wow! You're correct!");
	score++;
}
else{
	JOptionPane.showMessageDialog(null, "Oops! The correct answer was shadow You said " +answer2);
}

JOptionPane.showMessageDialog(null, "Last riddle, get ready!");
String answer3 = JOptionPane.showInputDialog("What has four fingers and a thumb but is not living?");
if(answer3.equals("gloves")){
	JOptionPane.showMessageDialog(null, "I can't believe it! You're correct!");
	score ++;
}
else{
	JOptionPane.showMessageDialog(null, "Aww! The correct answer was gloves! You said " +answer3 );
}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is..." + score);
	}
}
