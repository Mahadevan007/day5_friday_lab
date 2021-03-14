package day5_labbook;

public class Question41 {
	public static void main(String[] args) {
		int count = 1;
		int row = 4;
		int i = 1;
		while(i <= row) {
			int j = i;
			while(j != 0) {
				System.out.print(count+"\t");
				count++;
				j--;
			}
			System.out.println();
			i++;
		}
		System.out.println();
		System.out.println();
		row = 4;
		i = 1;
		count = 0;
		while( i<=row ) {
			int j = i;
			while(j != 0) {
				System.out.print(count+"\t");
				j--;
			}
			System.out.println();
			i++;
		}
	}
}
