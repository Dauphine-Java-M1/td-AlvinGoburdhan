package Model;

import java.util.ArrayList;
import java.util.Observable;

import view.MyDisplay;

public class World extends Observable{
	
	private ArrayList<Shape> shapes;

	public void addObserver(Shape s) {
		
		shapes.add(s);
	}
	
	public World(){
		this.addObserver(MyDisplay);
		
	}
	
}
