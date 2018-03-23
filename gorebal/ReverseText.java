
package ravi.gorebal;


public class ReverseText{
	public static void main(String args[]) {		    
		  	
		  	String s3="ravi is good boy";

		  	String s4[]=s3.split(" ");
		  	for(int i=0; i<=s4.length-1; i++)
		  	{
		  		String reverse = "";
		  		 	for(int j=s4[i].length()-1;j>=0;j--){
		  		 		
		  		 		char a = s4[i].charAt(j);		  		 		
		  		 		reverse  = reverse + a;		  		 		
		  		 	} 
		  		 	
		  		 	System.out.print(reverse +" ");	
		  	}		  	
		   }          
	   }