package fr.dauphine.ja.goburdhanalvin.iterables;

import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;



public class Mult {

	/*public static List<Integer> mult(int coeff, List<Integer> listeEntier){
		
		List<Integer> res = new ArrayList<Integer>();
		
		for(int nombre : listeEntier) {
			res.add(nombre * coeff); 	
		}
		return res;
	}
	
	*/
	
	public static List<Integer> mult(final int coeff, final List<Integer> listeEntier){
		
			return new AbstractSequentialList<Integer>() {
			
			private int multi = coeff;
			private List<Integer> list = listeEntier;
			
			@Override
			public Integer get(int i) {
				return list.get(i)*multi;
			}

			@Override
			public int size() {
				return list.size();
			}
			
			@Override
			public ListIterator<Integer> listIterator(final int i) {
				return new ListIterator<Integer>() {
					private ListIterator<Integer> it = listeEntier.listIterator(); 
					
					public void add(Integer arg0) {
						// TODO Auto-generated method stub
						
					}

					public boolean hasNext() {	
						return it.hasNext();
					}

					public boolean hasPrevious() {
						return it.hasPrevious();
					}

					public Integer next() {
						return it.next()*coeff;
					}

					public int nextIndex() {
						// TODO Auto-generated method stub
						return 0;
					}

					public Integer previous() {
						return it.previous()*coeff;
					}

					public int previousIndex() {
						// TODO Auto-generated method stub
						return 0;
					}

					public void remove() {
						// TODO Auto-generated method stub
						
					}

					public void set(Integer arg0) {
						// TODO Auto-generated method stub
						
					}
				};	
			}
		};	
	}
}
