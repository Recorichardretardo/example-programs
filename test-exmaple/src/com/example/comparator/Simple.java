package com.example.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.example.data.Student;

class Simple {

	public static void main(String args[]) {

		List<Student> al = new ArrayList<>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		System.out.println("Sorting by Name");

		Collections.sort(al, new NameComparator());
		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.getRollno() + " " + st.getName() + " " + st.getAge());
		}

		System.out.println("Sorting by age");

		Collections.sort(al, new AgeComparator());
		Iterator<Student> ageSorted = al.iterator();
		while (ageSorted.hasNext()) {
			Student st = ageSorted.next();
			System.out.println(st.getAge() + " " + st.getName() + " " + st.getAge());
		}

	}
}