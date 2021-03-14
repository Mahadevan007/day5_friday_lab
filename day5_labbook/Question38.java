package day5_labbook;

public class Question38 {
	public static void main(String[] args) {
		int range = 6;
		int i = 0;
		int a = 0;
		int b = 1;
		int c = 0;
		while(i < range ) {
			System.out.println(a+"\t");
			c = a + b;
			a = b;
			b = c;
			i++;
		}
	}
}
