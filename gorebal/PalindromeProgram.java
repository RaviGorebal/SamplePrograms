package ravi.SamplePrograms.gorebal;

import java.util.Scanner;

public class PalindromeProgram {
	public static void main(String args[]){
		
		String reverse = "";
//		String original;
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter a String : ");
		String original = scan.nextLine();
		
		int originalLength = original.length();
		
		for(int i=originalLength-1; i>=0; i--){			
			reverse = reverse + original.charAt(i);			
		}
		
//		System.out.println(reverse);
		if(reverse.equals(original)){			
			System.out.println("palindrome");			
		}else{
			System.out.println("NOt a palindrome");
		}
		
		
	}

}
