package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	Microwave jim = new Microwave();
	
	
	String Flavor = JOptionPane.showInputDialog("What flavor popcorn do you want?");
	String minutes = JOptionPane.showInputDialog("How many minutes do you want to cook your popcorn for?");
	int Minutes = Integer.parseInt(minutes);
	Popcorn Bob = new Popcorn(Flavor);
	jim.putInMicrowave(Bob);
	jim.setTime(Minutes);
	jim.startMicrowave();
	
}
}
