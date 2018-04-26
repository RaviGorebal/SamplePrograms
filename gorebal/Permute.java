package ravi.SamplePrograms.gorebal;

public class Permute {
	
	public static void main(String args[]) {
		
		String str = "abc";
		
		int length = str.length();
		
		char ch[] = str.toCharArray();
		
		
		permute(ch,0);
	}
	
	static void permute(char[] a, int k ) {
		
		 if (k == a.length) 
	        {
	            for (int i = 0; i < a.length; i++) 
	            {
	                System.out.print(a[i]);
	            }
	            System.out.println();
	        } 
		 else 
	        {
	            for (int i = k; i < a.length; i++) 
	            {
	                char temp = a[k];
	                a[k] = a[i];
	                a[i] = temp;
	 
	                permute(a, k + 1);
	 
	                temp = a[k];
	                a[k] = a[i];
	                a[i] = temp;
	            }
	        }
	    }
		
	}


