package main;

import javax.swing.JOptionPane;
public class ChoosingOptions {

	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null, "Do u want to change to the first class ticket?", null, JOptionPane.YES_NO_OPTION);
		
		JOptionPane.showMessageDialog(null, "U've choosen:" + (option==JOptionPane.YES_OPTION?"Yes":"No"));
		System.exit(0);
	}

}
