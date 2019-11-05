package Model;

/**
 * 
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
	
	public boolean isSameAs(Point p) {
		
		if(this.x == p.getX() && this.y == p.getY())
			return true; 
		return false;
	}
	
	public Point translate(int dx,int dy) {
		
		return new Point(dy,dx);
	}
	
	public static void main( String[] args )
    {
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
		
		System.out.println(p1.isSameAs(p3));			
    }
}
