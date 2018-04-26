package ravi.SamplePrograms.gorebal;

import java.util.Comparator;

public class Compare implements Comparator{
	 public Compare(Employee employee, Employee employee2) {
		// TODO Auto-generated constructor stub
	}

	public int compare(Object a, Object b) {
		    String aStr, bStr;

		    aStr = (String) a;
		    bStr = (String) b;

		    
		    return aStr.compareTo(bStr);
		  }

}
