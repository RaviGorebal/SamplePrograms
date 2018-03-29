package ravi.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//step1: convert from arrays to arraylist 
//step2: adding the elements in arraylist
//step: display the elements contains in arraylist
//

public class ArrayListTOArray {
	
	public static void main(String args[]){
		
		String str[] = {"ravi","kumar","ravikumargorebal"};
		
		List<String> list = new ArrayList<>(Arrays.asList(str));
		
		System.out.println(list);
		
		list.add("gorebal");
		System.out.println(list);
		for(String strloop:list){
			System.out.println(strloop);
			
		}
	}
}
