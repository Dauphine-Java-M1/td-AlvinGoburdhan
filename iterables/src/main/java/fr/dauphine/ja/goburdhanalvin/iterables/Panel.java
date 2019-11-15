package fr.dauphine.ja.goburdhanalvin.iterables;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Hello world!
 *
 */
public class Panel 
{
	
	/*private static Iterator<Integer> panel1(int i, int j) {
		
		/*HashSet<Integer> tri = new HashSet<Integer>();
		for(; i <= j; i++) 
			tri.add(i);
		
		Iterator<Integer> it = tri.iterator();
		return it;
	}*/
		
	public static Iterator<Integer> panel1(final int i, final int j)
	{
		
		Iterator<Integer> it = new Iterator<Integer>()
		{
			int value = i;
			
			public boolean hasNext()
			{
				if(value <= j){ 
					return true;
				}
				else return false;
			}

			public Integer next()
			{
				int var = value;
				value++;
				return var;
			}
		};
		return it;
	}
	
	public static Iterator<Integer> panel2(int i, int j) {
	//TODO
	}
	
	
    public static void main( String[] args ) {
   	
    	Iterator<Integer> it=panel1(1,5);
    	for(;it.hasNext();)
    	System.out.println(it.next()); // affiche 1 2 3 4 5
    	
    	for(int i:panel2(1,5))
    		System.out.println(i); // affiche 1 2 3 4 5
    }
}