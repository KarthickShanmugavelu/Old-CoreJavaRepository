
public class StaticMembers {
	static int a;
	int b;
	final  public int c=45;
	
	static {
		System.out.println("This is static block");
	}
	
	public StaticMembers() {
		this(33,44);
	}
	
	public StaticMembers(int a1, int b1) {
		a=a1;b=b1;
		
	}
	
	 void showA(){
		 
		System.out.println(a+": "+b+": "+c);
	}
	
	  public static void main(String[] args) { StaticMembers.a=98; StaticMembers
	  ob=new StaticMembers(); StaticMembers ob1=new StaticMembers();
	  ob.showA();ob1.showA();
	  
	  
	  
	  }
	 

}
