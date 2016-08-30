package task1.shapes;

public class Triangle extends GeometricShape {

	long a;
	long b;
	long c;
	
	public Triangle(long aa, long bb, long cc)
	{
		a = aa;
		b = bb;
		c = cc;
	}
	
	public Triangle() {
		// TODO Auto-generated constructor stub
		
		type = "Triangle";
	}

	public Long perimeter()
	{
		return a+b+c;
	}
	
	public void initializeVariables(long a1, long b1, long c1)
	{
		a = a1;
		b = b1;
		c = c1;
	}
	
}
