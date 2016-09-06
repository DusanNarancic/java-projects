package objects.lesson5.task2.constructorwitharguments;

public class Chess extends BoardGame {

	public Chess(int i)
	{
		super(34);
		System.out.println("Chess("+i+")");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chess c = new Chess(23);
	}

}
