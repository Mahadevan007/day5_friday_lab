package day5_labbook;

public class Question25 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		if((a>b) && (a>c)) {
			System.out.println("A is greater");
		}else if(b > c) {
			System.out.println("B is greater");
		}else {
			System.out.println("c is greater");
		}
		
		if((b>c) && (a>b) && (a>c)) {
			System.out.println("A is greater");
		}else if(a > c ) {
			System.out.println("A is greater");
		}else {
			System.out.println("C is greater");
		}
	}
}
