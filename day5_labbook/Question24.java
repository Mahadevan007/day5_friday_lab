package day5_labbook;

import java.util.Scanner;

public class Question24 {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the side's value of the square");
		int a = scanner.nextInt();
		scanner.nextLine();
		int areaofsquare = a * a;
		System.out.println("Area of the square = "+areaofsquare);
		int perimeterofsquare = 4 * a;
		System.out.println("Perimeter of the square = "+perimeterofsquare);
		
		System.out.println("Enter the length and width of the traingle");
		int l = scanner.nextInt();
		scanner.nextLine();
		int w = scanner.nextInt();
		scanner.nextLine();
		int areaoftriangle = l * w;
		System.out.println("Area of the traingle = "+areaoftriangle);
		int perimeteroftriangle = 2 * ( l + w );
		System.out.println("Perimeter of the triangle = "+perimeteroftriangle);
		
	}
}
