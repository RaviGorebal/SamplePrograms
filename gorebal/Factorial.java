package ravi.gorebal;

public class Factorial {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial factorial = new Factorial();
		System.out.println(factorial.fact(4));

	}
	
	public static int fact(int n){
		int factorial1=1;
		for(int i=1; i<=n; i++){
			factorial1 = factorial1 * i;			
		}		
		return factorial1;
		
	}

}
