package main;

import javax.swing.JOptionPane;
public class Caculate {

	public static void main(String[] args) {
		String strNum1, strNum2;
		String strNotification;
		
		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number:", " Input the first number: ",JOptionPane.INFORMATION_MESSAGE);
		//strNotification += strNum1 + "and";
		double num1 = Double.parseDouble(strNum1);
		
		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number:", " Input the second number: ",JOptionPane.INFORMATION_MESSAGE);
		//strNotification += strNum2;
		double num2 = Double.parseDouble(strNum2);
		
		double sum = num1 + num2;
		strNotification = "The sum of those two numbers: " + sum;
		JOptionPane.showMessageDialog(null, strNotification , "Result ", JOptionPane.INFORMATION_MESSAGE);

		double difference = num1 - num2;
		strNotification = "The difference of those two numbers: " + difference;
		JOptionPane.showMessageDialog(null, strNotification , "Result ", JOptionPane.INFORMATION_MESSAGE);

		double product = num1*num2;
		strNotification = "The product of those two numbers: " + product;
		JOptionPane.showMessageDialog(null, strNotification , "Result ", JOptionPane.INFORMATION_MESSAGE);

		if (num2 != 0) {
			double quotient = num1 / num2;
			strNotification = "The quotient of those two numbers: " + quotient;
			JOptionPane.showMessageDialog(null, strNotification , "Result ", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else {
			strNotification = "Can not get the quotient since the second number = 0";
			JOptionPane.showMessageDialog(null, strNotification , "Result ", JOptionPane.INFORMATION_MESSAGE);

		}
	}

}
