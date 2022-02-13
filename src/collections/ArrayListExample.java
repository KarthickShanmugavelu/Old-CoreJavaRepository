package collections;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		ArrayList<Integer> ob = new ArrayList<>();
		
		ob.add(123);
		ob.add(345);
		ob.add(678);
		ob.add(987);
		
		for(int i=0;i<ob.size();i++) {
			System.out.println(ob.get(i));
		}
		
		ob.remove(2);
		System.out.println("Enhanced For loop");
		for(Integer rec:ob) {
			System.out.println(rec);
		}
	}

}
