package ravi.gorebal;

public class HelloWorldPrgm {
	
	public static void main(String args[]){
		
		@SuppressWarnings("unused")
		String str = "abc#abc#abc#";		
		
		for(int i=1; i < str.length();i++){		
			
			char ch = str.charAt(i);				
			
			if(ch == '#'){		
				
				System.out.println(ch);				
			}
		}
	
	
	
	}
	

}
