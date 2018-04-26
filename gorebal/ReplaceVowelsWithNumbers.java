package ravi.SamplePrograms.gorebal;

import java.util.Scanner;

public class ReplaceVowelsWithNumbers {

	
	public static void main(String args[]){
		
		System.out.println("Enter a string:");
		  String str=new Scanner(System.in).nextLine(); 
		
		    
		System.out.printf(str.isEmpty()||str.trim().length()==0?"There is no any input!":
			                                             	 "The original string:  %s%nThe converted string: %s",str,
				                                                  str.replaceAll("a|A","4")
				                                                     .replaceAll("e|E","3")
				                                                     .replaceAll("i|I","1")
				                                                     .replaceAll("o|O","0")
				                                                     .replaceAll("u|U","7")); 
//		
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a string:");
//		String stra = scan.nextLine();
//		for(int i=0; i<stra.length(); i++){			
//			if(stra.length()==0){
//				System.out.println("There is no input:");				
//			} else { 				
//				      stra.replaceAll("a|A","1");
//					  stra.replaceAll("e|E","2");
//					  stra.replaceAll("i|I","3");
//				      stra.replaceAll("o|O","4");
//					  stra.replaceAll("u|U","5");
//				      System.out.println("string args:" + stra);
//			}
//		}
	}
}
