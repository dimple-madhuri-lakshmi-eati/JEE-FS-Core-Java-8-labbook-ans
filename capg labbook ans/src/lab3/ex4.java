package lab3;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println(modifyNumber(x));
	}

	private static int modifyNumber(int x) {
		// TODO Auto-generated method stub
		String str=Integer.toString(x);
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length()-1;i++) {
			int a=Character.getNumericValue(str.charAt(i));
			int b=Character.getNumericValue(str.charAt(i+1));
			int c=Math.abs(a-b);
			sb.append(c);
		}
		sb.append(str.charAt(str.length()-1));
		String str1=sb.toString();
		int y=Integer.valueOf(str1);
		return y;
	}

}
