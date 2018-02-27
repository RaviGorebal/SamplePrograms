package ravi.gorebal;

import java.util.Scanner;

public class VerifyLetter {
	
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("program require a string:");
		String str=scan.nextLine();
		
		if(str.length()!=1){
			System.out.println("Need only one character:");
			System.exit(1);
		}
		
		char ch = str.charAt(0);
		
		if(Character.isUpperCase(ch)){
			System.out.println(str.charAt(0) +" uppercase letter");			
		}else if(Character.isLowerCase(ch)){
			
			System.out.println(str.charAt(0) +" lowercase letter");
		}else{			
			System.out.println("Enter a string");
		}
		
		
		
	}

}
