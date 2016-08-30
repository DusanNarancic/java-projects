package task1.shapes;

public class Circle extends GeometricShape
{
	private long r;
	
	public Circle(long rr)
	{
		r = rr;
	}
	
	public Circle() {
		// TODO Auto-generated constructor stub
		
		type = "Circle";
	}

	public Double perimeter()
	{
		return 2*r*3.14;
	}
	
	public void initializeVariables(long r1)
	{
		r = r1;
	}
}
