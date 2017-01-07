import java.util.Random;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

public class Validation {
	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {

			// 1. Watch the first 2 minutes of this movie:
			// http://vimeo.com/2485018
			int randomNumber = new Random().nextInt(6);
			// 2. On paper, write all the numbers that get printed when you run
			// this class
			System.out.println(randomNumber);

			// 3. Use the randomNumber to give the user a random compliment.
			if (randomNumber == 0) {
				JOptionPane.showMessageDialog(null, "You... Are.. A... TOY!!!");
			}
			if (randomNumber == 1) {
				JOptionPane.showMessageDialog(null,
						"WARNING! Your computer is infected with a virus. Call our scam free hotline to get FREE online tech support.");
			}
			if (randomNumber == 2) {
				JOptionPane.showMessageDialog(null, "Get your student loan cleared free of charge! 100% not a scam!");

			}
			if (randomNumber == 3) {
				JOptionPane.showMessageDialog(null,
						"You have been entered in a prize contest..... You won! Enter your credit card to claim your Ipad!");

			}
			if (randomNumber == 4) {
				JOptionPane.showMessageDialog(null,
						"u won fre ovrwach acnt. lev 420 al legendry scinz fr only $100000");
			}
			if (randomNumber == 5) {
				JOptionPane.showMessageDialog(null, "I.... I like your closet...");
			}

			// 4. Repeat all the code above 10 times

			// 5. Find someone to test out your program. They will like it :)
		}
	}
}
