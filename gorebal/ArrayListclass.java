package ravi.SamplePrograms.gorebal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

public class ArrayListclass {
	
	 static java.util.logging.Logger log = Logger.getLogger(ArrayListclass.class.getName());
	
	public static void main(String args[]){
		
		List<String> list = new ArrayList();
		
		list.add("ravi");
		list.add("kumar");
        list.add("ravi");
        list.add("ravi");
        list.add("ravi");
        list.add("ravi");
        list.add("ravi");
        
        System.out.println(list);
//        log.debug("Hello this is a debug message");
        log.info("Hello this is an info message");
    
       
        
        Set<String> set = new HashSet(list);
        
        for (String temp:set){
        	
        	System.out.println(temp + " contains are "+ Collections.frequency(list, temp));        	   
        }        
        System.out.println(set);		
	}
}


