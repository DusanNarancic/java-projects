package task1.json;

import task1.shapes.GeometricShape;
import task1.shapes.Circle;
import task1.shapes.Square;
import task1.shapes.Rectangle;
import task1.shapes.Triangle;

public class GeometricShapeFactory {

	public GeometricShape createInstance(String typeOfGeometricShape)
	{	
		switch(typeOfGeometricShape)
		{
		case "square":
			return new Square();
		case "rectangle":
			return new Rectangle();
		case "circle":
			return new Circle();
		case "triangle":
			return new Triangle();
		default:
			return null;
		}
	}

}
