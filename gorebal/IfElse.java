package ravi.gorebal;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
	
		
		Scanner scan =  new Scanner(System.in);
		
		int n = scan.nextInt();
		
		System.out.println((n%2 != 0 || (n>=6 && n<=20))? "Weird" : "Not Weird");

	}

}
