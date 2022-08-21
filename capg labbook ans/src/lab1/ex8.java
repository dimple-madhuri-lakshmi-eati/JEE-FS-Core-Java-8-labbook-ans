package lab1;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(checkNumber(n)) {
			System.out.println(n+" is power of 2");
		}
		else {
			System.out.println(n+" is not a power of 2");
		}
	}

	private static boolean checkNumber(int n) {
		// TODO Auto-generated method stub
		while(n>1) {
			if(n%2==0) {
				n=n/2;
				//System.out.println(n);
			}
			else {
				return false;
			}
		}
		return true;
	}

}
