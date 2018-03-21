package ravi.gorebal;

import java.util.Scanner;

public class FiboRecursive {
	
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("pls enter a value");
		int n = scan.nextInt();
		
		for(int i=0;i<n;i++){			
			System.out.println("fibonacci series are : " + fibRecursive(i));			
		}
	}
		
		static int fibRecursive(int n){			
			if(n==0)
				return 0;
			else if(n==1)
				return 1;
			else
				return fibRecursive(n-1) + fibRecursive(n-2);			
		}
		
	}


