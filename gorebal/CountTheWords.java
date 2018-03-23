package ravi.gorebal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CountTheWords {
	
	public static void main(String args[]){
		
		String str = "This is a Apple This is a Orange";
		
		String strarray[] = str.split(" ");		
		
		List<String> list = Arrays.asList(str.split(" "));
		
		Set<String>  set = new LinkedHashSet<>(list);
		
		for(String word: set){
			
			 System.out.println(word + ": " + Collections.frequency(list, word) + " times");
			
			
		}
	
	}

}
