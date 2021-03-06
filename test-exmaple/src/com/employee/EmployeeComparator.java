package com.employee;

import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeComparator {
	public static void main(String[] args) {
		Employee e1 = new Employee("nag",100);
		Employee e2 = new Employee("balaiah",200);
		Employee e3 = new Employee("chiru",50);
		Employee e4 = new Employee("venki",150);
		
		TreeSet<Employee> tSet = new TreeSet<Employee>();
		tSet.add(e1);
		tSet.add(e2);
		tSet.add(e3);
		tSet.add(e4);
		
		// [Employee [name=chiru, eid=50], Employee [name=nag, eid=100], Employee [name=venki, eid=150], Employee [name=balaiah, eid=200]]
		System.out.println(tSet);
		
		TreeSet<Employee> tSet1 = new TreeSet<Employee>(new ComratorExample());
		tSet1.add(e1);
		tSet1.add(e2);
		tSet1.add(e3);
		tSet1.add(e4);
		
		// return s1.compareTo(s2);
		// [Employee [name=balaiah, eid=200], Employee [name=chiru, eid=50], Employee [name=nag, eid=100], Employee [name=venki, eid=150]]
		
		// return -s1.compareTo(s2);
		//[Employee [name=venki, eid=150], Employee [name=nag, eid=100], Employee [name=chiru, eid=50], Employee [name=balaiah, eid=200]]
		System.out.println(tSet1);
	}

}

class ComratorExample implements Comparator<Employee> {

	@Override
	public int compare(Employee obj1, Employee obj2) {
		Employee e1 = obj1;
		Employee e2 = obj2;
		String s1 = e1.name;
		String s2 = e2.name;
		return -s1.compareTo(s2);
	}
	
}
