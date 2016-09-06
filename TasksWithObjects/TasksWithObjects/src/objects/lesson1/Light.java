package objects.lesson1;

public class Light {

	private boolean turnedOn;
	private int intensity;
	
	public Light()
	{
		turnedOn = false;
		intensity = 0;
	}
	
	public boolean off()
	{
		intensity = 0;
		turnedOn = false;
		return turnedOn;
	}
	
	public boolean on()
	{
		intensity = 50;
		turnedOn = true;
		return turnedOn;
	}
	
	public int bright()
	{
		if(turnedOn == false)
		{
			turnedOn = true;
		}
		if(intensity < 100)
		{
			intensity += 10;
		}
		
		return intensity;
	}
	
	public int dim()
	{
		if(intensity > 0)
			intensity -= 10;
		if(intensity == 0)
			turnedOn = false;
		return intensity;
	}
	
	public String toString()
	{
		return "Turned on: " + turnedOn+
				"intensity: "+intensity;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Light l = new Light();
		System.out.println(l);
		l.on();
		System.out.println(l);
		l.bright();
		System.out.println(l);
		l.bright();
		System.out.println(l);
		l.dim();
		System.out.println(l);
		l.off();
		System.out.println(l);
		
		
	}

}
