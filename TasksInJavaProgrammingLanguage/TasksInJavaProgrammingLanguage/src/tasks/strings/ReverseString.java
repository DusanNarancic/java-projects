package tasks.strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String b = "AABBCCDD";
		
		for(int i = b.length()-1; i >= 0; i--)
		{
			char c = b.charAt(i);
			System.out.println(c);
		}
		
	}

}
