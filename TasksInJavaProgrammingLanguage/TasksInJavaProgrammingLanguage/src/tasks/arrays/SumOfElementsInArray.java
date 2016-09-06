package tasks.arrays;

import java.util.Scanner;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Insert number of elements in array: ");
		int numberOfElements = input.nextInt();
		int[] array1 = new int[numberOfElements];
		int sum = 0;
		
		for(int i = 0; i < numberOfElements; i++)
		{
			System.out.println("Insert elements in array: ");
			array1[i] = input.nextInt();
		}
		
		for(int i = 0; i < array1.length; i++)
		{
			sum += array1[i];
		}
		
		System.out.println("Sum of elements in array is: " + sum);
		
		input.close();
		
	}

}
