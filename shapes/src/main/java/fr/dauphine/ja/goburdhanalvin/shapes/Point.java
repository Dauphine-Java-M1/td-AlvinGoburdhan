package fr.dauphine.ja.goburdhanalvin.shapes;

/**
 * Hello world!
 *
 */
public class Point 
{
	private int x;
	private int y;
	
	 public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	    
	    public Point(Point p) {
	    	this.x = p.getX();
	  		this.y = p.getY();
	  	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		
		return "Point [point x=" + x + ", point y=" + y + "]";
	}
	
	public boolean isSameAs(Point p1, Point p2) {
		
		if(p1.getX() == p2.getX() && p1.getY() == p2.getY())
			return true; 
		return false;
	}
	
	
	 
	public static void main( String[] args )
    {
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
		
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		
    }
}
