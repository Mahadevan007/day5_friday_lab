package day5_labbook;

import java.util.Scanner;

public class SwitchCaseVowelOrNot {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		boolean isVowel = false;
		System.out.println("Enter a character : ");
		char character = scanner.nextLine().charAt(0);
		switch(character) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U': isVowel = true;
		}
		
		if(isVowel == true) {
			System.out.println("The character is a vowel");
		}else {
			System.out.println("Not a vowel");
		}
	}
}
