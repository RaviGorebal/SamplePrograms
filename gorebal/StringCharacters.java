package ravi.SamplePrograms.gorebal;

public class StringCharacters {
	
	 public static void main(String[] args) {
		    String text = "To be or not to be?";

		    int spaces = 0,
		    vowels = 0, 
		    letters = 0;

		    for (int i = 0; i < text.length(); i++) {
		      char ch = Character.toLowerCase(text.charAt(i));
		      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		        ++vowels;
		      if (Character.isLetter(ch))
		        ++letters;
		      if (Character.isWhitespace(ch))
		        ++spaces;
		      
		     
		    }
		    System.out.println("vowels = "+vowels);
		      System.out.println("letters = "+letters);
		      System.out.println("spaces = "+spaces);
		  }

}
