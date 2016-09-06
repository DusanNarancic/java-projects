package tasks.strings;

public class NumberOfCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "AABBCCCDDDD";
		
		int numberOfCharacterA = 0;
		int numberOfCharacterB = 0;
		int numberOfCharacterC = 0;
		int numberOfCharacterD = 0;
		
		for(int i = 0; i < str1.length(); i++)
		{	
		char c = str1.charAt(i);
		
			switch(c)
			{
			case 'A':
				numberOfCharacterA++;
				break;
			case 'B':
				numberOfCharacterB++;
				break;
			case 'C':
				numberOfCharacterC++;
				break;
			case 'D':
				numberOfCharacterD++;
				break;
			}
		}
		
		System.out.println("Number of character A: " + numberOfCharacterA);
		System.out.println("Number of character B: " + numberOfCharacterB);
		System.out.println("Number of character C: " + numberOfCharacterC);
		System.out.println("Number of character D: " + numberOfCharacterD);
	}

}
