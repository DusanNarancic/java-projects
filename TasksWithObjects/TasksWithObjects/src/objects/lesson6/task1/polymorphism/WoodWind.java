package objects.lesson6.task1.polymorphism;

public class WoodWind extends Wind {

	public void play(String n)
	{
		System.out.println("WoodWind.play() "+n);
	}
	
	public String what()
	{
		return "WoodWind";
	}
	
	public void adjust()
	{
		
	}
	
}
