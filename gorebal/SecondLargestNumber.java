package ravi.gorebal;

public class SecondLargestNumber {	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,9,8};
		int b[] = {65,98,646,456,123,4789};
		
		
		System.out.println("Second largest : " + secondLargest(a,8));
		System.out.println("Second largest : " + secondLargest(b,6));
	

	}
	
	public static int secondLargest(int a[], int total){
		int temp;
		
		for(int i=0; i<total; i++){
			for(int j=i+1; j<total; j++){
				
				if(a[i] > a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}				
			}
		}
		
		return a[total-2];
		
	}

}
