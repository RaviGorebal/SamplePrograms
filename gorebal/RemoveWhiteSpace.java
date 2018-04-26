package ravi.SamplePrograms.gorebal;

public class RemoveWhiteSpace {
	
	 public static String RemoveWhiteSpace(String s)
	  {
	     String retn = null;
	     
	     if (s != null)
	     {
	        int len = s.length();
	        StringBuffer sbuf = new StringBuffer();
	        
	        for (int i = 0; i < len; i++)
	        {
	           char c = s.charAt(i);
	           
	           if (!Character.isWhitespace(c))
	               sbuf.append(c);
	        }
	        retn = sbuf.toString();
	     }
	     return retn;
	  }
	
	public static void main(String args[])
	{
		
	System.out.println(RemoveWhiteSpace("Hello world"));
  
	}

}
