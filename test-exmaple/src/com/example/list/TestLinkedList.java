package com.example.list;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("Hi");
		list.add("Hello");
		
		System.out.println(list.get(0));
	}

}
