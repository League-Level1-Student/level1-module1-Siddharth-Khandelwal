package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	Popcorn Bob = new Popcorn("Bob");
	Bob.applyHeat();
	String Flavor = JOptionPane.showInputDialog("What flavor popcorn do you want?");
	Bob.eat();
}
}
