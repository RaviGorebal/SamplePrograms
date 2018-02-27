package ravi.gorebal;

import java.util.Scanner;

public class RecursiveNumberReverse {	
	
	    public static void main(String[] args) 
	    {
	        //Reverse a Number Using Recursion
	        Scanner sc=new Scanner(System.in);
	        int num=0;
	        System.out.println("Enter a Numbr:");
	        //Enter a Number and Press Submit
	        num=sc.nextInt();
	        
	        System.out.print("Reversed number: ");
	        reverseMethod(num);
	    }
	    //A method for reverse
	    public static void reverseMethod(int num) 
	    {
	        if(num<10)
	        {
	            System.out.println(num);
	            return;
	        }
	        else
	        {
	            System.out.print(num%10);
	            //Method is calling itself:
	            //recursion
	            reverseMethod(num/10);
	        }
	    }
	}



