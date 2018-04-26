package ravi.SamplePrograms.gorebal;

import java.util.HashMap;
import java.util.Scanner;

public class FirstRepeatedandNonRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = scan.nextLine();		
		
		firstRepeatedandNonRepeatedChar(input);			
		}
		
	static void firstRepeatedandNonRepeatedChar(String inputString){
		
		       HashMap<Character,Integer>  charCountMap = new HashMap<>();	
		       
		       char strArr[]= inputString.toCharArray();
		       
		       for(char c : strArr) {
		    	    if(charCountMap.containsKey(c)) {
		    	    	
		    	    	charCountMap.put(c, charCountMap.get(c)+1);
		    	    	
		    	    } else {		    	    	
		    	    	charCountMap.put(c,1);
		    	    }
		    	   
		       }
		       
		       for(char c : strArr) {
		    	   
		    	   if(charCountMap.get(c) == 1){
		    		   System.out.println("Non repeated char: "+ inputString + " is: " + c );
		    		   break;
		    	   }
		       }
		       
		       for(char c : strArr) {
		    	   if(charCountMap.get(c)>1) {
		    		   
		    		   System.out.println("Repeated char is : " + inputString + " is: " + c );		  
		    		   break;
		    	   }
		    	   
		       }
		       
		       
	}

}
