package com.example.tr.desc;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExampleDesc {
	public static void main(String[] args) {
		TreeSet<Integer> tSet = new TreeSet<>(new ComratorDesc());
		tSet.add(2);
		tSet.add(5); //2 
		tSet.add(1); // 1 2
		tSet.add(4);  
		tSet.add(3);  
		
		System.out.println(tSet);
		
	}
	
}

class ComratorDesc implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		Integer i1 = o1;
		Integer i2 = o2;
		if(i1 < i2) {
		 return 1;	
		}else if(i1 > i2) {
			return -1;
		}else {
			return 0;
		}
		
		
	}
	
}