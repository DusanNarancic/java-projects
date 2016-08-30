package task1.shapes;

import java.util.ArrayList;
import java.util.List;


public class Shape {

	public static void main(String[] args) 
	{
		Triangle t2 = new Triangle(1,2,3);
		Rectangle p2 = new Rectangle(2,3);
		Square k2 = new Square(4);
		Circle kr2 = new Circle(3);
		
		List<GeometricShape> listOfGeometricShapes = new ArrayList<GeometricShape>();
		listOfGeometricShapes.add(t2);
		listOfGeometricShapes.add(p2);
		listOfGeometricShapes.add(k2);
		listOfGeometricShapes.add(kr2);
		
		for(GeometricShape g : listOfGeometricShapes)
		{
			System.out.println(g.perimeter());
		}
		
		}
		
		 
	}

