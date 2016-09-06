package tasks.arrays;

public class CommonElementsInTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1 = {1,3,5,6,9};
		int[] a2 = {2,4,8,5,11,3};
		
		for(int i = 0; i < a1.length; i++)
		{
			for(int j = 0; j < a2.length; j++)
			{
				if(a1[i] ==  a2[j])
				{
					System.out.println("Common element in both arrays: " +a1[i]);
				}
			}
		}
		
	}

}
