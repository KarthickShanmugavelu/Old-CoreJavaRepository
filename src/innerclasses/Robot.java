package innerclasses;

public class Robot {
	
	private int id;
	
	class Brain{
		
		public void think() {
			
			System.out.println("Robot "+id+" is thinking");
			
		}
	}
	
	static class Config {
		
		public void printConfig() {
			
			System.out.println(" Speed 1 THz, Memory 1 ZB");
		}
		
		
	}
	
	public void intro() {
		System.out.println("Hello World I'm robot "+ id);
		final int subid=99;
		int b=88;
		Brain ob = new Brain();
		ob.think();
		class Intelligence{
			
			int c =96;
			
			public void printStat() {
				System.out.println("Robot with Id :"+id+"Sub id: "+subid+"is having iq: "+c);
				System.out.println("b: "+b);
			}
			
		}
		Intelligence ob3 = new Intelligence();
		ob3.printStat();
	}

	public Robot(int id) {
		super();
		this.id = id;
	}

}
