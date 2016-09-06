package objects.lesson6.task1.polymorphism;

public class Brass extends Wind {

	public void play(String n)
	{
		System.out.println("Brass.play() "+n);
	}
	
	public String what()
	{
		return "Brass";
	}
	
	public void adjust()
	{
		System.out.println("Brass.adjust() ");
	}
}
