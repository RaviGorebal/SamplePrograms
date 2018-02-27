package ravi.gorebal;

public class removeACharacter {
	
	public static void main(String args[]) {
	    String str = "this is a test";
	    
	    System.out.println(removeChar(str,'s'));
	  }

	  public static String removeChar(String s, char c) {
	    String r = "";
	    for (int i = 0; i < s.length(); i++) {
	      if (s.charAt(i) != c)
	        r += s.charAt(i);
	    }
	    return r;

	  }

}
