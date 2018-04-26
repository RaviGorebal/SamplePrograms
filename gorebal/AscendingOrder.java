package ravi.SamplePrograms.gorebal;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		        int n, temp;
		        Scanner s = new Scanner(System.in);
		        System.out.println("Enter elements :");
		        n = s.nextInt();
		        int a[] = new int[n];
		        
		        Arrays.sort(a);
		        
		        System.out.println("Sotred array:"+ Arrays.toString(a));
//		        System.out.println("Enter all the elements:");
//		        for (int i = 0; i < n; i++) 
//		        {
//		            a[i] = s.nextInt();
//		        }
//		        for (int i = 0; i < n; i++) 
//		        {
//		            for (int j = i + 1; j < n; j++) 
//		            {
//		                if (a[i] > a[j]) 
//		                {
//		                    temp = a[i];
//		                    a[i] = a[j];
//		                    a[j] = temp;
//		                    System.out.print(a[i] + ",");
//		                }
//		            }
//		            
//		        }
//		        System.out.print("Ascending Order:");
//		        for (int i = 0; i < n - 1; i++) 
//		        {
		          
//		        }
//		        System.out.print(a[n - 1]);
		    }
		
	}


