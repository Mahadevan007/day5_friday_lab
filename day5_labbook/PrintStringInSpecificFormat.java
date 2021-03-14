package day5_labbook;

public class PrintStringInSpecificFormat {
	public static void main(String[] args) {
		System.out.println("\nTwinkle, twinkle, little star, \n\tHow I wonder what you are!"
				+ "\n\t\tUp above the world so high,"
				+ "\n\t\tLike a diamond in the sky."
				+ "\nTwinkle, twinkle, little star,"
				+ "\n\tHow I wonder what you are");
		boolean a = true;
		boolean b = false;
		boolean c = a | b;
		boolean d = a & b;
		boolean e = a ^ b;
		boolean f = (!a & b) | (a & !b);
		boolean g = ! a;
		System.out.println(c+"\t"+d+"\t"+e+"\t"+f+"\t"+g);
	}
}
