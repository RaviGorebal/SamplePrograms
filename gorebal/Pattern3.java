package ravi.gorebal;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i , j , k = 2*n-2;
		
		for (i=0; i<n; i++) {
			
			for(j=0; j<k; j++) {
				System.out.print(" ");
			}
			
			k = k-1;
			
			for(j=0;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}
