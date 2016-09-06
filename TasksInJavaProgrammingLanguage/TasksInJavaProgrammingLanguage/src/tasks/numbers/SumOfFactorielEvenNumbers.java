package tasks.numbers;

import java.util.Scanner;

public class SumOfFactorielEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int i = 1;
		int p = 1;
		int s = 0;
		System.out.println("Factoriel of number: ");
		int n = input.nextInt();
		input.close();
		
		do{
			p = p * i;
			if(i % 2 == 0)
			{
				s = s + p;
			}
			i++;
		}while(i <= n);
		
		System.out.println("Sum of factoriel of even numbers: " + s);
	}

}
