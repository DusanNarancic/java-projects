package objects.lesson6.task1.polymorphism;

public class Wind extends Instrument {

	
	public void play(String n)
	{
		System.out.println("Wind.play() "+n);
	}
	
	public String what()
	{
		return "Wind";
	}
	
	public void adjust()
	{
		
	}
}
