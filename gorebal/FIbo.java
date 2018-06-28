package ravi.gorebal;

import java.util.Scanner;

public class FIbo {
	public static void main(String[] args) {
		
		int fib3, fib1=0, fib2=1; 

           Scanner scan = new Scanner(System.in);
           
           System.out.println("Enter a value :");
       
           int value = scan.nextInt();
           System.out.print(fib1 +" "+ fib2 + " ");		
           for(int i=0; i<value; i++){
        	  fib3 = fib1 + fib2; 
        	  System.out.print(fib3 + " ");
        	
        	  fib1 = fib2;
        	  fib2 = fib3;
        	
           }
       
        
           
	}

}
