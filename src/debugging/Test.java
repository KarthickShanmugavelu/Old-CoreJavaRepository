package debugging;

public class Test {

	public int getNumber() {
		int num= 5;
		 num++;
		 num=num*6;
		 num = num/2;
		 
		 return num;
	}
	
	public void printNum(int n) {
		System.out.println(n);
	}
}
