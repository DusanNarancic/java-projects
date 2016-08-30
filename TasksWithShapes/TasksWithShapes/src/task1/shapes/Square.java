package task1.shapes;

public class Square extends GeometricShape 
{
	long a;
	
	public Square(long aa)
	{
		a = aa;
	}
	
	public Square() {
		// TODO Auto-generated constructor stub
		
		type = "Square";
	}

	public Long perimeter()
	{
		return 4*a;
	}
	
	public void initializeVariables(long a1)
	{
		a = a1;
	}
}
