package com.employee;

public class Employee implements Comparable<Employee>{
	String name;
	int eid;
	public Employee(String name, int eid) {
		super();
		this.name = name;
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + "]";
	}
	
	@Override
	public int compareTo(Employee obj) {
		int eid1 = this.eid;
		Employee e = obj;
		
		int eid2 = e.eid;
		
		if(eid1 < eid2) {
			return -1;
		}else if(eid1 > eid2) {
			return 1;
		}else {
			return 0;
		}
		
		
	}
	
	

}
