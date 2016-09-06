package objects.lesson2.square;

public class Square {

	private double a;
	
	public void setA(double aa)
	{
		a = aa;
	}
	
	public double getA()
	{
		return a;
	}
	
	public double perimeter()
	{
		return 4*a;
	}
	
	public double area()
	{
		return a*a;
	}

}
