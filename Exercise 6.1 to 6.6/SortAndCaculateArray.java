package main;

import java.util.Arrays;
import java.util.Scanner;

public class SortAndCaculateArray {

	public static float sum(int[] arr) {
		float sum = Arrays.stream(arr).sum();
		return sum;
	}
	public static float average(int[] arr) {
		float average;
		average = sum(arr) / arr.length;
		//System.out.println(average);
		return average;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 0; //size of the array
		
		System.out.println("Enter the size of the array: ");
		if(sc.hasNextInt()) {
			size = sc.nextInt();
		}
		
	
		int arr[] = new int[size];
		System.out.println("Enter the numbers in the array: ");
		for(int i = 0; i < size; i++ ) {
			if(sc.hasNextInt()) {
				arr[i] = sc.nextInt();
			}
		}
		System.out.print("U enter array: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		sc.close();
		
		System.out.println("The sum of the array: " + sum(arr));
		System.out.println("The average of the array: " + average(arr));
		
		Arrays.sort(arr);
		System.out.print("The soarted array is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
