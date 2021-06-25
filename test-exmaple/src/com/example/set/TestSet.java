package com.example.set;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("Hi");
		set.add("Hello");
		
		for(String s : set) {
			System.out.println(s);
		}
	}

}
