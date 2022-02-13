package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Person1 implements Comparable<Person1>{
	
	private String name;

	public Person1(String name) {
		super();
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person1 other = (Person1) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Person1 arg0) {
		
		int len1 = this.name.length();
		int len2 = arg0.name.length();
		
		if (len1<len2)
			return -1;
		else if(len1>len2)
			return 1;
		else
			return this.name.compareTo(arg0.name);
	}
	
	
	
}

public class ComparableExample {

	public static void main(String[] args) {
		
		List<Person1> list = new ArrayList<Person1>();
		Set<Person1> set = new TreeSet<Person1>();
		
		addElements(list);
		addElements(set);
		
		Collections.sort(list);
		
		showElements(list);
		System.out.println("===============");
		showElements(set);

	}
	
	public static void addElements(Collection<Person1> input) {
		
		input.add(new Person1("zam"));
		input.add(new Person1("aap"));
		input.add(new Person1("gym"));
		input.add(new Person1("kip"));
		input.add(new Person1("trip"));
		
	}
	
	public static void showElements(Collection<Person1> input) {
		
		for(Person1 str1:input) {
			System.out.println(str1);
		}
	}

}
