package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map1= new HashMap<>();
		
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
		
		for(Integer key:map1.keySet()) {
			System.out.println("Key: "+key+" Value: "+map1.get(key));
		}
		
		
		ArrayList name= new ArrayList();
		name.add(10);
		name.add("name");
		name.add(30.66);
		name.add(true);
		name.add('A');
		System.out.println(name);
		
		HashMap map2 = new HashMap<>();
		map2.put(12,"string1");
		map2.put("key1",false);
		
		Iterator<Map.Entry<Object, Object>> itr = map2.entrySet().iterator();
        
        while(itr.hasNext())
        {
             Map.Entry<Object, Object> entry = itr.next();
             System.out.println("Key = " + entry.getKey().toString() + 
                                 ", Value = " + entry.getValue().toString());
        }
	}

}
