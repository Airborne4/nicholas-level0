import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {

		String otherquestion;
		String question1 = JOptionPane.showInputDialog("Are you happy?");
		if (question1.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what your doing m8!");
		}

		else {
			otherquestion = JOptionPane.showInputDialog("Do you want to be happy?");

			if (otherquestiron.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something...");
			} else {
				JOptionPane.showMessageDialog(null, "Keep doin what yo doing m8");
			}
		}

	}

}
