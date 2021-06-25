package com.example.set;

import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		TreeSet<String> tSet = new TreeSet<>();
		tSet.add("Hi");
		tSet.add("Hello");
		for(String c : tSet) {
			System.out.println(c);
		}
	}
}
