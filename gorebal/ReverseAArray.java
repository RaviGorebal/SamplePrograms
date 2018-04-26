package ravi.SamplePrograms.gorebal;

import java.util.Arrays;

public class ReverseAArray {

	public static void main(String args[]){
		
	int ary[] = {101,102,103};
	
	int a[] =new int[ary.length];
	int j= 0;
	
	for(int i=a.length-1;i>=0;i--){
		
		int g = (int) ary[i];
		
		a[j]=g;
		j++;
	}
	System.out.println(Arrays.toString(a));	
	}
}
