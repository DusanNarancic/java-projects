package tasks.numbers;


public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 30;
		int y = 10;
		System.out.println("Before swap: " + " x = " + x + " y = " + y);
		y = x + y;
		x = y - x;
		y = y - x;
		System.out.println("After swap: " + " x = " + x + " y = " + y);

	}

}
