package day5_labbook;

public class Question44 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,10};
		for(int i = 0; i<arr1.length ; i++) {
			arr1[i] = arr1[i] + arr2[i];
			arr2[i] = arr1[i] - arr2[i];
			arr1[i] = arr1[i] - arr2[i];
		}
		
		System.out.println("Array 1");
		for(int i:arr1) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("Array 2");
		for(int i:arr2) {
			System.out.print(i+"\t");
		}
	}
}
