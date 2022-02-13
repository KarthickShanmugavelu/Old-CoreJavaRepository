package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsExamples {
	
	public void doFunctions(Set<String> set1,Set<String> set2) {
		
		Set<String> intersection = new HashSet<>(set1);
		
		intersection.retainAll(set2);
		
		System.out.println("Intersection: "+intersection);
		
		Set<String> difference = new HashSet<String>(set1);
		
		difference.removeAll(set2);
		
		System.out.println("Difference: "+difference);
		
		
		
		
	}

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		Set<String> treeSet = new TreeSet<String>();

		System.out.println("****HashSet no insertion order****");
		insert(hashSet);

		System.out.println("\n****LinkedHashSet maintains insertion order****");
		insert(linkedHashSet);

		System.out.println("\n****Treeset maintains natural order****");
		insert(treeSet);
		
		Set<String> hashSet2 = new HashSet<String>();
		System.out.println("\n"+hashSet2.isEmpty());
		System.out.println(hashSet.contains("panni"));
		
		hashSet2.add("pig");
		hashSet2.add("zebra");
		hashSet2.add("fox");
		hashSet2.add("wolf");
		hashSet2.add("croc");
		
		SetsExamples sob = new SetsExamples();
		sob.doFunctions(hashSet, hashSet2);

	}

	public static void insert(Set<String> set) {
		set.add("pig");
		set.add("mouse");
		set.add("zebra");
		set.add("pig");
		set.add("dinosaur");

		for (String temp : set) {

			System.out.print(temp + ",");

		}
	}

}
