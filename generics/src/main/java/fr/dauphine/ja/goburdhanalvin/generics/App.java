package fr.dauphine.ja.goburdhanalvin.generics;

import java.util.ArrayList;
import java.util.List;

public class App 
{	
	//ex1
	public static <T extends Comparable<T>> T myMax (T t, T ... ts ){
		T max = t;
		for (T obj : ts) {
			if(max.compareTo(obj)<0) max = obj;
		}
		return max;
	}
	
	//ex2
	
	private static void print(List<?> list) {
		for(Object o:list)System.out.println(o);
	}
	
	private static void print1 (List <? extends CharSequence> list) {
		
		List<Integer> l = new ArrayList<Integer>();
	
		for(CharSequence o : list) {
			l.add(o.length());
		}
		print(l);
	}
	
	//ex 3 
	
	public static List<Integer> listLength(List <?>list) {
		ArrayList<Integer> length = new ArrayList<Integer>();
		for (int i=0; i<list.size();i++) {
			CharSequence seq= (CharSequence)list.get(i);
			length.add(seq.length());
		}
		return length;
	}

	
    public static void main( String[] args )
    {
    	
    	System.out.println(myMax(42,1664)); //1664
    	System.out.println(myMax(2014,86,13)); //2014
   
    }
}
