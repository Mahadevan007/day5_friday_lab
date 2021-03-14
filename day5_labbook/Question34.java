package day5_labbook;

import java.util.Scanner;

public class Question34 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int range;
		System.out.println("Please enter a range");
		range = scanner.nextInt();
		scanner.nextLine();
		int i = 1;
		int result = 0;
		int count = 0;
		while(i<=range) {
			if(i%2!=0) {
				result = result + i;
				count++;
			}
			i++;
		}
		int average =  result/count;
		System.out.println("The average of the odd numbers is :"+average);
	}
}
