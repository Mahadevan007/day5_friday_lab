package day5_labbook;

import java.util.Scanner;

public class Question32 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int number;
		System.out.println("\nPlease Enter a number");
		number = scanner.nextInt();
		scanner.nextLine();
		int i = 1;
		int count = 0;
		while(i<=number) {
			if(number%i==0) {
				count++;
			}
			i++;
		}
		if(count == 2) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}
	}
}
