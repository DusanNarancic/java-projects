package tasks.arrays;

import java.util.Scanner;

public class SumOfEvenElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.println("Insert number of elements in array: ");
		int n = input.nextInt();
		int[] ar = new int[n];
		
		for(int i = 0; i < ar.length; i++)
		{
			System.out.println("Insert elements in array: ");
			ar[i] = input.nextInt();
		}
		
		for(int i = 0; i < ar.length; i++)
		{
			if(ar[i] % 2 == 0)
			{
				sum += ar[i];
			}
		}
		
		System.out.println("Sum of elements with even value is: " + sum);
		input.close();
		
	}

}
