package ravi.SamplePrograms.gorebal;

import java.util.Scanner;

public class MatchingSubstrings {
	public static void main(String args[]){
//	String org = "This is a test. This is, too.";
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a String:");
	String org = scan.nextLine();
//    String search = "is";
    Scanner scan1 = new Scanner(System.in);
	System.out.println("Enter a search string:");
	String search = scan1.nextLine();
//    String sub = "was";
    Scanner scan2 = new Scanner(System.in);
	System.out.println("Enter a replace string:");
	String sub = scan2.nextLine();
    String result = "";
    int i;

    do { // replace all matching substrings
      System.out.println(org);
      i = org.indexOf(search);
      if (i != -1) {
        result = org.substring(0, i);
        result = result + sub;
        String  str = org.substring(i + search.length());
        result = result + str;
        org = result;
      }
    } while (i != -1);

  }

}
