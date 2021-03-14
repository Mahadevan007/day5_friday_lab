package day5_labbook;

public class Question51 {
	public static void main(String[] args) {
		newClassB obj = new newClassB(10);
	}
}

class newClassA {
	public newClassA(int i) {
		System.out.println(i);
	}
}

class newClassB extends newClassA{
	public newClassB(int i) {
		super(i);
	}
}