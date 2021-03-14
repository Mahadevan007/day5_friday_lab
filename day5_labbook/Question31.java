package day5_labbook;

import java.util.Scanner;

public class Question31 {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice;
		System.out.println("1. For Addition"
				+ "\n2. For Subtraction"
				+ "\n3. For Multiplication"
				+ "\n4. For Division");
		System.out.println("\nPlease Enter a choice");
		int a,b,c;
		choice = scanner.nextInt();
		switch(choice) {
			case 1:
				System.out.println("Enter two numbers");
				a = scanner.nextInt();
				scanner.nextLine();
				b = scanner.nextInt();
				c = a + b;
				System.out.println("The sum of the two number is "+c);
				break;
				
			case 2:
				System.out.println("Enter two numbers");
				a = scanner.nextInt();
				scanner.nextLine();
				b = scanner.nextInt();
				c = a - b;
				System.out.println("The sum of the two number is "+c);
				break;
				
			case 3:
				System.out.println("Enter two numbers");
				a = scanner.nextInt();
				scanner.nextLine();
				b = scanner.nextInt();
				c = a * b;
				System.out.println("The sum of the two number is "+c);
				break;
				
			case 4:
				System.out.println("Enter two numbers");
				a = scanner.nextInt();
				scanner.nextLine();
				b = scanner.nextInt();
				c = a / b;
				System.out.println("The sum of the two number is "+c);
				break;
				
			default:
				System.out.println("Please enter a valid choice");
			
		}
	}
}
