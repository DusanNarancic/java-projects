package objects.lesson6.task1.polymorphism;

public abstract class Instrument {

	private int i;
	public abstract void play(String n);
	
	public String what()
	{
		return "Instrument";
	}
	
	public abstract void adjust();
	
}
