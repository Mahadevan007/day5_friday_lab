package day5_labbook;

import java.util.Scanner;

public class SwitchCaseDetermineSeason {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		String month;
		System.out.println("Please Enter a month");
		month = scanner.nextLine();
		month = month.toLowerCase();
		switch(month) {
			case "december":
			case "january":
			case "february":
				System.out.println("Winter Season");
				break;
			
			case "march":
			case "april":
			case "may":
				System.out.println("Spring Season");
				break;
				
			case "june":
			case "july":
			case "august":
				System.out.println("Summer Season");
				break;
				
			default:
				System.out.println("Please enter a valid month");
		}
	}
}
