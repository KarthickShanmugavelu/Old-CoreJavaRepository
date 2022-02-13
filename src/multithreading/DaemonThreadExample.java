package multithreading;

class Mythread2 extends Thread{
	
	@Override
	public void run() {
	
		System.out.println("I am a daemon Thread");
	}
}

public class DaemonThreadExample {
	
	public static void main(String[] args) {
		Mythread2 mob = new Mythread2();
		
		mob.start();
		//mob.setDaemon(true); throws exception
		
	}
	
	
	
}
