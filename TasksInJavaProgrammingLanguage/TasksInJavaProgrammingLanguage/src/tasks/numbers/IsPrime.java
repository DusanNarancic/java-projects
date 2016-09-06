package tasks.numbers;

import java.util.Scanner;

public class IsPrime{ 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please type integer number: ");
		int a = input.nextInt();
		int counter = 0;
		
		for(int i = 2; i < a; i++)
		{
			if(a % i == 0)
			{
				counter++;
			}
		}
		
		if(counter > 0)
		{
			System.out.println("Number isn't prime.");
		}
		else{
			System.out.println("Number is prime.");
		}
		
		input.close();
		
	}

}
