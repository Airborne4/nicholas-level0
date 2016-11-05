import javax.swing.JOptionPane;

public class NasaCountdown {
	public static void main(String[] args) {
		// 2. ask the user when to start (JOptionPane.showInputDialog)
		String seconds=JOptionPane.showInputDialog("Commander, how many seconds until we launch the rocket?");
		// 3. convert the user's answer to an int (Integer.parseInt)
int secs = Integer.parseInt(seconds);

		// 4. countdown from user's starting point
for (int i = secs; i>-1; i--) {
	System.out.println(i);
	speak(Integer.toString(i));
}
		// 1. countdown from 10 to 0


		// 5. when the counting is done, print "blastoff!"


	speak("g g mate!");
	}


static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
  }
}
