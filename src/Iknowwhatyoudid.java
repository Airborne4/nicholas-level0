import javax.swing.JOptionPane;

public class Iknowwhatyoudid {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What's your name?");
		String answer = JOptionPane.showInputDialog("What did you do last summer?");
		JOptionPane.showMessageDialog(null, "So, " + name + ", you " + answer + " last summer?");
		String answer2 = JOptionPane.showInputDialog(null);
		if (answer2.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Cool!");
		}

		else {
			JOptionPane.showMessageDialog(null, "Oh...");
		}
if (answer2.equals("Umm")){
	JOptionPane.showMessageDialog(null, "Umm");
}
	}
}
