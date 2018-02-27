package ravi.gorebal;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesUsingLInkedHashSet {
	
	private static final String Integer = null;

	public static void main(String args[]){
	
	
	List<String> al = new ArrayList<>();
	al.add("a");
	al.add("b");
	al.add("a");
	al.add("b");
	al.add("c");
	al.add("c");
	al.add("a");
	System.out.println("values contained in ArrayList: " + al);
	// add elements to al, including duplicates
	Set<String> hs = new LinkedHashSet();
	hs.addAll(al);
	System.out.println("Linked hashset values: " + hs);
	al.clear();
	System.out.println("cleared all values");
	al.addAll(hs);
	System.out.println("Without duplicates values in arraylist:"+al);
	
	
	
	
	}

}
