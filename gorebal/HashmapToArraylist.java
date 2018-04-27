package ravi.SamplePrograms.gorebal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapToArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("ravi1", 3000);		
		map.put("ravi2", 4000);
		map.put("ravi3", 5000);
		map.put("ravi4", 6000);
		map.put("ravi5", 7000);
		map.put("ravi6", 8000);
		map.put("ravi7", 9000);
		
		System.out.println("Hashmap contents are : " + map);
		
		Set<String> keyset = map.keySet();
		
		ArrayList<String>  list = new ArrayList<String>(keyset);
		
		for(String keys : list) {
			
			System.out.println("keys are : " + keys);
			System.out.println();
		}
		
		// Iterating only values 
		System.out.println("ITERATING ONLY VALUES");		
		System.out.println();
		
		Collection<Integer> values = map.values();
		
		ArrayList<Integer> listvalues = new ArrayList<>(values);
		
		for(int loopvalues : listvalues) {
			
			System.out.println("values are : " + loopvalues);
			System.out.println();
		}
		
		System.out.println("Iterating both keys and values ");
		System.out.println();
	   
		
		Set<Entry<String, Integer>> keyvalues1 = map.entrySet();
		
		ArrayList<Entry<String,Integer>> keyvalues = new ArrayList<Entry<String,Integer>>(keyvalues1);
		
		for(Entry<String,Integer> entry:keyvalues) {
			
			System.out.println("keys : " + entry.getKey() + " , " +  "values : " + entry.getValue());
		}
	}

}
