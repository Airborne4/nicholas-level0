import java.net.URI;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class SoundtrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "How are you felling today??????", "MOOD", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "happy", "sad", "angry" }, null);
		
		// 2. Their answer is stored in the userMood variable. Print it out.
System.out.println(userMood);
		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
if (userMood==2) {
	
playVideo("https://youtu.be/dTBUv8d0-Co");
}
// 4. Play different songs for other moods.
if (userMood==0) {
	
JOptionPane.showMessageDialog(null, "Yattttt");
}
if (userMood==1) {
	
JOptionPane.showMessageDialog(null, "succs");
}
		// If you are seeing ads at the beginning of your videos, install Adblock.

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
