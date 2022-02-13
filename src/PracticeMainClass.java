import java.util.Arrays;

public class PracticeMainClass {
	
	protected PracticeMainClass() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		String s3 = "keep";
		String s4 = "peek";
		
	   String	s1=s3.replaceAll(" ", "");
		String s2=s4.replaceAll(" ", "");
		boolean flag;
		if(s1.length()!= s2.length()) {
			flag=false;
		}
		else
		{
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			flag=Arrays.equals(c1, c2);
		}
		System.out.println(flag);
		if(flag) {
			System.out.println("Anagram");
		}
		
		else {
			System.out.println("Not Anagram");
		}
		
	}

}
