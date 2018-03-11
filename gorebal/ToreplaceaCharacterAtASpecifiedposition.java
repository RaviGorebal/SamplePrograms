package ravi.gorebal;

public class ToreplaceaCharacterAtASpecifiedposition {
	
	public static void main(String args[]) {
	     String str = "this is a test";
	     System.out.println(replaceCharAt(str, 10, 'p'));
	  }

	  public static String replaceCharAt(String s, int pos, char c) {
		  String str1 = s.substring(0, pos);
		  String str2 = s.substring(pos + 1);
	    return  str1 + c + str2;
	  }

}
