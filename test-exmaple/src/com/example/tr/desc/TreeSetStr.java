package com.example.tr.desc;



import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetStr {
	public static void main(String[] args) {
		TreeSet<String> tSet = new TreeSet<>(new ComratorDescStr());
		tSet.add("Raja");
		tSet.add("ShobhaRani"); //2 
		tSet.add("RajaKumari"); // 1 2
		tSet.add("GangaBhavani");  
		tSet.add("Ramulamma");  
		
		//[GangaBhavani, Raja, RajaKumari, Ramulamma, ShobhaRani] // desc default
		
		// return i2.compareTo(i1);
		//[ShobhaRani, Ramulamma, RajaKumari, Raja, GangaBhavani] 
		
		// return i1.compareTo(i2);
		
		// [GangaBhavani, Raja, RajaKumari, Ramulamma, ShobhaRani]
		
		// return -i1.compareTo(i2);
		
		// [ShobhaRani, Ramulamma, RajaKumari, Raja, GangaBhavani]
		
		System.out.println(tSet);
		
	}
	
}

class ComratorDescStr implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		String i1 = o1.toString();
		String i2 = o2.toString();
		
			return -i1.compareTo(i2);
		
		
	}
	
}