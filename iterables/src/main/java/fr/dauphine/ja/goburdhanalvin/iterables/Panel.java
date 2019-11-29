package fr.dauphine.ja.goburdhanalvin.iterables;

import java.util.AbstractList;
import java.util.Iterator;


/**
 * Hello world!
 *
 */
public class Panel extends AbstractList
{
	private int fin;
	private int deb;
	
	public Panel(int deb, int fin) {
		this.deb = deb;
		this.fin = fin;
	}
	
	/*private static Iterator<Integer> panel1(int i, int j) {
		
		/*HashSet<Integer> tri = new HashSet<Integer>();
		for(; i <= j; i++) 
			tri.add(i);
		
		Iterator<Integer> it = tri.iterator();
		return it;
	}
	
	* private static Iterable<Integer> panel1(int i, int j) {
	*/
		
	public static Iterator<Integer> panel(final int i, final int j)
	{
		return new Iterator<Integer>() {
			private int position = i;
			
			public boolean hasNext()
			{
				if(position <= j){ 
					return true;
				}
				else return false;
			}

			public Integer next() {
				if (this.hasNext()) {
					return position++;
				};
				return null;
			}
		};

	}
	
	@Override
	public Integer get(int i) {
		if(deb + i > fin) 
			throw new IndexOutOfBoundsException();
		return this.deb+i;
	}
 
	@Override
	public int size() {
		return fin-deb+1;
	}
	

	
   /* public static void main( String[] args ) {
   	
    	Iterator<Integer> it=panel(1,5);
    	for(;it.hasNext();)
    	System.out.println(it.next()); // affiche 1 2 3 4 5
    	
    //	for(int i:panel2(1,5))
    //		System.out.println(i); // affiche 1 2 3 4 5
    }
    
    */
}