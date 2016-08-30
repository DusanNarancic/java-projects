package task1.shapes;

public abstract class GeometricShape {

	protected String type;
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String getType()
	{
		return type;
	}
	
	public Object perimeter()
	{
		return 0;
	}
	
	public void initializeVariables()
	{
		
	}
}
