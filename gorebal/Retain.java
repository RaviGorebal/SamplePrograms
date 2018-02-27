package ravi.gorebal;

import java.util.ArrayList;
import java.util.List;

public class Retain {
	
	public static void main(String args[])
	{
	 List<Integer> li=new ArrayList<Integer>();
	 
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);
		//System.out.println(li);
	 List<Integer> li2=new ArrayList<Integer>();

		li2.add(5);
		li2.add(6);
		li2.add(7);
		//li.add(8);
		//System.out.println(li2);
	 List<Integer> li3=new ArrayList<Integer>(li);
	 
		//System.out.println(li3);
		li3.removeAll(li2);
		System.out.println(li3);
		System.out.println(li);
		System.out.println(li2);
	}

}
