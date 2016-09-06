package objects.lesson4.controlOfAccess.task2;

public class Frappe {

	private Frappe()
	{
		System.out.println("Frappe");
	}
	
	public static Frappe makeFrappe()
	{
		return new Frappe();
	}
}
