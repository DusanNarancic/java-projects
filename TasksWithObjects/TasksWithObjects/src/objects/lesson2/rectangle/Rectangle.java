package objects.lesson2.rectangle;

public class Rectangle {

	private double a;
	private double b;
	
	public void setA(double aa)
	{
		a = aa;
	}
	
	public double getA()
	{
		return a;
	}
	
	public void setB(double bb)
	{
		b = bb;
	}
	
	public double getB()
	{
		return b;
	}
	
	public double perimeter()
	{
		return 2*(a+b);
	}
	
	public double area()
	{
		return a*b;
	}

}
