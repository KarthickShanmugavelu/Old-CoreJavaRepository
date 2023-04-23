
public class Fibinacci_Palindrome {
	
	public static void main(String[] args) {
		int first=0;
		int second=1;
		System.out.println("Fibonacci Series");
		System.out.print(first+ " -> "+second+" -> ");
		int n=0;
		while(n<=5) {
			int next=first+second;
			System.out.print(next+" -> ");
			int temp=second;
			second=next;
			first=temp;
			n++;
		}
		System.out.println("===============================");
		int ip=7947;
		int temp=ip;
		int num=0;
		while(temp>0) {
			num=num*10+temp%10;
			temp=temp/10;
		}
		if(ip==num){
			System.out.println(num+ " is a plaindrome");
		}
		else{
			System.out.println(num+ " is not a plaindrome");
		}
	}

}
