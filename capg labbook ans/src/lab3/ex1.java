package lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringTokenizer str=new StringTokenizer(sc.next(),",");
		int sum=0;
		while(str.hasMoreTokens()) {
			String str1=str.nextToken();
			sum=sum+Integer.parseInt(str1);
			System.out.println(str1);
			
		}
		System.out.println("sum is: "+sum);
	}

}
