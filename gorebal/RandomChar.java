package ravi.gorebal;

public class RandomChar {
	
	public static void main(String args[])
	{
	String[] stars={ "A" , "B" , "C" , "D" , "E" , "F" }; 

	      int s=(int)(Math.random()*stars.length);
	      System.out.println(stars[s]);
	}

}
