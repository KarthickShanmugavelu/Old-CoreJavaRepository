package multithreading;

class Printer{
	//Achieving synchronization using synchronized in method call
	//synchronized public void printDocument(int numOfCopies,String docName) {
	 public void printDocument(int numOfCopies,String docName) {	
		for(int i=0;i<numOfCopies;i++) {
			System.out.println("Printing "+docName+" copy number: "+i);
		}
	}
}

class ThisThread extends Thread{
	
	Printer pref;
	
	public ThisThread(Printer pref) {
		this.pref=pref;
	}
	
	@Override
	public void run() {
		synchronized(pref){
		pref.printDocument(10, "Karthick's Profile");
		}
	}
}

class YourThread implements Runnable{

Printer pref;
	
	public YourThread(Printer pref) {
		this.pref=pref;
	}
	
	@Override
	public void run() {
		synchronized (pref) {
			pref.printDocument(10, "Naveen's Profile");
		}
		
	}
	
}

public class MultiThreadingDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("=========Application started============");
		Printer printer = new Printer();
		
		ThisThread ThisThread = new ThisThread(printer);
		
		Runnable runnable = new YourThread(printer);
		Thread yourThread = new Thread(runnable);
		
		//Achieving synchronizaton using join method
		ThisThread.start();
		//ThisThread.join();
		
		yourThread.start();
		//yourThread.setDaemon(true);
		
		System.out.println("=========Application ended============");
		

	}

}
