package passByValueAndReference;

public class PassByValueRerefence {

	public static void main(String[] args) {
		
		Person person = new Person("Jim");
		
		PassByValueRerefence obj = new PassByValueRerefence();
		
		obj.show(person);
		
		System.out.println(person);

	}
	
	public void show(Person person) {
	
		person = new Person("Cream");
		person.setName("Tom");
		System.out.println("Inside method: "+person);
	}

}
