package iteratorsPkg;

import java.util.Iterator;
import java.util.LinkedList;

public class Custom_Iterable_Iterator_Handson {

	public static void main(String[] args) {
		
		LinkedList<String> temp = new LinkedList<>();
		temp.add("sam");
		temp.add("jim");
		temp.add("tom");
		temp.add("john");
		CustomClass obj = new CustomClass(temp);
		
		Iterator<String> iobj = obj.iterator();
		
		System.out.println("***************** Using Iterator *********************");
		while(iobj.hasNext()) {
			System.out.println(iobj.next());
		}

		System.out.println("***************** Using for each *********************");
		for(String str : temp) {
			System.out.println(str);
		}
	}

}
