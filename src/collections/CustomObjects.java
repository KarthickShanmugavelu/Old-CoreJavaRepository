package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Person{
	
	int id;
	@Override
	public String toString() {
		return "{Person [id=" + id + ", name=" + name + "]}";
	}

	String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}




public class CustomObjects {
	
	public static void main(String[] args) {
		
		Person p1 = new Person(1,"sam");
		Person p2 = new Person(2,"tom");
		Person p3 = new Person(3,"jerry");
		Person p4 = new Person(1,"sam");
		
		Map<Person,String> map1 = new HashMap<>();
		map1.put(p1, "Jil");
		map1.put(p2, "Jung");
		map1.put(p3, "Juk");
		map1.put(p4, "Tuk");
		
		Set<Person> set1 = new HashSet<Person>();
		set1.add(p1);
		set1.add(p2);
		set1.add(p3);
		set1.add(p4);
		
		System.out.println("*****HashMap*****");
		for(Person key:map1.keySet()) {
			System.out.println("<"+key+","+map1.get(key)+">");
		}
		
		System.out.println("*****HashSet*****");
		for(Person temp:set1) {
			System.out.println(temp);
		}
		
		
		
		
	}
	
	

}
