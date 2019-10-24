package fr.dauphine.ja.goburdhanalvin.shapes;

import java.util.LinkedList;

public class LigneBrisée {
	private LinkedList<Point> ligne ;
	private int nbMax;
	
	public LigneBrisée(int nbMax) {
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
