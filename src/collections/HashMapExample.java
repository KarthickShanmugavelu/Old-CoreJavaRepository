package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map1= new HashMap<Integer,String>();
		
		map1.put(1,"Karthick");
		map1.put(2,"TonyStark");
		map1.put(3, "Elon Musk");
		map1.put(4,"Bheem");
		
		System.out.println("The Map values are");
		for(Map.Entry<Integer,String> temp:map1.entrySet()) {
			Integer tempKey=temp.getKey();
			String val=temp.getValue();
			System.out.println("<"+tempKey+", "+val+">");
		}
	}

}
