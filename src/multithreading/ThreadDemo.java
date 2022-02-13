package multithreading;

class MyTask extends Thread{
	
	@Override
	public void run() {
	
		for(int i=0;i<=10;i++) {
			System.out.println("$Sub Thread 1: Printing document: "+i);	
		}
		
	}
	
}

class YourTask implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<=10;i++) {
			System.out.println("*Sub Thread 2:Printing document: "+i);
		}
		
	}
	
}

public class ThreadDemo {

	public static void main(String[] args) {
		
		System.out.println("=====Application started=====");
		
		MyTask obj = new MyTask();
		obj.start();
		
		Runnable r = new YourTask();
		Thread ref = new Thread(r);
		ref.setDaemon(true);
		ref.start();
		
		for(int i=0;i<=10;i++) {
			System.out.println("#MainThred: Printing document: "+i);
		}
		
		
		
		System.out.println("=====Application ended=====");

	}

}
