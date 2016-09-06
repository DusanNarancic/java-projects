package objects.lesson2.rectangle;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rec = new Rectangle();
		
		rec.setA(3.0);
		rec.setB(4.0);
		System.out.println("Rectangle perimeter is: "+rec.perimeter());
		System.out.println("Rectangle area is: "+rec.area());
		
	}

}
