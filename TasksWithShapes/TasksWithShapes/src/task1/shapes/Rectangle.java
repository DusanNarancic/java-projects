package task1.shapes;

public class Rectangle extends Square {
	
	long b1;
	
	public Rectangle(long aa1, long bb1)
	{
		super(aa1);
		a = aa1;
		b1 = bb1;
	}
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
		type = "Rectangle";
	}

	public Long perimeter()
	{
		return 2*(a+b1);
	}
	
	public void initializeVariables(long a2,long b2)
	{
		a = a2;
		b1 = b2;
	}
}
