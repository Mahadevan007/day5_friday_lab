package day5_labbook;

public class Question36 {
	public static void main(String[] args) {
		int number = 121;
		int temp = number;
		int result = 0;
		while(temp!=0) {
			int rem = temp % 10;
			result =  result * 10 + rem;
			temp = temp / 10;
		}
		
		if(result == number) {
			System.out.println("The number is a palindrome");
		}else {
			System.out.println("The number is not a palindrome");
		}
	}
}
