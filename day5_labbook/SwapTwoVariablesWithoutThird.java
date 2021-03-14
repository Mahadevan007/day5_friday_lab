package day5_labbook;

public class SwapTwoVariablesWithoutThird {
	public static void main(String[] args) {
		int a,b;
		a = 15;
		b = 27;
		System.out.println("Before a = "+a+" b = "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After a = "+a+" b = "+b);
	}
}
