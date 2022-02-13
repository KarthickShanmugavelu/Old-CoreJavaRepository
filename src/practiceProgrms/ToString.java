package practiceProgrms;

public class ToString {
	
	double id;
	String str1,str2;
	
	public ToString(double id,String str1,String str2){
		this.id=id;
		this.str1=str1;
		this.str2=str2;
}
	public String toString(String param1) {
		System.out.println("String coming as parameter to toString: "+param1);
		return String.format("Id: %3.4f\tString1: %s\tString2: %s\t",id,str1,str2);
	}
	
	public static void main(String[] args) {
		ToString s1= new ToString(7.898989,"I am Karthick","I will try my best");
		System.out.println(s1.toString("Testing parameter"));
	}
	

}
