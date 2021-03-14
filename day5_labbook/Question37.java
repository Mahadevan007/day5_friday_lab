package day5_labbook;

public class Question37 {
	public static void main(String[] args) {
		int number = 12345;
		int result = 0;
		while(number!=0) {
			int rem = number % 10;
			result = result + rem;
			number = number / 10;
		}
		System.out.println("The sum of the number is "+result);
	}
}
