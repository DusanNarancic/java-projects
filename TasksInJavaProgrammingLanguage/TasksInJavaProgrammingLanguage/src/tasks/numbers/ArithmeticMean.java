					package tasks.numbers;

public class ArithmeticMean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum  = 0;
		int counter = 0;
		int arithmeticMean = 0;
		
		for(int i = 1; i <= 5; i++)
		{
			sum += i;
			counter++;
		}
		
		arithmeticMean = sum / counter;
		
		System.out.println("Arithmetic mean: " + arithmeticMean);
	}

}
