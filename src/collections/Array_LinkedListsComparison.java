package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array_LinkedListsComparison {
	
	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		
		doTimings(arrayList,"ArrayList");
		doTimings(linkedList, "LinkedList");
		
	}
	
	public static void doTimings(List<Integer> list,String type) {
		
		for(int i=0;i<1e5;i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		//Add items at end,beginning,middle of list
		for(long i=list.size()-1;i<1000000;i++) {
			//System.out.println("executing");
			list.add(999,50);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: "+(end-start)+"for list type: "+type);
		
	}

}
