package objects.lesson3.task4.orderofinitilization;

public class House {

	Window w1 = new Window(22);
	
	public House()
	{
		System.out.println("House");
		Window w2 = new Window(23);
	}
	
	Window w3 = new Window(34);
	
}
