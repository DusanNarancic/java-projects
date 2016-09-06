package objects.lesson6.task1.polymorphism;

public class Music {

	static void tune(Instrument i)
	{
		i.play("MIDDLE_C");
	}
	
	static void tuneAll(Instrument[] e)
	{
		for(Instrument i: e)
		{
			tune(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instrument [] orchestra =
			{
				new Percussion(),
				new Wind(),
				new Brass(),
				new WoodWind()
			};
		
		tuneAll(orchestra);
		
	}

}
