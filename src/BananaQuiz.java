import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String question1=JOptionPane.showInputDialog("Do you like your bananas");
		
		//2. if they say no, 
		if (question1.equals("no")) {
			JOptionPane.showMessageDialog(null, "R U CRAZY!!!");
		}
		else if (question1.equals("yes")) {
			String question2=JOptionPane.showInputDialog("What's your favorite hobby?");
		JOptionPane.showMessageDialog(null, question2 + " Is much better with bananas");
		}
		
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than “yes” or “no”
		//	show a pop up that says “You are bananas!”
	
	}

}
