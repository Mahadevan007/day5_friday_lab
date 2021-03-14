package day5_labbook;

public class LettersSpacesNumbersAndOtherCharacters {
	public static void main(String[] args) {
		String newString = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		
		char[] strarray = newString.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		
		for(int i=0;i<strarray.length;i++) {
			if(Character.isLetter(strarray[i])) {
				letter++;
			}else if(Character.isDigit(strarray[i])) {
				num++;
			}else if(Character.isSpaceChar(strarray[i])) {
				space++;
			}else {
				other++;
			}
		}
		
		System.out.println("String : "+newString);
		System.out.println("letters : "+letter);
		System.out.println("Space :"+space);
		System.out.println("Numbers :"+num);
		System.out.println("Other :"+other);
	}
}
