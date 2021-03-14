package day5_labbook;

import day5_displayDetails.DisplayDetails;

public class Question53 {
	public static void main(String[] args) {
		DisplayDetails[] objArr = new DisplayDetails[3];
		DisplayDetails obj1 = new DisplayDetails("Mahadevan",21312312);
		DisplayDetails obj2 = new DisplayDetails("Ashwin",11323);
		DisplayDetails obj3 = new DisplayDetails("Karthik",132312);
		objArr[0] = obj1;
		objArr[1] = obj2;
		objArr[2] = obj3;
		
		for(DisplayDetails i:objArr) {
			System.out.println();
			i.showDetails();
			System.out.println();
		}
	}
}
