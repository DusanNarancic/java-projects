package tasks.numbers;

import java.util.Scanner;

public class SumOfFactorielOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int i = 1;
		int p = 1;
		int s = 0;
		
		System.out.println("Factoriel of number: ");
		int num = input.nextInt();
		input.close();
		do{
			p = p * i;
			if(i % 2 != 0)
			{
				s += p;
			}
			i++;
		}while(i <= num);
		
		System.out.println("Sum of factoriel of odd numbers: " + s);
		
		
		
	}

}
