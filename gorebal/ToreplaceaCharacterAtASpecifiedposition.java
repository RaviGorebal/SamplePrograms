package ravi.gorebal;

public class ToreplaceaCharacterAtASpecifiedposition {
	
	public static void main(String args[]) {
	     String str = "this is a test";
	     System.out.println(replaceCharAt(str, 5, 'c'));
	  }

	  public static String replaceCharAt(String s, int pos, char c) {
	    return s.substring(0, pos) + c + s.substring(pos + 1);
	  }

}
