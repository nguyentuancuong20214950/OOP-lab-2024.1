package main;

import java.util.Scanner;
import java.util.Arrays;

public class DaysInAMonth {

	public static boolean isLeapYear(int year) {
		if(year%4 == 0 & year%100 != 0 ) { //case year divisible by 4 but not by 100
			return true;
		}
		if(year%100 == 0 & year%400 == 0) { //case year divisible by 4, 100 and 400
			return true;
		}
		return false; //case year not divisible by 4, divisible by 4 and 100 but not 400
	}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String validMonths[] = new String[]{"January",	"February",	"March",	"April",	"May",	"June",	"July",	"August",	"September",	"October",	"November",	"December",
				"Jan.",	"Feb.",	"Mar.",	"Apr.",	"May",	"June",	"July",	"Aug.",	"Sept.",	"Oct.",	"Nov.",	"Dec.",
				"Jan",	"Feb",	"Mar",	"Apr",	"May",	"Jun",	"Jul",	"Aug",	"Sep",	"Oct",	"Nov",	"Dec",
				"1",	"2",	"3",	"4",	"5",	"6",	"7",	"8",	"9",	"10",	"11",	"12"};
		String month31Days[] = {"January",		"March",		"May",		"July",	"August",		"October",		"December",
				"Jan.",		"Mar.",		"May",		"July",	"Aug.",		"Oct.",		"Dec.",
				"Jan",	"Feb",	"Mar",	"Apr",	"May",	"Jun",	"Jul",	"Aug",	"Sep",	"Oct",	"Nov",	"Dec",
				"1",		"3",		"5",		"7",	"8",		"10",		"12"};
		String month30Days[] = {		"April",		"June",		"September",		"November",					"Jan.",	"Feb.",	"Mar.",	"Apr.",	"May",	"June",	"July",	"Aug.",	"Sept.",	"Oct.",	"Nov.",	"Dec.",
					"Apr",		"Jun",		"Sep",		"Nov",	
					"4",		"6",		"9",		"11"};
		
		System.out.println("please enter the year: ");
		String strYear = keyboard.nextLine();
		boolean yearIsValid = strYear.matches("\\d+"); //check if input is an integer
		
		if (yearIsValid) {
			int iYear = Integer.parseInt(strYear);
			//System.out.println("u enter:" + iYear);
			System.out.println("please enter the month: ");
			String strMonth = keyboard.nextLine();
			//System.out.println("u enter" + strMonth);
			boolean monthIsValid = Arrays.asList(validMonths).contains(strMonth); //check if input is an integer
			
			if(monthIsValid) {
				//System.out.println("month is valid");
				boolean monthHas31Days = Arrays.asList(month31Days).contains(strMonth); //check if month in list of 31-day month
				boolean monthHas30Days = Arrays.asList(month30Days).contains(strMonth); //check if month in list od 30-day month
				String expression = Boolean.toString(monthHas31Days) + Boolean.toString(monthHas30Days);
				
				switch (expression) {
				case "truefalse" :
					System.out.println("this month has 31 days");
					break;
				case "falsetrue" :
					System.out.println("this month has 30 days");
					break;
				case "falsefalse" :
					if(isLeapYear(iYear)) {
						System.out.println("this month has 29 days");

					}
					else {
						System.out.println("this month has 28 days");

					}
					break;
				default: 
					System.out.println("no match");
				}
			}
			else {
				System.out.println("Month must be in its full name, abbreviation, in 3 letters, or in number. \nTo illustrate, the valid inputs of January are January, Jan., Jan, and 1.");
			}
		}
		
		else {
			System.out.println(" Year must be a non-negative number! Please try again");
		}
	}

}
