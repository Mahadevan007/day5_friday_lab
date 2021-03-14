package day5_labbook;

public class Question43 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int max = 0;
		for(int i:arr) {
			if(i>max) {
				max = i;
			}
		}
		System.out.println("The maximum element is :"+max);
		int min = max;
		for(int i:arr) {
			if(i<min) {
				min = i;
			}
		}
		System.out.println("The minimum element is :"+min);
	}
}
