package com.example;

import java.util.HashMap;
import java.util.Map;

public class TestExample {
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		Map<String, String> map1 = new HashMap<>();
		map.put("a", "abc");
		map.put("b", "abc");
		map.put("c", "abc");
		map.put("d", "abc");
		map.put("e", "abc");
		
		System.out.println("map : "+map);
		for(String c : map.keySet() ) {
			map1.put(c, map.get(c));	
		}
		
		 for (Map.Entry<String,String> entry : map.entrySet()) {
			 map1.put(entry.getKey(), entry.getValue());	 
		 }
		 
		 for (Map.Entry<String,String> entry : map1.entrySet()) {
			 System.out.println("Key = " + entry.getKey() +
                     ", Value = " + entry.getValue());	 
		 }
		 
		 
		
		
		 System.out.println("key set :"+ map1.keySet());
		 System.out.println("Values : "+ map1.values());
	            
		
		
	}

}
