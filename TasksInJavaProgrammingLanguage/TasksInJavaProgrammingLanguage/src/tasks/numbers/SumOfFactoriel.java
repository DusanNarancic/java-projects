package tasks.numbers;

import java.util.Scanner;

public class SumOfFactoriel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int n;
		int i = 1;
		double s = 0;
		double p = 1;
		
		System.out.println("Factoriel of number:");
		n = input.nextInt();
		input.close();
		do{
			p = p * i;
			s += p;
			i++;
		}while(i <= n);
			System.out.println("Sum of factoriel: "+s);
		
		
		
	}

}
