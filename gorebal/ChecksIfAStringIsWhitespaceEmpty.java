package ravi.SamplePrograms.gorebal;


	public class ChecksIfAStringIsWhitespaceEmpty {
		
		 public static boolean isBlank(String str) {
		      int strLen;
		      if (str == null || (strLen = str.length()) == 0) {
		          return true;
		      }
		      for (int i = 0; i < strLen; i++) {
		          if ((Character.isWhitespace(str.charAt(i)) == false)) {
		              return false;
		          }
		      }
		      return true;
		  }
		 public static void main(String args[])
		 {
			 System.out.println(isBlank("fffff"));   // false
			 System.out.println(isBlank(""));        // true
		 }
	}


