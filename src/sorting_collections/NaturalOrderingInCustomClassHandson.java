package sorting_collections;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

class Person2 implements Comparable<Person2>{
	private String name;
	
	@Override
	public String toString() {
		return "Person2 [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person2 other = (Person2) obj;
		return Objects.equals(name, other.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person2(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Person2 p1) {
		System.out.println("Name's value in Current obj: "+name);
		System.out.println("Name's value in param obj: "+name);
		return name.compareTo(p1.name);
	}
	
}

public class NaturalOrderingInCustomClassHandson {

	public static void main(String[] args) {
		
		Set<Person2> personSet = new TreeSet<>();
		personSet.add(new Person2("Randy"));
		personSet.add(new Person2("Joe"));
		personSet.add(new Person2("Sue"));
		personSet.add(new Person2("HowardWolowitz"));
		
		
		System.out.println("Natural ordering based on String: "+personSet);
		
	}

}
