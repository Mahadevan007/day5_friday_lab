package day5_labbook;

public class Question48 {
	public Question48(int num1,int num2) {
		System.out.println(num1+num2);
	}
	
	public Question48(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
	}

	public Question48(int num1,int num2,int num3,int num4) {
		System.out.println(num1+num2+num3+num4);
	}
	
	public static void main(String[] args) {
		Question48 obj = new Question48(1,2);
		Question48 obj2 = new Question48(1,2,3);
		Question48 obj3 = new Question48(1,2,3,4);
	}
}
