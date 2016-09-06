package tasks.arrays;

import java.util.Scanner;

public class ProductOfEvenElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insert number of elements in array: ");
		int numberOfElementsInArray = input.nextInt();
		int[] array1 = new int[numberOfElementsInArray];
		
		for(int i = 0; i < numberOfElementsInArray; i++)
		{
			System.out.println("Insert elements in array: ");
			array1[i] = input.nextInt();
		}
		
		int p = 1;
		
		for(int i = 0; i < array1.length; i++)
		{
			if(array1[i] % 2 == 0)
			{
				p = p * array1[i];
			}
		}
		
		System.out.println("Product of even elements in array: " + p);
		
		input.close();
		
	}

}
