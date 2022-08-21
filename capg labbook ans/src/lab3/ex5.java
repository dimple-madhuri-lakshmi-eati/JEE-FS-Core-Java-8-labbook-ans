package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String arr[]=str.split(".");
		//System.out.println(Arrays.toString(arr));
		int cntw=1,cntl=1;
		//String str1="[^0-9a-zA-Z]";
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==' ' || str.charAt(i)=='.') {
				//System.out.println("increse");
				cntw++;
			}
			if(str.charAt(i)=='.') {
				cntl++;
			}
		}
		System.out.println("number of lines is: "+cntl);
		//String arr1[]=str.split();
		//System.out.println(Arrays.toString(arr1));
		System.out.println("number of words is: "+cntw);
		System.out.println("number of characters is: "+str.length());
	}
}
