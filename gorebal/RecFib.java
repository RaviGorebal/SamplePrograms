package ravi.gorebal;

import java.util.Scanner;

public class RecFib {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Value : ");
		int n = scan.nextInt();
		
		for(int i=0;i<n;i++){
			System.out.println("Faibonaccci series are : " + fibRec(i));
		}
	}
		static int fibRec(int n){
			
			if(n==0)
				return 0;
			else if (n==1)
				return 1;
			else 
				return fibRec(n-1) + fibRec(n-2);
		}
		


	

	

}
