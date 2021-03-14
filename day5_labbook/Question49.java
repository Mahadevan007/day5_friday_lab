package day5_labbook;

import java.util.Scanner;

public class Question49 {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the length of the box");
		double l = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter the breadth of the box");
		double b = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter the height of the box");
		double h = scanner.nextDouble();
		scanner.close();
		double volume = l*b*h;
		System.out.println("Volume : "+volume);
	}
}
