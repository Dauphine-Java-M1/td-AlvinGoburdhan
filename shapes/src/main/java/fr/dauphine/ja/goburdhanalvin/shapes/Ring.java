package fr.dauphine.ja.goburdhanalvin.shapes;

public class Ring {
	
	private Circle centre ;
	private int rayon;
	private int rayonInterne;
	
	public Ring(){
		this.centre = new Circle(null, rayon);
		this.rayon = 0;
		this.rayonInterne = 0;
	}
	
	public Circle getCentre() {
		return this.centre;
	}
	
	public double getInternRadius(){
		return this.rayonInterne;
	}
	
	@Override
	public boolean equals(Object o){
		if (! (o instanceof Ring))
			return false;
		Ring r = (Ring) o;
		return this.rayonInterne == r.rayonInterne && this.centre.equals(r.centre);
	}

	@Override
	public String toString() {
		return "Ring [centre=" + centre + ", rayon=" + rayon + ", rayonInterne=" + rayonInterne + "]";
	}

	public boolean contains(Point p){
		if (! (this.centre.contains(p)))
			return false;
		
		Circle c = new Circle(this.centre.getCentre(), this.rayonInterne);
		if(! (c.contains(p)))
			return true;
		
		return false;
	}
	
	public boolean contains(Point p, Ring...rings){
		for(Ring r : rings){
			if(r.contains(p))
				return true;
		}
		return false;
	}
}
