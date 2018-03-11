package ravi.gorebal;

import java.io.ObjectInputStream.GetField;
import java.util.Comparator;

public class Employee implements Comparable<Employee>,Comparator<Employee> {
	
	private String name;
	private int age;
	public Employee(String name,int age)
	{
		this.setName(name);
		this.setAge(age);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public Employee()
	{
		
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		return o1.age-o2.age;
	}
	@Override
	public int compareTo(Employee o) {
		
		return this.name.compareTo(o.name);
	}

}
