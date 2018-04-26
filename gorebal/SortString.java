package ravi.SamplePrograms.gorebal;

import java.util.Arrays;

public class SortString {	
	public static void main(String args[]){
		String str = "RAVIravi";
		
		char chars[] = str.toCharArray();		
		Arrays.sort(chars);		
		String str1 = new String(chars);		
		System.out.println(str1);		
	}
}
