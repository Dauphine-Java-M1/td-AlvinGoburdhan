package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import view.MyDisplay;

public class World extends Observable{
	
	private static ArrayList<Shape> shapes = new ArrayList<Shape>();;

	public void addObserver(Shape s) {
		
		shapes.add(s);
	}
		
	public static List<Shape> getShapeList(){
		return shapes;
}
	
	
}
