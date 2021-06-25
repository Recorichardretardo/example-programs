package com.example.comparator;

import java.util.Comparator;

import com.example.data.Student;

class AgeComparator implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		Student s1 =  o1;
		Student s2 =  o2;

		if (s1.getAge() == s2.getAge())
			return 0;
		else if (s1.getAge() < s2.getAge())
			return 1;
		else
			return -1;
	}
}