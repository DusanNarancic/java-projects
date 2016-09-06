package objects.lesson6.task1.polymorphism;

public class Percussion extends Instrument {

	public void play(String n)
	{
		System.out.println("Percussion.play() "+n);
	}
	
	public String what()
	{
		return "Percussion";
	}
	
	public void adjust()
	{
		
	}
}
