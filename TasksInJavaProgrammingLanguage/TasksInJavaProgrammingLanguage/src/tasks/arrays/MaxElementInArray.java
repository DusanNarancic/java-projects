package tasks.arrays;

import java.util.Scanner;

public class MaxElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Insert number of elements in array: ");
		int num = input.nextInt();
		int[] arr = new int[num];
		int max = 0;
		
		for(int i = 0; i < num; i++)
		{
			System.out.println("Insert elements in array: ");
			arr[i] = input.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		
		System.out.println("Max element in array: " + max);
		
		input.close();
		
	}

}
