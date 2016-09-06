package tasks.arrays;

import java.util.Scanner;

public class ElementsHigherThenArithmeticMean {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insert number of elements in array: ");
		int numberOfElementsInArray = input.nextInt();
		int[] array1 = new int[numberOfElementsInArray];
		int sum = 0;
		double arithmeticMean = 0.0;
		
		for(int i = 0; i < numberOfElementsInArray;i++)
		{
			System.out.println("Insert elements in array:");
			array1[i] = input.nextInt();
		}
		
		for(int i = 0; i < array1.length;i++)
		{
			sum += array1[i];
		}
		
		arithmeticMean = sum / numberOfElementsInArray; 
		
		for(int i = 0; i < array1.length;i++)
		{
			if(array1[i] > arithmeticMean)
			{
				System.out.println(array1[i]);
			}
		}
		input.close();
		
	}
}
