package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binary_converter implements ActionListener {
	void setup() {

JFrame Panda1 = new JFrame();
JPanel Panda2 = new JPanel();
JButton Panda3 = new JButton();
JTextField answer = new JTextField(20);
Panda3.addActionListener(this);
Panda2.add(answer);
Panda2.add(Panda3);
Panda1.add(Panda2);
Panda1.pack();
Panda1.setVisible(true);
	}
	

	
	@Override
	public actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}
	}
}

