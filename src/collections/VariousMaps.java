package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class VariousMaps {

	public static void main(String[] args) {

		// HashMap maintains no insertion order.
		Map<Integer, String> hashMap = new HashMap<Integer, String>();

		// LinkedHashMap maintains insertion order.
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		// TreeMap maintains natural order.
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		System.out.println("****HashMap****");
		insertAndPrint(hashMap);
		System.out.println("****LinkedHashMap****");
		insertAndPrint(linkedHashMap);
		System.out.println("****TreeMap****");
		insertAndPrint(treeMap);

	}
	
	public static void insertAndPrint(Map<Integer,String> map) {
		
		map.put(1, "Lion");
		map.put(218, "Tiger");
		map.put(6, "cat");
		map.put(13, "swan");
		map.put(24, "pig");
		map.put(76, "penquin");
		
		for(Integer keys:map.keySet()) {
			System.out.println("<"+keys+","+map.get(keys)+">");
		}
		 
	}

}
