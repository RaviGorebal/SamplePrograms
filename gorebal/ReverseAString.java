package ravi.gorebal;

public class ReverseAString {
	
	 public static void main(String[] args)
	 {
	     String input = "my name is ravi";
	     char[] temparray = input.toCharArray();
	     int left, right=0;
	     right = temparray.length-1;

	     for (left=0; left < right ; left++ ,right--)
	     {
	         // Swap values of left and right
	         char temp = temparray[left];
	         temparray[right] = temparray[left];
	         temparray[left]=temp;
	         for (char c : temparray)
		         System.out.print(c); 	     
		     System.out.println();
	     }

	     
	 }
	}


