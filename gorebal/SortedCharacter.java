package ravi.gorebal;

public class SortedCharacter {
	static String str = "Aa @1BbCc";
	
	   public static void main(String[] args) {
	        str.chars()
	           .sorted()
	           .forEach(ch-> System.out.printf("%c  ", ch));
	            }
}
