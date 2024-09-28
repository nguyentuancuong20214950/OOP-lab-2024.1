package main;

import java.util.Scanner;
public class StarTriangle {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(" Input the height of the triangle");
		int height = keyboard.nextInt();
		System.out.println("u got a star triangle:!!");
		
		int i=0;
		while (i<height) {
			System.out.println(" ".repeat(height-i-1)+"*".repeat(2*i+1)+" ".repeat(height-i-1));
			i++;
		}
	}

}
