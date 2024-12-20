package hust.soict.dsai.swing;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;
import java.awt.event.*;

public class AWTAccumulator extends Frame {
	private TextField tfInput;
	private TextField tfOutput;
	private int sum = 0;
	
	public AWTAccumulator() {
		setLayout(new GridLayout(2,2));
		
		add(new Label("Enter an Interger: "));
		
		tfInput = new TextField(10);
		add(tfInput);
		tfInput.addActionListener(new TFInputListener());
		
		add(new Label("The Accumulated Sum is: "));
		
		tfOutput = new TextField(10);
		tfOutput.setEditable(false);
		add(tfOutput);
		
		setTitle("AWT Accumulator");
		setSize(350,120);
		setVisible(true);
	}
	
	public static void main (String arg[]) {
		AWTAccumulator a = new AWTAccumulator();
		a.addWindowListener(new WindowAdapter() {
	        public void windowClosing(WindowEvent we) {
	            a.dispose(); // use dispose method 
	         }
	     }
	);
	}
	
	private class TFInputListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evt) {
			int numberIn = Integer.parseInt(tfInput.getText());
			sum+= numberIn;
			tfInput.setText("");
			tfOutput.setText(sum +"");
		}
	}
}
