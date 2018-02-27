package ravi.gorebal;

public class MakesTheFirstLetterCapsAndTheRestLowercase {
	
	static public String firstLetterCaps ( String data )
	  {
	      String firstLetter = data.substring(0,1).toUpperCase();
	      String restLetters = data.substring(1).toLowerCase();
	      return firstLetter + restLetters;
	  }
	public static void main(String args[])
	{
		System.out.println(firstLetterCaps("this is a ..."));
	}
	
	
// or    return Character.toUpperCase(string.charAt(0)) + string.substring(1);

}
