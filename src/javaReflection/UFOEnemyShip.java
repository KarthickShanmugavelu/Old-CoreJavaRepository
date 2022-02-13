package javaReflection;

public class UFOEnemyShip extends EnemyShip implements InterfaceA,InterfaceB {
	
	private EnemyShip shipfactory;
	
	
	
	public UFOEnemyShip(EnemyShip shipfactory) {
		super();
		this.shipfactory = shipfactory;
		System.out.println("Constructor with EnemyShip type paramter");
	}

	public String getIdcode() {
		return idcode;
	}

	public void setIdcode(String idcode) {
		this.idcode = idcode;
	}

	private String idcode = "100";
	
	public String getPrivate() {
		
		return "How did you get this";
	}
	
	private void pmethod(int p1) {
		System.out.println("Example private Method: "+p1);
	}

	private String getOtherPrivate(int thisInt,String thatString) {
		
		return "How did you get here "+thisInt+" "+thatString;
		
	}
	
	public UFOEnemyShip(int number,String randString) {
		
		System.out.println("You sent: "+number+" "+randString);
	}
}
