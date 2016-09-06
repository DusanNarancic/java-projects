package tasks.arrays;

public class Fibbonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int febCount = 15;
		int[] feb = new int[15];
		feb[0] = 1;
		feb[1] = 2;
		
		for(int i = 2; i < febCount; i++)
		{
			feb[i] = feb[i-1] + feb[i-2];
		}
		
		for(int i = 0; i < febCount; i++)
		{
			System.out.println(feb[i] + " ");
		}
		
	}

}
