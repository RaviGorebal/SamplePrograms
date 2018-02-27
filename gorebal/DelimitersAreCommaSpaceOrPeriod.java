package ravi.gorebal;

public class DelimitersAreCommaSpaceOrPeriod {	
	
		public static void main(String[] arg) {
		    String text = "To be or not to be, that is the question.";
		    String delimiters = "[, .]"; // Delimiters are comma, space, and period
		    int[] limits = { 0,-1,2,3,4}; // Limit values to try

		    for (int limit : limits) {
		      System.out.println("\nAnalysis with limit = " + limit);
		      String[] tokens = text.split(delimiters, limit);
		      System.out.println("Number of tokens: " + tokens.length);
		      for (String token : tokens) {
		        System.out.println(token);
		      }
		    }

		  }

		}


