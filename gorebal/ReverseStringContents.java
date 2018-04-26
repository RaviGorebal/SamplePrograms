package ravi.SamplePrograms.gorebal;

public class ReverseStringContents {	
	
//	public static String removeWhiteSpace(String s)
//	  {
//	     String retn = null;
//	     
//	     if (s != null)
//	     {
//	        int len = s.length();
//	        StringBuffer sbuf = new StringBuffer(len);
//	        
//	        for (int i = 0; i < len; i++)
//	        {
//	           char c = s.charAt(i);
//	           
//	          if (!Character.isWhitespace(c))
//	               sbuf.append(c);
//	        }
//	        retn = sbuf.toString();
//	     }
//	     return retn;
//	  }
//	
	public static void main(String args[])
	{
	StringBuffer buffer=null;
	String ss=null;
	
	String s3="ravi is good boy";
	String s4[]=s3.split(" ");
	for(int i=0;i<s4.length;i++)
	{
		 buffer=new StringBuffer(s4[i]);
		 ss=(String) buffer.reverse().toString();
		 System.out.print(ss + " ");
		 
	}
//	buffer.append(ss);
	//StringBuffer buffer2=new StringBuffer();

//				System.out.println(buffer.toString());
	/*StringBuffer buffer;
	
	String s3="A AB ABC ABCD ";
	String s4[]=s3.split(" ");
	for(int i=0;i<s4.length;i++)
	{
		 buffer=new StringBuffer(s4[i]);
		 String ss=(String) buffer.reverse().toString();
	System.out.println(ss);
	}
	
*/	}

}
