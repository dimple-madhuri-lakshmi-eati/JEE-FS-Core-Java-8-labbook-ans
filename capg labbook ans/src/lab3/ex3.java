package lab3;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(alterString(str));

	}

	private static String alterString(String str) {
		// TODO Auto-generated method stub
		
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!='a' && arr[i]!='e' && arr[i]!='i' && arr[i]!='o' && arr[i]!='u') {
				arr[i]=(char)(arr[i]+1);
			}
		}
		String str1=new String(arr);
		return str1;
	}

}
