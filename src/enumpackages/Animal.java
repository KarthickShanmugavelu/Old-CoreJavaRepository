package enumpackages;

public enum Animal {

	DOG("Spiky"), CAT("Tom"), DINOSAUR("Jurrasic World");

	String name;

	private Animal(String name) {

		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hey everyone I'm " + this.name + " !!!!!";
	}

}
