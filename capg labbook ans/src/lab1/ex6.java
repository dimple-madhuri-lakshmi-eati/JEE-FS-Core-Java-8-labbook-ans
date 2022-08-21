package lab1;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			System.out.println("Difference is"+calculateDifference(n));
	}

	private static int calculateDifference(int n) {
		int sum = 0,sum1= 0;
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++) {
			sum1=sum1+(i*i);
			sum=sum+i;
		}
		return sum1-(sum*sum);
	}

}
