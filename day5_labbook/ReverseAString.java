package day5_labbook;

import java.util.Scanner;

public class ReverseAString {
	public static void main(String[] args) {
		String orgString = "newString";
		System.out.println("Original String : "+orgString);	
		char[] strarray = orgString.toCharArray();
		System.out.println("Reverse String : ");
		char temp;
		int i = 0;
		int j = strarray.length - 1;
		while(i<j) {
			temp = strarray[i];
			strarray[i] = strarray[j];
			strarray[j] = temp;
			i++;
			j--;
		}
		String newString = new String(strarray);
		System.out.println(newString);
	}
}
