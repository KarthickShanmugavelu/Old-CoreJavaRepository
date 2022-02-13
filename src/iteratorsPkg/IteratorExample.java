package iteratorsPkg;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExample {
	
	public static void main(String[] args) {
	
	List<String> list = new LinkedList<String>();
	
	list.add("sam");
	list.add("high");
	list.add("return");
	list.add("suman");
	
	Iterator<String> it = list.iterator();
	
	while(it.hasNext()) {
		String val=it.next();
		
		if(val.equals("suman")) { it.remove(); }
		System.out.println(val);
		}
	
	for(String s1:list) {
		System.out.println(s1);
	}
	}

}
