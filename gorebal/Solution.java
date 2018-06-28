package ravi.gorebal;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = {2,3,4,5};// TODO Auto-generated method stub
        System.out.println("" + findNumber(a,5));
	}
	
	 static String findNumber(int[] arr, int k) {
	       
		 String rtn = "";
	        for(int i=0; i<arr.length;i++){
	            
	               if(arr[i] == k){
	                   rtn = "YES";
	               } else {
	                  rtn = "NO";
	               }       
	             
	        }
			return rtn;
	       
	    }

}
