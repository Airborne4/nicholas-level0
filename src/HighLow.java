
import java.awt.JobAttributes;
import java.util.Random;

import javax.swing.JOptionPane;


//Copyright Wintriss Technical Schools 2013
public class HighLow {


	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(11);
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
String question=JOptionPane.showInputDialog("Guess a number between 1 and 10");

			// 4. convert the users’ answer to an int (Integer.parseInt(string))
int number=Integer.parseInt(question);
			// 5. if the guess is correct
if (random == number) {
	JOptionPane.showMessageDialog(null, "Wow you guessed the right number!");
}
				// 6. win
			// 7. if the guess is high
				// 8. tell them it's too high
if(random < number){
	speak("Oops, your answer was too high.");
speak("You lose");
speak("bum bum bumbum bam bam bumbum bum boom boom bum bum bomb bomb ba ba baba");
}



			// 9. if the guess is low
				// 10. tell them it's too low
if (random > number) {
speak("Your number was too low.");
	speak("You lose");
}

		// 12. tell them they lose
	}

	static void speak(String words) {
	   	 try {
	   		 Runtime.getRuntime().exec("say " + words).waitFor();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
	   	 }
	  }
}




