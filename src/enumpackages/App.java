package enumpackages;

public class App {

	public static void main(String[] args) {
		
		Animal obj = Animal.DINOSAUR;
		
		System.out.println(Animal.DINOSAUR instanceof Enum);
		switch(obj) {
		case CAT:System.out.println("Meow");
			break;
		case DINOSAUR:System.out.println("Jurassic Park");
			break;
		case DOG:System.out.println("Bow bow");
			break;
		default:
			break;
		
		}
		
		
		  System.out.println(Animal.DOG.getName()); Animal.CAT.setName("Tommy");
		  System.out.println(Animal.CAT.getName());
		  System.out.println(Animal.DINOSAUR.toString());
		  System.out.println(Animal.CAT.name);
		 
		Animal anim2 = Animal.valueOf("CAT");
		System.out.println(anim2);
		

	}

}
