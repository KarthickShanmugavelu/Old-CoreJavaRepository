package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Member{
	
	private int id;
	private String name;
	
	public Member(int id, String name) {
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
		return "Class:Member Id=" + id + ": Name=" + name ;
	}
	
}

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// System.out.println("Executing Comparator");

		int len1 = o1.length();
		int len2 = o2.length();
		if (len1 < len2)
			return 1;
		else if (len1 > len2)
			return -1;
		return 0;
	}

}

public class ComparatorExamples {

	public static void main(String[] args) {

		List<String> animals = new ArrayList<String>();

		animals.add("zebra");
		animals.add("bear");
		animals.add("cat");
		animals.add("yakitoriya");
		animals.add("anabelle");

		Collections.sort(animals, new StringLengthComparator());

		for (String animal : animals) {
			System.out.println(animal);
		}

		List<String> animals2 = new ArrayList<String>(animals);

		System.out.println("****Sorting based on alphabets using Anonymous class****");

		Collections.sort(animals2, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return -o1.compareTo(o2);
			}

		});

		for (String animal : animals2) {
			System.out.println(animal);
		}

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(111);
		numbers.add(19);
		numbers.add(121);
		numbers.add(2131);
		numbers.add(1);
		numbers.add(45);
		
		System.out.println("****Sorting Integers using Anonymous class****");
		Collections.sort(numbers,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return -o1.compareTo(o2);
			}
			
		});

		for (Integer number : numbers) {
			System.out.println(number);
		}
		
		System.out.println("Sorting custom objects");
		
		List<Member> members = new ArrayList<Member>();
		
		members.add(new Member(1,"muthu"));
		members.add(new Member(33,"qwe"));
		members.add(new Member(2,"sad"));
		members.add(new Member(55,"das"));
		members.add(new Member(46,"cas"));
		members.add(new Member(0,"zxc"));
		
		Collections.sort(members,new Comparator<Member>() {

			@Override
			public int compare(Member o1, Member o2) {
				
				return -o1.getName().compareTo(o2.getName());
			}
			
		});
		
		for(Member member:members) {
			System.out.println(member);
		}
		
	}

}
