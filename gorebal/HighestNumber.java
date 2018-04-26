package ravi.SamplePrograms.gorebal;

import java.util.Scanner;

/********************************
 *          CHALLENGE :         *
 ********************************/
/**
 * Show the greatest number among 
 * three numbers. 
 *
 * Input three number from user 
 * and compare these number with 
 * each others and find largest 
 * number among these three numbers.
 *
 * Any programming language accepted.
  */

public class HighestNumber {	
	
	    public static void main(String[] args) {
	        System.out.println("*** Largest of Three Numbers ****\n");
	        Scanner in = new Scanner(System.in); 
	        /*
	         * Enter three numbers
	         * with space between :
	          */
	        int num1 = in.nextInt();
	        int num2 = in.nextInt(); 
	        int num3 = in.nextInt();
	        
	        if(num1 >= num2) {     
	            if(num1 >= num3) 
	                System.out.println(num1 +" is the largest number."); 
	            else     
	                System.out.println(num3 +" is the largest number."); 
	        } else {     
	            if(num2 >= num3) 
	                System.out.println(num2 +" is the largest number.");          
	            else 
	                System.out.println(num3 +" is the largest number.");
	        }
	    }
	}



