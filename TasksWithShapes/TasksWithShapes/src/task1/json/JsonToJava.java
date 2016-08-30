package task1.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import task1.shapes.GeometricShape;
import task1.shapes.Circle;
import task1.shapes.Square;
import task1.shapes.Rectangle;
import task1.shapes.Triangle;


public class JsonToJava {

	private final static String jsonFilePath = "D:\\Shapes\\shapes2.json";		
	
	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		JSONParser jsonParser = new JSONParser();
		 
		 try{
			 FileReader fileReader = new FileReader(jsonFilePath);
			 
            JSONArray ar = (JSONArray) jsonParser.parse(fileReader);
         
          for(Object ar2 : ar)
          {
        	 
        	JSONObject json = (JSONObject)ar2;
   
        	GeometricShapeFactory gof = new GeometricShapeFactory();
        	  
        	GeometricShape g1 =  gof.createInstance(json.get("type").toString());
        	
        	System.out.println(g1.getType());
        	
      
        	if(g1.getType() == "Triangle")
        	{
        		JSONObject json1 = (JSONObject)json.get("data");
        		long a = (long)json1.get("a");
        		long b = (long)json1.get("b");
        		long c = (long)json1.get("c");
        		Triangle t2 = new Triangle();
        		t2.initializeVariables(a, b, c);
        		System.out.println(t2.perimeter());
        	}
        	
        	else if(g1.getType() == "Rectangle")
        	{
        		JSONObject json4 = (JSONObject) json.get("data");
        		long a = (long) json4.get("a");
        		long b = (long) json4.get("b");
        		Rectangle p2 = new Rectangle();
        		p2.initializeVariables(a, b);
        		System.out.println(p2.perimeter());
        	}
        	
        	else if(g1.getType() == "Square")
        	{
        		JSONObject json2 = (JSONObject) json.get("data");
        		long a = (long)json2.get("a");
        		Square k2 = new Square();
        		k2.initializeVariables(a);
        		System.out.println(k2.perimeter());
        	}
        	
        	else if(g1.getType() == "Circle")
        	{
        		JSONObject json3 = (JSONObject) json.get("data");
        		long r = (long) json3.get("r");
        		Circle kr2 = new Circle();
        		kr2.initializeVariables(r);
        		System.out.println(kr2.perimeter());
        	}
       
        
          }
         
		 }
		 catch(FileNotFoundException fnfe)
		 {
			 fnfe.printStackTrace();
		 }
		 catch (IOException e) 
		 {
			 
	         e.printStackTrace();
	     }
		 catch (ParseException e) 
		 {
	            e.printStackTrace();
	     }

		  
		  

		
	}

}
