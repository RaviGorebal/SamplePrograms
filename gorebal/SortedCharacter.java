package ravi.gorebal;

public class SortedCharacter {
	static String str = "ravi";
	
	   public static void main(String[] args) {
	        str.chars().sorted().forEach(ch-> System.out.printf("%c ", ch));
	            }
}
