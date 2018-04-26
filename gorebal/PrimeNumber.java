package ravi.SamplePrograms.gorebal;

public class PrimeNumber {
	
	public static void main(String args[]){
		
		String primenumber = "";
		
		for(int i=1;i<=100;i++){
			
			int counter =0;
			
			for(int num=i;num>=1;num--){				
				if(i%num==0){				
				counter = counter + 1;
				}
			}
			
			if(counter == 2){
				primenumber = primenumber + i + " ";				
			}			
		}
		System.out.println("primenumber between 1 t 100 : ");
		System.out.println(primenumber);	
	}
}
