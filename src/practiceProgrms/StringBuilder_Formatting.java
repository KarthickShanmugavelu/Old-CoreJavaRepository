package practiceProgrms;

public class StringBuilder_Formatting {
	
	public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("Brookyln 99");
	System.out.println("Using String Builder Constructor: "+sb.toString());
	
	StringBuilder sob = new StringBuilder();
	sob.append("Using append").append(" in StringBuilder: ").append(" Scam1992");
	System.out.print(sob.toString());
	
	//String Formatting
		for(int i=1;i<15;i=i+3) {
			System.out.printf("Width field is %d\n",i);
			
		}
		System.out.printf("Width field is %5d\n",5555555);
		System.out.printf("Float Width & decimal field is %2.2f\n",5.5670);
		System.out.printf("Float Width & decimal field is %3.3f\n",5.5678);
		System.out.printf("Float Width & decimal field is %4.4f\n",5.56789);
		
	}

	
	
	
	
}
