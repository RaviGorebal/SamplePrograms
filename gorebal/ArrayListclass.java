package ravi.gorebal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListclass {
	
	public static void main(String args[]){
		
		List<String> list = new ArrayList();
		
		list.add("ravi");
		list.add("kumar");
        list.add("ravi");
        
        System.out.println(list);
        
        Set<String> set = new HashSet(list);
        
        for (String temp:set){
//        	System.out.println(temp);
        	
        	Collections.frequency(list, temp);
//        	   System.out.println(temp);
        	
        }
        
        System.out.println(set);
		
	}

}

// rebase testing
