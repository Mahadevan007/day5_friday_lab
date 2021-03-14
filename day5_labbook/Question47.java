package day5_labbook;

public class Question47 {
	public int add(int num1,int num2) {
		return num1+num2;
	}
	
	public int add(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
	
	public int add(int num1,int num2,int num3,int num4) {
		return num1+num2+num3+num4;
	}
	
	public static void main(String[] args) {
		Question47 obj = new Question47();
		System.out.println(obj.add(1, 2));
		System.out.println(obj.add(1, 2,3));
		System.out.println(obj.add(1,2,3,4));
	}
}
