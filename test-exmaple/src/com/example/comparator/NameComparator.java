package com.example.comparator;

import java.util.Comparator;

import com.example.data.Student;

class NameComparator implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		Student s1 = o1;
		Student s2 = o2;

		return s1.getName().compareTo(s2.getName());
	}
}