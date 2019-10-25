package fr.dauphine.ja.goburdhanalvin.shapes;

public class Circle {
	private Point centre;
	private double rayon;

	
	public Point getCentre(){	
		return this.centre;
	}
	
	public void setCentre(Point centre){
		this.centre = centre;
}
	
	public Circle(Point p, int rayon) {
		this.centre = p;
		this.rayon = rayon;
	}

	public Point getP() {
		return this.centre;
	}
	
	public double getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}
	
	public void translate(int dx,int dy) {
		this.centre = centre.translate(dx, dy);
	}
	

	public String toString() {
		return "Circle [point=" + centre + ", rayon=" + rayon + "]";
	}

	public double surface() {
		return Math.PI*this.rayon*this.rayon;
	}
	
	public static boolean contains(Point p, Circle...circles){
		for(Circle c : circles){
			if(c.contains(p)){
				return true;
			}
		}
		return false;
		
	}
	
	public boolean contains(Point p){
		if (this.centre.equals(p))
			return true;
		double x = this.centre.getX();
		double xp = p.getX();
		double y = this.centre.getY();
		double yp = p.getY();
		return (((xp-x)*(xp-x) + (yp-y)*(yp-y)) <= this.rayon);
}
	
	public static void main(String [] argv){
		
		Point p=new Point(1,2);
		Circle c=new Circle(p,1);
		Circle c2=new Circle(p,2);
		c2.translate(1,1);
		System.out.println(c+" "+c2);
		
	}
		
}
