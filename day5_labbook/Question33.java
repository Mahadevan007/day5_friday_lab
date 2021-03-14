package day5_labbook;

import java.util.Scanner;

public class Question33 {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int range;
		System.out.println("Please Enter a range");
		range = scanner.nextInt();
		scanner.nextLine();
		int i = 1;
		while(i <= range) {
			if(i%2 == 0) {
				System.out.println(i+"\t");
			}
			i++;
		}
	}
}
