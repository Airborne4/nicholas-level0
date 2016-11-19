import javax.swing.JOptionPane;

public class XGeeks {
		public static void main(String[] args) {


				// 1. Save the superpower for each person in a variable.
String Tyler ="The power to be invisible when no one is looking at you";
String Daniel = "The power to breathe under water unless your wet";
String Apaara = "The power to walk through walls but fall through floors";
String Arslan = "The power to smell the future";
				// 2. Ask the user to enter a name. Store their answer in a variable.

String name= JOptionPane.showInputDialog("What is your name?");
				// 3. Show the superpower in a pop-up, depending on the name entered. 
if (name.equals("Tyler")){
	JOptionPane.showMessageDialog(null, Tyler);
}
if (name.equals("Tyler")){
	JOptionPane.showMessageDialog(null, Arslan);
}
	if (name.equals("Tyler")){
		JOptionPane.showMessageDialog(null, Apaara);
	}		
		if (name.equals("Tyler")){
			JOptionPane.showMessageDialog(null, Daniel);
			}
		}}


