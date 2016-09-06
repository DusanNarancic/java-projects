package tasks.arrays;

public class ReturnElementsAndNumberOfThatElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] ar1 = {1,3,5,3,7,3,1,1,5};
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int firstElement = ar1[0];
		int secondElement = ar1[1];
		int thirdElement = ar1[2];
		int fourthElement = ar1[4];
		
		for(int i = 0; i < ar1.length; i++)
		{
			if(ar1[i].equals(firstElement))
			{
				count1++;
			}
			else if(ar1[i].equals(secondElement))
			{
				count2++;
			}
			else if(ar1[i].equals(thirdElement))
			{
				count3++;
			}
			else if(ar1[i].equals(fourthElement))
			{
				count4++;
			}
			
		}	
		

		System.out.println("1"+"("+count1+")");
		System.out.println("3"+"("+count2+")");
		System.out.println("5"+"("+count3+")");
		System.out.println("7"+"("+count4+")");
	}

}
