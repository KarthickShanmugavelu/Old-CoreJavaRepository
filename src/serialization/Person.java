package serialization;

import java.io.Serializable;

public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private transient int id;
	private static int count;
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Person.count = count;
	}
	private String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("Executing paramterized constructor");
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]Count is:"+count;
	}
	
	
}
