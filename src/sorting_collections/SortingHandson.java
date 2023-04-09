package sorting_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		int s1Length = s1.length();
		int s2Length = s2.length();
		if (s1Length < s2Length)
			return 1;
		if (s1Length > s2Length)
			return -1;
		return 0;
	}

}

class AlphabetsComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return -(o1.compareTo(o2));
	}

}

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}

public class SortingHandson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> animals = new ArrayList<>();
		animals.add("zebra");
		animals.add("bear");
		animals.add("ox");
		animals.add("goat");
		animals.add("cat");
		
		Collections.sort(animals);
		
		System.out.println("Ascending order using sort method in Collections"+animals);
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(100);
		numbers.add(10);
		numbers.add(88);
		numbers.add(1001);
		numbers.add(5);
		
		Collections.sort(numbers);
		
		System.out.println("Ascending order of Integers using sort method in Collections"+numbers);
		
		List<String> animals2 = new ArrayList<>();
		animals2.add("hippopotamaus");
		animals2.add("zebras");
		animals2.add("bear");
		animals2.add("ox");
		animals2.add("goatees");
		animals2.add("cat");
		animals2.add("dinousaurarexy");
		
		Collections.sort(animals2,new StringLengthComparator());
		
		System.out.println("Sorting based on length using custom Comparator"+animals2);
		
		Collections.sort(animals2,new AlphabetsComparator());
		
		System.out.println("Descending order using custom Comparator"+animals2);
		
		Collections.sort(numbers,new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return -(o1.compareTo(o2));
			}
			
		});
		
		System.out.println("Descending order of Integers using custom comparator as Ananonymous class"+numbers);
		
		List<Person> obj = new ArrayList<>();
		obj.add(new Person(3,"velu"));
		obj.add(new Person(1,"karthi"));
		obj.add(new Person(2,"rani"));
		obj.add(new Person(4,"santhosh"));
		
		Collections.sort(obj,new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				if(p1.getId()<p2.getId())
					return 1;
				if(p1.getId()>p2.getId())
					return -1;				
				return 0;
			}
		});
		
		System.out.println("Id's Descending order of Custom Class using custom comparator as Ananonymous class"+obj);
		
		Collections.sort(obj,new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});
		
		System.out.println("Name's Ascending order of Custom Class using custom comparator as Ananonymous class"+obj);

	}

}
