package main;

import java.util.Scanner;
public class InputFromKeyboard {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("what's your name?");
		String strName = keyboard.nextLine();
		
		System.out.println("how old r u?");
		int iAge = keyboard.nextInt();
		
		System.out.println("how tall r u (m)?");
		double dHeight = keyboard.nextDouble();
		
		System.out.println("Mrs/Ms. " + strName + ", " + iAge + " years old." + "Your height is " + dHeight + ".");
	}

}
