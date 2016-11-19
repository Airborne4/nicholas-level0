// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;


/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class Arline {
	
	public static void main(String[] args) {
		
		
		
		String name=JOptionPane.showInputDialog("Please type your first name below:");
		String lastname=JOptionPane.showInputDialog("Insert your last name below:");
		String dest=JOptionPane.showInputDialog("Please, tell me where you plan to travel");
		String birth=JOptionPane.showInputDialog("When is your Birthday");
		String gender=JOptionPane.showInputDialog("Whats your gender?");
		
		String info=JOptionPane.showInputDialog("Is this your information? " + lastname +" / " + name + "(" + birth + " , " + gender + ")");
	if (info.equals("yes")){
		JOptionPane.showMessageDialog(null, "Now Printing...");
		System.out.println(lastname +" / " + name + "(" + birth + " , " + gender + ") " + "Traveling To: " + dest );
	}
	else{
		for (int i = 0; i < 1; i++) {
			
			
		}
	}
	}
}






/**Extra Difficult Challenge: have the program repeat until plane is full (10 passenger plan) and print out the number of passengers after each boarding pass.
*/