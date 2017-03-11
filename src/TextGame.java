import java.util.Scanner;

public class TextGame {
	
	
public static void main(String[] args) {
		Scanner kb= new Scanner(System.in);
String ans6 = null;	
String ans7= null;
	System.out.println("You must escape this castle under fire form the enemy kingdom. Type 'ok' to continue. ");
	String ans=kb.next();
	if (ans.equals("ok")) {
	System.out.println("Do you want to take the left exit or right exit?");
		String ans1=kb.next();
		if (ans1.equals("right")) {
			System.out.println("As tyou are walking down the right path, you fall in a trash pit. Slowly, the walls cave in. Enivetably, you are crushed. \n GAME OVER.");
		}
	if (ans1.equals("left")) {
		System.out.println("As you are walking,a trap door opens benethe your feet. Under the castle, there are 2 hallways. One facing north, and one facing south... Which hallway should you take?");
	String ans2=kb.next();
	if (ans2.equals("south")) {
		System.out.println("As you are walking, you feel a strange chill up your spine. Something is behind you, but you don't know what. You slowly turn but are too late. An unfimiliar green, block like creture combusts. GAME OVER.");
	}
	else {
System.out.println("You see a small sleeping dog. Should you pet it? Yes or No?");	
String ans3=kb.next();
if (ans3.equals("yes")){
	
System.out.println("As you reach for the 'dog', the creature reveals itself to be a mimic. It is actually a giant rodent that hisses at you. Chose to attack or run away? ");
String ans4=kb.next();
	}
else {
	System.out.println("Smart choice! As you are walking by the creature you thought was a dog looks up at you with glaring red eyes.\n You continue on your path until you reach a door. A sturdy lock lies upon the door. With no key, you must resort to breaking it with an object you find in the room. \n A torch and and a metal bar lie near. What will you break it with?  ");
	String ans5=kb.next();
if (ans5.equals("bar")) {
System.out.println("You end up breaking the lock and enter the doorway. You find a note on a desk that lies within the center of the room. It reads \n 81002 \n after looking through the office, you continue on your journey in the northarn hallway. You find a staircase. \n Should you go up the staircase?");
ans6=kb.next();
}
else{
	System.out.println("As you attempt to pick up the torch, your hold slips and the ground catches fire. \n You end up burning. Natural selection i guess. GAME OVER");
	
}
if (ans6.equals("yes")) {
	System.out.println("You have made it to the end. The sunlight approaches. Each step brings you closer to the exit. \n A final door blocks the exit. It is locked with a passcode. 5 digits. What is it?");
	ans7=kb.next();
}
else {
	System.out.println("Wow... You were so close, but you chose to give up. One 'yes' away from victory. You end up rotting within the floors of the castle forever. \n GAME OVER.");
if (ans7.equals("81002")) {
	System.out.println("Congratulations, you have survived the attack and have escaped. \n YOU WIN!");
}
else {
	System.out.println("You were close, but you forgot the code. You enter " + ans7 + " however the door dose not budge. \n You are stuck within the bottom of the castle forever. \n GAME OVER.");
}
}
}
}
	}
	}
	}

}


