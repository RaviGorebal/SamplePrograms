package ravi.gorebal;


//from eclipse
public class CapsChar {

	public static void main(String args[]){

//	String str = "ravi";
//
//	String str1 = (str.substring(0,1).toUpperCase()) + str.substring(1, str.length());

	String str = "ravi";
	
	char ch[] = str.toCharArray();
	
	int length = ch.length;
	
	for(int i=0; i<=length;i++){
		
		String str1;
		
		if((i%2)==0){
			 str1 = str.substring(i).toUpperCase();
			
		}else{
			 str1 = str.substring(i).toLowerCase();
		}
		System.out.println(str1);
	}
//	String str1 = str.substring(0,1).toUpperCase();
//	String str2 = str.substring(1, str.length());
//	String str3 = str1 + str2 ;


	}

}
// tsting purpose



