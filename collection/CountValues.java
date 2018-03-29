package ravi.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountValues {
	
	public static void main(String args[]){		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(6);
		System.out.println("List contains elements are : " + list);
		
		Set<Integer> set = new HashSet<Integer>(list);
		
		for(int x:set){
			int count=0;
			for(int y:list){
				if(x==y){
					count++;					
				}				
			}			
			System.out.println("Num is " + x + " collection is : " + count );
		}		
	}
}
