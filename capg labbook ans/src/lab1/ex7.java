package lab1;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(checkNumber(n)) {
			System.out.println(n+" is an increasing number");
		}
		else {
			System.out.println(n+" is not an increasing number");
		}
	}

	private static boolean checkNumber(int n) {
		// TODO Auto-generated method stub
		int y=0;
		while(n>0) {
			int x=n%10;
			y=x;
			if(x>y) {
				return false;
			}
		    n=n/10;
		}
		return true;
	}

}

