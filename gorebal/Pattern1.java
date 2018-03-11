package ravi.gorebal;

public class Pattern1 {

	public static void main(String args[]){
		int n=5;
		pattern(n);
	}

	public static void pattern(int n){
		int i;
		int k = 2*n-2;
		
		for(i=0; i<=n;i++){
			
			for(int j=0;j<k;j++){
				
				System.out.print(" ");				
						
			}
			k = k-1;
			
			for(int j=0;j<=i;j++){
				System.out.print("* ");		
				
			}
			System.out.println();			
		}
	}
}


// ravi chnages
