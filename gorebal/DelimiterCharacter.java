package ravi.gorebal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class DelimiterCharacter {
		
		/*static public String[] split(String str, char delim)
		  {
		      if (str == null) {
		          throw new NullPointerException("str can't be null");
		      }

		      // Note the javadoc on StringTokenizer:
		      //     StringTokenizer is a legacy class that is retained for
		      //     compatibility reasons although its use is discouraged in
		      //     new code.
		      // In other words, if StringTokenizer is ever removed from the JDK,
		      // we need to have a look at String.split() (or java.util.regex)
		      // if it is supported on a JSR169/Java ME platform by then.
		      StringTokenizer st = new StringTokenizer(str, String.valueOf(delim));
		      int n = st.countTokens();
		      String[] s = new String[n];
		      for (int i = 0; i < n; i++) {
		          s[i] = st.nextToken();
		      }
		      return s;
		  }*/
	public static void main(String args[])
	  {		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		Collections.reverse(al);
		System.out.println(al);		
		}
	}

