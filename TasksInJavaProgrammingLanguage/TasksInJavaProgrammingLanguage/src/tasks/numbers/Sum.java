package tasks.numbers;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar1 = {3,4,5,6};
		int sum = 0;
		
		for(int i = 0; i < ar1.length; i++)
		{
			sum += ar1[i];
		}
		
		System.out.println("Sum of numbers in array ar1: " + sum);
	}

}
