package ravi.gorebal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Emp {
	
	public static void main(String args[])
	{
		String s[]={"E","D","B","A"};
		
		ArrayList<String> arl = new ArrayList<String>();
		arl.add("C");
		arl.addAll(Arrays.asList(s));
		Employee employee=new Employee("X",3);
		Employee employee1=new Employee("c",2);
//		Collections.sort(arl);
		ArrayList<Object> emp = new ArrayList<>();
		emp.add(employee);
		emp.add(employee1);
		Compare comp = new Compare(employee,employee);
//		Collections.sort(emp,comp);
		System.out.println("Values in ArrayList after sort: "+comp);
	}

}


// changes
