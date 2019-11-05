package Model;

import java.util.LinkedList;

public class Line extends Shape{
	private LinkedList<Point> ligne ;
	private int nbMax;
	
	public Line(int nbMax) {
		this.ligne = new LinkedList<Point>();
		this.setNbmax(nbMax);
	}

	public int getNbmax() {
		return nbMax;
	}

	public void setNbmax(int nbMax) {
		this.nbMax = nbMax;
	}
	
	public void add(Point p) {
		this.ligne.add(p);
	}
	
	public int pointCapacity() {
		return this.nbMax;
	}
	
	public int nbPoints(){
		return this.ligne.size();
	}
	
	public boolean contains(Point p1){
		
		for(Point p: this.ligne){
			if(p.isSameAs(p1)) {
				return true;
			}	
		}
		return false;
	}
}
