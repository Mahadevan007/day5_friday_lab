package day5_labbook;

import java.io.Console;
import java.util.Arrays;

public class InputAndDisplaYPassword {
	public static void main(String[] args) {
		Console cons = System.console();
		
		if(cons != null) {
			char[] password = null;
			
			try {
				password = cons.readPassword("Input your password");
				System.out.println("Your password : "+new String(password));
			} finally {
				if(password != null) {
					Arrays.fill(password, ' ');
				}
			} 
		} else {
			throw new RuntimeException("Can't get password...No console");
		}
	}
}
