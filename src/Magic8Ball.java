
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int num=new Random().nextInt(6);
	// 3. Print out this variable
JOptionPane.showMessageDialog(null, "The Oracle is rolling the magic dice of Cathulu... He rolled a "+ num+"!");
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("Please, ask me a question.");
	// 5. If the random number is 0

	// -- tell the user "Yes"
if(num== 0){
	JOptionPane.showMessageDialog(null, "Yes!");
}
	// 6. If the random number is 1
if(num==1){
	JOptionPane.showMessageDialog(null, "No!");
}
	
	// -- tell the user "No"

	// 7. If the random number is 2
if(num==2){
	JOptionPane.showMessageDialog(null, "Uhh... Maybe you should ask Google.");
}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
if(num==3){
	JOptionPane.showMessageDialog(null, "The Oracle is away... Please come by later.");
}
if(num==5){
	JOptionPane.showMessageDialog(null, "Your question is being answered... Somewere.");
}
	// -- write your own answer



}
}