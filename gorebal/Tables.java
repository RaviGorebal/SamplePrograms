package ravi.gorebal;

import java.util.Scanner;

public class Tables {	
	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=1 ; i<=10 ; i++){
			System.out.println(String.format("%d = %d x %d",n * i, n, i));
			
		}
	}

}
