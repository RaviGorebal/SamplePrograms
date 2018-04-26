package ravi.SamplePrograms.gorebal;

public class RemoveCollapseMultipleSpaces {
	
	public static String collapseSpaces(String argStr)
	  {
	      char last = argStr.charAt(0);
	      StringBuffer argBuf = new StringBuffer();

	      for (int cIdx = 0 ; cIdx < argStr.length(); cIdx++)
	      {
	          char ch = argStr.charAt(cIdx);
	          if (ch != ' ' || last != ' ')
	          {
	              argBuf.append(ch);
	              last = ch;
	          }
	      }

	      return argBuf.toString();
	  }
	public static void main(String args[])
	{
		System.out.println(collapseSpaces(" This is Nagaraj yalgod  " ));
	}

}
