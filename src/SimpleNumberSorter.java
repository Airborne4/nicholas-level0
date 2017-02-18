import javax.swing.JOptionPane;

public class SimpleNumberSorter {
public static void main(String[] args) {
	String input=JOptionPane.showInputDialog("pick a number!");
	int num1=Integer.parseInt(input);
	String input2=JOptionPane.showInputDialog("pick another number!");
	int num2=Integer.parseInt(input2);	
	String input3=JOptionPane.showInputDialog("pick a final number!");
	int num3=Integer.parseInt(input3);
if(num1<num2&&num1<num3){
	if (num2<num3) {
		System.out.println(num1+" "+ num2+ " "+ num3);
	}
		
	}
	}
}


}
