package ravi.gorebal;

import java.util.Scanner;

public class SumOfGivenInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int sum=0;
		int reminder;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Eneter a number:");
		number = scan.nextInt();
		
		while(number>0) {
			reminder = number%10;
			 sum = sum + reminder;
			 number = number/10;			
		}
		
		System.out.println("sum of digits: " + sum);
		System.out.println("Enter all the elements:");
       
		int a[] = new int[number];
		int temp;
		
		 for (int i = 0; i < number; i++) 
	        {
	            a[i] = scan.nextInt();
	        }
		 for (int i = 0; i < number; i++) 
	        {
	            for (int j = i + 1; j < number; j++) 
	            {
	                if (a[i] > a[j]) 
	                {
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }

		 
		 System.out.print("Ascending Order:");
	        for (int i = 0; i < number - 1; i++) 
	        {
	            System.out.print(a[i] + ",");
	        }
	        System.out.print(a[number - 1]);
	    
	}

}
