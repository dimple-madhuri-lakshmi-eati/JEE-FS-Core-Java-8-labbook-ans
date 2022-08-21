package lab3;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(str+"|"+getImage(str));

	}

	private static String getImage(String str) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		sb.append(str);
		sb.reverse();
		String str1=sb.toString();
		return str1;
	}

}
