package ravi.gorebal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDup {
	
	public static void main(String args[]){
		
		List<String> al = new ArrayList<>();
		
		al.add("ravi");
		al.add("ravi");
		al.add("ravi");
		
		Set<String> set = new HashSet<>(al);
		
		for(String loop : set){
			
			System.out.println(loop +" : "+ Collections.frequency(al, loop));
			
			
		}
		
		
		
	}

}
