import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringPermutation obj =new StringPermutation();
		System.out.println(obj.find_permutation("calm"));
		
		int num=4,fact=1;
		for(int i=num;i>0;i--) {
			System.out.println(i);
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public ArrayList<String> find_permutation(String S) {
		ArrayList<String> res=new ArrayList<String>();
		if(S.length()<=0) 
			return res;
		else
			return permutation(S,0,S.length()-1,res);
		}
		public static ArrayList<String> permutation(String S,int start,int end,ArrayList<String> res){
		if(start==end){
		res.add(S);
		return res;
		}
		else{
		for(int i=start;i<=end;i++){
		S=swap(S,start,i);
		permutation(S,start+1,end,res);
		S=swap(S,start,i);
		}
		}
		Collections.sort(res);
		return res;
		}
		public static String swap(String s,int start,int i){
		char a;
		char []arr=s.toCharArray();
		a=arr[start];
		arr[start]=arr[i];
		arr[i]=a;
		return String.valueOf(arr);
		}
}