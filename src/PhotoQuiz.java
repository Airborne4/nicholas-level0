import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String tyler= "http://www.jointheleague.org/wp-content/uploads/2017/01/IMG_3184-e1486349236388-270x359.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component image;
		// 3. use the "createImage()" method below to initialize your Component
image=createImage(tyler);
		// 4. add the image to the quiz window
quizWindow.add(image);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String ques1=JOptionPane.showInputDialog("Who is the small, child in the photo?");
		// 7. print "CORRECT" if the user gave the right answer
if (ques1.equals("tyler")) {
	JOptionPane.showMessageDialog(null, "Correct!");
}
else {
	JOptionPane.showMessageDialog(null, "Incorect!");
}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line of code)
//String photo= "http://www.jointheleague.org/wp-content/uploads/2017/01/IMG_3184-e1486349236388-270x359.jpg";
// 2. create a variable of type "Component" that will hold your image
//Component image2;
// 3. use the "createImage()" method below to initialize your Component
//image=createImage(photo);
// 4. add the image to the quiz window
//quizWindow.add(image2);
// 5. call the pack() method on the quiz window
//quizWindow.pack();
		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}
