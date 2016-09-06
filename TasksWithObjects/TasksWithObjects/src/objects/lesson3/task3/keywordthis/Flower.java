package objects.lesson3.task3.keywordthis;

public class Flower {

	int petalCount = 0;
	String f;
	
	public Flower(int petals)
	{
		petalCount = petals;
		System.out.println("Number of petals is: "+petals);
	}
	
	public Flower(String ff)
	{
		f = ff;
		System.out.println("The name of flower is "+ff);
	}
	
	public Flower(int petals,String ff)
	{
		this(petals);
		System.out.println("Constructor with two arguments ");
	}
	
	public Flower()
	{
		this(6,"tulip");
		System.out.println("Calling constructor from other constructor");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Flower f = new Flower();
	}

}
