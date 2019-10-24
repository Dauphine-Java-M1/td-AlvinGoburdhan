package fr.dauphine.ja.goburdhanalvin.shapes;

public class Circle {
	private Point centre;
	private int rayon;

	public Circle(Point p, int rayon) {
		this.centre = p;
		this.rayon = rayon;
	}

	public String toString() {
		return "Circle [point=" + p + ", rayon=" + rayon + "]";
	}


	public Point getP() {
		return p;
	}
	
	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}
	
	
	public void translate(int dx,int dy) {
		this.centre = centre.translate(dx, dy);
	}


}
