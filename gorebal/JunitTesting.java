package ravi.SamplePrograms.gorebal;

public class JunitTesting {
	
	public int square(int x){
		
		return x*x;
	}
	
	public int countA(String word){
		
		int count = 0;
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)=='a'){
			count++;
			}
			
		}
		return count;
	}
	
	public int cube(int n){
		return n*n*n;		
	}

}
