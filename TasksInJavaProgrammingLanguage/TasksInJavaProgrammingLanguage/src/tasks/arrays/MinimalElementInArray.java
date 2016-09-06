package tasks.arrays;

public class MinimalElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = {22,7,43,84,3};
		int min = 99;
		
		for(int i = 0; i < array1.length; i++)
		{
			if(min > array1[i])
			{
				min = array1[i];
			}
		}
		
		System.out.println("Minimal value in array is: " +min);
		
	}

}
