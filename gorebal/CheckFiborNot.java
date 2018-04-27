package ravi.SamplePrograms.gorebal;

import java.util.Scanner;

public class CheckFiborNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter a Number:");
		int inputString = scan.nextInt();
		
		int fib1 = 0;
		int fib2 = 1;
		int fib3 = 0;
                while(fib3 < inputString) {
                	
                	fib3 = fib1 + fib2;
                	fib1=fib2;
                	fib2=fib3;
                	
                	System.out.println("Fibonacci are : " + fib3);
                }
                
                if(fib3 == inputString) {
                    System.out.println("yes,number belong to fibonacci series. : " + inputString);                	
                } else {
                	System.out.println("No,number does not belongs to fibonacci  series: " + inputString);
                }
	}

}
